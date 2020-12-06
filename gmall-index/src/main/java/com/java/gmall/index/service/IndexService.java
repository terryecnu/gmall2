package com.java.gmall.index.service;


import com.alibaba.fastjson.JSON;
import com.java.core.bean.Resp;
import com.java.gmall.index.annotation.GmallCache;
import com.java.gmall.index.annotation.IndexCache;
import com.java.gmall.index.feign.PmsFeign;
import com.java.gmall.pms.entity.Category;
import org.apache.commons.lang3.StringUtils;
import org.redisson.api.RCountDownLatch;
import org.redisson.api.RLock;
import org.redisson.api.RedissonClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import java.util.List;
import java.util.concurrent.TimeUnit;


import static com.java.core.constants.Constants.CATEGORY_CACHE_KEY_PREFIX;

/**
 * @author jiangli
 * @since 2020/1/17 22:19
 */
@Service
public class IndexService {

	@Autowired
	private PmsFeign pmsFeign;

	@Autowired
	private StringRedisTemplate redisTemplate;
	@Autowired
	private RedissonClient redissonClient;

	public static final String INDEX_CATEGORY = "index:category:";

	public Resp<List<Category>> queryLevel1Categories() {
		/*Resp<List<Category>> listResp = pmsFeign.queryCategoryByPidOrLevel(0L, 1);
		return listResp.getData();*/
		Resp<List<Category>> listResp = pmsFeign.queryCategoryByPidOrLevel(0L, 1);
		return listResp;
	}

	@GmallCache(prefix = CATEGORY_CACHE_KEY_PREFIX)
	public Resp<List<Category>>  queryCategoryVO(Long pid) {

		// 如果缓存中没有则调用远程接口获取
		Resp<List<Category>> subCategoryResp = this.pmsFeign.querySubCategory(pid);
		List<Category> categoryEntities = subCategoryResp.getData();

		Resp<List<Category>> resp = new Resp<>(categoryEntities );
		return resp;
	}

	/*@IndexCache(prefix = INDEX_CATEGORY, timeout = 7200, random = 100)
	public Resp<List<Category>> queryCategoryVO(@PathVariable("pid") Long pid) {
		// 从缓存中获取
		String cacheCategories = this.redisTemplate.opsForValue().get(CATEGORY_CACHE_KEY_PREFIX + pid);
		if (StringUtils.isNotBlank(cacheCategories)){
			// 如果缓存中有，直接返回
			List<Category> categoryEntities = JSON.parseArray(cacheCategories, Category.class);
			Resp<List<Category>> resp = new Resp<>(categoryEntities );
			return resp;
		}

		// 如果缓存中没有则调用远程接口获取
		Resp<List<Category>> subCategoryResp = this.pmsFeign.querySubCategory(pid);
		List<Category> categoryEntities = subCategoryResp.getData();
		Resp<List<Category>> resp = new Resp<>(categoryEntities );

		// 把查询结果放入缓存
		this.redisTemplate.opsForValue().set(CATEGORY_CACHE_KEY_PREFIX + pid, JSON.toJSONString(cacheCategories));

		return resp;

		//List<CategoryVO> categoryVOS;
		// 判断缓存中有没有
*//*		String json = redisTemplate.opsForValue().get(INDEX_CATEGORY + pid);
		if (StrUtil.isNotEmpty(json)) {
			categoryVOS = JSON.parseArray(json, CategoryVO.class);
			return Resp.ok(categoryVOS);
		}*//*

		// 加分布式锁
	*//*	RLock lock = redissonClient.getLock("lock" + pid);
		lock.lock();*//*

		// 加锁之后再判断一次redis中有没有
*//*		String json1 = redisTemplate.opsForValue().get(INDEX_CATEGORY + pid);
		if (StrUtil.isNotEmpty(json1)) {
			categoryVOS = JSON.parseArray(json, CategoryVO.class);
		} else {*//*
		//	categoryVOS = pmsFeign.queryCategoryVO(pid);
			// 存入缓存
	*//*		redisTemplate.opsForValue().set(INDEX_CATEGORY + pid, JSONUtil.toJsonStr(categoryVOS), 7 + new Random().nextInt(5), TimeUnit.DAYS);
		}*//*

		// 释放锁
		*//*lock.unlock();*//*
		//return Resp.ok(categoryVOS);
	}*/

	/*public void testLock() {
		RLock lock = this.redissonClient.getLock("lock"); // 只要锁的名称相同就是同一把锁
		lock.lock(); // 加锁

		// 执行业务逻辑代码
		// 查询redis中的num值
		String value = this.redisTemplate.opsForValue().get("num");
		// 没有该值return
		if (StrUtil.isEmpty(value)) {
			return;
		}
		// 有值就转成成int
		int num = Integer.parseInt(value);
		// 把redis中的num值+1
		this.redisTemplate.opsForValue().set("num", String.valueOf(++num));

		// 释放锁资源
		lock.unlock(); // 解锁
	}*/

    /*public void testLock() {
    	String uuid = UUID.randomUUID().toString();
    	//1.
		Boolean lock = this.redisTemplate.opsForValue().setIfAbsent("lock",uuid,30, TimeUnit.SECONDS);
		// 查询redis中的num值
		String value = this.redisTemplate.opsForValue().get("num");
		if(lock){
			if (StringUtils.isBlank(value)){
				this.redisTemplate.opsForValue().set("num", "1");
				// return ;
			}else{
				// 有值就转成成int
				int num = Integer.parseInt(value);
				// 把redis中的num值+1
				this.redisTemplate.opsForValue().set("num", String.valueOf(++num));
			}
			if(StringUtils.equals(this.redisTemplate.opsForValue().get("lock"),uuid)){
				//String script = "if redis.call('get', KEYS[1]) == ARGV[1] then return redis.call('del', KEYS[1]) else return 0 end";
				this.redisTemplate.delete("lock");
			}

		}else{
			try{
				Thread.sleep(1000);
				testLock();
			}catch(Exception e){
				e.printStackTrace();
			}

		}

    }*/

    /*public void testLock(){
    	RLock lock = this.redissonClient.getLock("lock");
    	lock.lock();
    	String value = this.redisTemplate.opsForValue().get("num");
    	if(StringUtils.isBlank(value)){
    		return;
		}
		int num = Integer.parseInt(value);
    	this.redisTemplate.opsForValue().set("num",String.valueOf(++num));
    	lock.unlock();
	}*/

	public void testLock() throws InterruptedException {
		RLock lock = this.redissonClient.getLock("lock");
		boolean res = lock.tryLock(100, 10, TimeUnit.SECONDS);
		if (res) {
			try {
				String value = this.redisTemplate.opsForValue().get("num");
				if (StringUtils.isBlank(value)) {
					return;
				}
				int num = Integer.parseInt(value);
				this.redisTemplate.opsForValue().set("num", String.valueOf(++num));

			} finally {
				lock.unlock();
			}
		}





	}



	public String testMain() throws InterruptedException {
		RCountDownLatch latch = this.redissonClient.getCountDownLatch("latch");
		latch.trySetCount(5L);

		latch.await();
		return "主业务开始执行";

	}

	public String testSub() {
		RCountDownLatch latch = this.redissonClient.getCountDownLatch("latch");
		latch.countDown();

		return "分支业务执行了一次";
	}

	//@Override
	public String latch() {
		RCountDownLatch countDownLatch = this.redissonClient.getCountDownLatch("countdown");
		try {
			String count = this.redisTemplate.opsForValue().get("count");
			countDownLatch.trySetCount(Integer.parseInt(count));
			countDownLatch.await();

			return "关门了。。。。。";
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return null;
	}

	//@Override
	public String countDown() {
		RCountDownLatch countDownLatch = this.redissonClient.getCountDownLatch("countdown");

		String countString = this.redisTemplate.opsForValue().get("count");
		int count = Integer.parseInt(countString);
		this.redisTemplate.opsForValue().set("count", String.valueOf(--count));
		countDownLatch.countDown();
		return "还剩下" + count + "人。。。";
	}



}
