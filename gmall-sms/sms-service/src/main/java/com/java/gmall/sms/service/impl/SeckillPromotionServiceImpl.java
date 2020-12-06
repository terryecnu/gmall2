package com.java.gmall.sms.service.impl;

import com.java.gmall.sms.dao.SmsSeckillPromotionMapper;
import com.java.gmall.sms.entity.SmsCustPromotion;
import com.java.gmall.sms.entity.SmsSeckillPromotion;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.java.core.bean.PageVo;
import com.java.core.bean.QueryCondition;
import com.java.gmall.sms.service.SeckillPromotionService;

import java.util.List;

@Service("seckillPromotionService")
public class SeckillPromotionServiceImpl implements SeckillPromotionService {
 @Autowired
 private SmsSeckillPromotionMapper smsSeckillPromotionMapper;
    @Override
    public PageVo queryPage(QueryCondition params) {
      return null;
    }

    public List<SmsCustPromotion> selectPromotionInfoBySKUId(Long skuid){
        return this.smsSeckillPromotionMapper.selectPromotionInfoBySKUId(skuid);

    }

    @Override
    public SmsSeckillPromotion SmsSeckillPromotion(Long skuId) {
        return this.smsSeckillPromotionMapper.selectByPrimaryKey(skuId);
    }

}