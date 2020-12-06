package com.java.gmall.pms.service.impl;

import com.java.core.bean.PageVo;
import com.java.core.bean.QueryCondition;
import com.java.gmall.pms.dao.SkuInfoMapper;
import com.java.gmall.pms.entity.SkuInfo;
import com.java.gmall.pms.service.SkuInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service("skuInfoService")
public class SkuInfoServiceImpl implements SkuInfoService {
    @Autowired
    private SkuInfoMapper skuInfoMapper;
    @Override
    public PageVo queryPage(QueryCondition params) {
        return null;
    }

    @Override
    public SkuInfo querySkuBySkuId(Long skuId) {
        return this.skuInfoMapper.querySkuBySkuCode(skuId);
    }

    @Override
    public SkuInfo querySkuBySkuCode(Long skuCode) {
        return this.skuInfoMapper.querySkuBySkuCode(skuCode);
    }


}