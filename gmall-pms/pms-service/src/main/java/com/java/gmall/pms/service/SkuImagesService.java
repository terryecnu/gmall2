package com.java.gmall.pms.service;

import com.java.gmall.pms.entity.SkuImages;

import java.util.List;

public interface SkuImagesService {
    List<SkuImages> queryImagesBySkuId(Long skuId);
}
