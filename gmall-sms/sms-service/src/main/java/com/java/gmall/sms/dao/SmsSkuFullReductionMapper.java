package com.java.gmall.sms.dao;

import com.java.gmall.sms.entity.SmsSkuFullReduction;

public interface SmsSkuFullReductionMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sms_sku_full_reduction
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sms_sku_full_reduction
     *
     * @mbg.generated
     */
    int insert(SmsSkuFullReduction record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sms_sku_full_reduction
     *
     * @mbg.generated
     */
    int insertSelective(SmsSkuFullReduction record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sms_sku_full_reduction
     *
     * @mbg.generated
     */
    SmsSkuFullReduction selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sms_sku_full_reduction
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(SmsSkuFullReduction record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sms_sku_full_reduction
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(SmsSkuFullReduction record);
}