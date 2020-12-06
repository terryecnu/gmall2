package com.java.gmall.pms.service.impl;

import com.java.gmall.pms.dao.SkuImagesMapper;
import com.java.gmall.pms.entity.SkuImages;
import com.java.gmall.pms.service.SkuImagesService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class SkuImagesServiceImpl implements SkuImagesService {
    @Autowired
    private SkuImagesMapper skuImagesMapper;

    @Override
    public List<SkuImages> queryImagesBySkuId(Long skuId) {
        return  this.skuImagesMapper.queryImagesBySkuId(skuId);

    }
}
