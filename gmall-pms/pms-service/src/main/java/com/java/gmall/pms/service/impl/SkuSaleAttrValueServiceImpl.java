package com.java.gmall.pms.service.impl;

import com.java.gmall.pms.dao.SkuInfoMapper;
import com.java.gmall.pms.entity.SkuInfo;
import com.java.gmall.pms.entity.SkuSaleAttrValue;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.stream.Collectors;

public class SkuSaleAttrValueServiceImpl {
    @Autowired
    private SkuInfoMapper skuInfoDao;


    public List<SkuSaleAttrValue> querySkuSaleAttrValueBySpuId(Long spuId) {
        // 查询出所有的sku
        //List<SkuInfo> skuInfoEntities = this.skuInfoDao.selectList(new QueryWrapper<SkuInfo>().eq("spu_id", spuId));
        // 获取所有的skuId
        //List<Long> skuIds = skuInfoEntities.stream().map(skuInfoEntity -> skuInfoEntity.getSkuId()).collect(Collectors.toList());

        // 查询出spu下所有sku对应的销售属性及值
        //List<SkuSaleAttrValue> skuSaleAttrValueEntities = this.list(new QueryWrapper<SkuSaleAttrValue>().in("sku_id", skuIds));

       return null;
    }
}
