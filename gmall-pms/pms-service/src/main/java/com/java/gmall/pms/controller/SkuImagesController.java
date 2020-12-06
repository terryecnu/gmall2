package com.java.gmall.pms.controller;

import com.java.core.bean.Resp;
import com.java.gmall.pms.entity.SkuImages;
import com.java.gmall.pms.service.SkuImagesService;
import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * 商品三级分类
 * @author terry
 * @since  2020-05-20 17:00:51
 */
@Api(tags = "sku图片查询")
@RestController
@RequestMapping("pms/skuImages")
public class SkuImagesController {

    private SkuImagesService skuImagesService;

    @GetMapping("{skuId}")
    public Resp<List<SkuImages>> queryImagesBySkuId(@PathVariable("skuId") Long skuId){
        List<SkuImages> imagesEntities = this.skuImagesService.queryImagesBySkuId(skuId);

        return Resp.ok(null);
    }
}
