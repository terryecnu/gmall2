package com.java.gmall.pms.dao;

import com.java.gmall.pms.entity.SkuImages;

import java.util.List;

public interface SkuImagesMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_sku_images
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_sku_images
     *
     * @mbg.generated
     */
    int insert(SkuImages record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_sku_images
     *
     * @mbg.generated
     */
    int insertSelective(SkuImages record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_sku_images
     *
     * @mbg.generated
     */
    SkuImages selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_sku_images
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(SkuImages record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_sku_images
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(SkuImages record);

    List<SkuImages> queryImagesBySkuId(Long skuId);
}