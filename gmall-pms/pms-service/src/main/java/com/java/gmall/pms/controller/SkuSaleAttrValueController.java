package com.java.gmall.pms.controller;

import com.java.core.bean.Resp;
import com.java.gmall.pms.entity.SkuSaleAttrValue;
import com.java.gmall.pms.service.SkuSaleAttrValueService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
/**
 * sku销售属性
 * @author terry
 * @since  2020-05-20 17:00:51
 */
@Api(tags = "sku销售属性管理")
@RestController
@RequestMapping("pms/skuSaleAttrValue")
public class SkuSaleAttrValueController {

    private SkuSaleAttrValueService skuSaleAttrValueService;

    @ApiOperation("查询spu的所有销售属性")
    @GetMapping("/{spuId}")
    public Resp<List<SkuSaleAttrValue>> querySkuSaleAttrValueBySpuId(@PathVariable("spuId")Long spuId) {

        List<SkuSaleAttrValue> skuSaleAttrValueEntities = this.skuSaleAttrValueService.querySkuSaleAttrValueBySpuId(spuId);

        return Resp.ok(skuSaleAttrValueEntities);
    }
}
