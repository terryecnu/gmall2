package com.java.gmall.pms.service;

import com.java.gmall.pms.entity.SkuSaleAttrValue;

import java.util.List;

public interface SkuSaleAttrValueService {
    List<SkuSaleAttrValue> querySkuSaleAttrValueBySpuId(Long spuId);
}
