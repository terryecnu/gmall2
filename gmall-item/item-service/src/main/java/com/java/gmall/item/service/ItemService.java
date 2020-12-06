package com.java.gmall.item.service;

import com.java.core.bean.Resp;
import com.java.core.exception.RRException;
import com.java.gmall.item.feign.PmsFeign;
import com.java.gmall.item.feign.SmsFeign;
import com.java.gmall.item.vo.ItemVO;
import com.java.gmall.pms.entity.*;
import com.java.gmall.pms.vo.BaseGroupVO;
import com.java.gmall.sms.vo.SaleVO;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.stream.Collectors;

/**
 * @author jiangli
 * @since 2020/1/26 13:29
 */
@Service
public class ItemService {
	@Autowired
	private PmsFeign pmsFeign;
	@Autowired
	private SmsFeign smsFeign;
	@Autowired
	private ThreadPoolExecutor threadPoolExecutor;


	public ItemVO queryItem(Long skuId) {

		ItemVO itemVO = new ItemVO();

		// 1. 获取sku的基本信息
		Resp<SkuInfo> skuInfoEntityResp = pmsFeign.querySkuBySkuId(skuId);
		SkuInfo skuInfoEntity = skuInfoEntityResp.getData();
		if (skuInfoEntity != null) {
			BeanUtils.copyProperties(skuInfoEntity, itemVO);
		}

		//2.获取图片信息
		Resp<List<SkuImages>> listResp = this.pmsFeign.queryImagesBySkuId(skuId);
		List<SkuImages> images = listResp.getData();
		if(!CollectionUtils.isEmpty(images)){
            List<String> imageUrls = images.stream().map(image -> image.getImgUrl()).collect(Collectors.toList());
            itemVO.setPics(imageUrls);
		}

		// 3. 获取sku的促销信息 TODO
		//Resp<List<>>



	/*	// 2. 获取sku的图片信息
		Resp<List<SkuImages>> listResp = this.pmsFeign.queryImagesBySkuId(skuId);
		List<SkuImages> images = listResp.getData();
		if (!CollectionUtils.isEmpty(images)){
			List<String> imageUrls = images.stream().map(image -> image.getImgUrl()).collect(Collectors.toList());
			itemVO.setPics(imageUrls);
		}

		// 3. 获取sku的促销信息 TODO

		// 4. 获取spu的所有销售属性
		Resp<List<SkuSaleAttrValue>> skuSaleAttrValueResp = this.pmsFeign.querySkuSaleAttrValueBySpuId(skuInfoEntity.getSpuId());
		List<SkuSaleAttrValue> skuSaleAttrValueEntities = skuSaleAttrValueResp.getData();
		itemVO.setSaleAttrs(skuSaleAttrValueEntities);

		// 5. 获取规格参数组及组下的规格参数 TODO
*/
		return itemVO;
	}


}
