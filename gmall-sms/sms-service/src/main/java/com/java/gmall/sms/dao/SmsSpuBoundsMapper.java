package com.java.gmall.sms.dao;

import com.java.gmall.sms.entity.SmsSpuBounds;

public interface SmsSpuBoundsMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sms_spu_bounds
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sms_spu_bounds
     *
     * @mbg.generated
     */
    int insert(SmsSpuBounds record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sms_spu_bounds
     *
     * @mbg.generated
     */
    int insertSelective(SmsSpuBounds record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sms_spu_bounds
     *
     * @mbg.generated
     */
    SmsSpuBounds selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sms_spu_bounds
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(SmsSpuBounds record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sms_spu_bounds
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(SmsSpuBounds record);
}