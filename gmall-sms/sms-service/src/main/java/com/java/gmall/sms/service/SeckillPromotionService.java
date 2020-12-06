package com.java.gmall.sms.service;


import com.java.core.bean.PageVo;
import com.java.core.bean.QueryCondition;
import com.java.gmall.sms.entity.SmsCustPromotion;
import com.java.gmall.sms.entity.SmsSeckillPromotion;

import java.util.List;

/**
 * 秒杀活动
 *
 * @author terry
 * @since  2020-05-22 16:32:09
 */
public interface SeckillPromotionService {

    PageVo queryPage(QueryCondition params);

    List<SmsCustPromotion> selectPromotionInfoBySKUId(Long skuid);

    SmsSeckillPromotion SmsSeckillPromotion(Long skuId);
}

