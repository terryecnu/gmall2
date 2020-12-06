package com.java.gmall.index.aspect;

import com.alibaba.fastjson.JSON;
import com.java.gmall.index.annotation.GmallCache;
import org.apache.commons.lang.StringUtils;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.reflect.MethodSignature;
import org.redisson.api.RLock;
import org.redisson.api.RedissonClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
@Aspect
public class GmallCacheAspect {

    @Autowired
    private StringRedisTemplate redisTemplate;

    @Autowired
    private RedissonClient redissonClient;

    /**
     * 1.返回值object
     * 2.参数proceedingJoinPoint
     * 3.抛出异常Throwable
     * 4.proceedingJoinPoint.proceed(args)执行业务方法
     */
    @Around(value = "@annotation(com.java.gmall.index.annotation.GmallCache)")
    public Object cacheAroundAdvice(ProceedingJoinPoint point) throws Throwable {

        Object result = null;
        // 获取连接点签名
        MethodSignature signature = (MethodSignature) point.getSignature();
        // 获取连接点的GmallCache注解信息
        GmallCache gmallCache = signature.getMethod().getAnnotation(GmallCache.class);
        // 获取缓存的前缀
        String prefix = gmallCache.prefix();

        // 组装成key
        String key = prefix + Arrays.asList(point.getArgs()).toString();

        // 1. 查询缓存
        result = this.cacheHit(signature, key);

        if (result != null) {
            return result;
        }

        // 初始化分布式锁
        RLock lock = this.redissonClient.getLock("gmallCache");
        // 防止缓存穿透 加锁
        lock.lock();

        // 再次检查内存是否有，因为高并发下，可能在加锁这段时间内，已有其他线程放入缓存
        result = this.cacheHit(signature, key);
        if (result != null) {
            lock.unlock();
            return result;
        }

        // 2. 执行查询的业务逻辑从数据库查询
        result = point.proceed(point.getArgs());
        // 并把结果放入缓存
        this.redisTemplate.opsForValue().set(key, JSON.toJSONString(result));

        // 释放锁
        lock.unlock();

        return result;
    }

    /**
     * 查询缓存的方法
     *
     * @param signature
     * @param key
     * @return
     */
    private Object cacheHit(MethodSignature signature, String key) {
        // 1. 查询缓存
        String cache = this.redisTemplate.opsForValue().get(key);
        if (StringUtils.isNotBlank(cache)) {
            // 有，则反序列化，直接返回
            Class returnType = signature.getReturnType(); // 获取方法返回类型
            // 不能使用parseArray<cache, T>，因为不知道List<T>中的泛型
            return JSON.parseObject(cache, returnType);
        }
        return null;
    }
}

