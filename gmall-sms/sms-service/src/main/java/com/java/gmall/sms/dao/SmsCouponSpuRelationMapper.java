package com.java.gmall.sms.dao;

import com.java.gmall.sms.entity.SmsCouponSpuRelation;

public interface SmsCouponSpuRelationMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sms_coupon_spu_relation
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sms_coupon_spu_relation
     *
     * @mbg.generated
     */
    int insert(SmsCouponSpuRelation record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sms_coupon_spu_relation
     *
     * @mbg.generated
     */
    int insertSelective(SmsCouponSpuRelation record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sms_coupon_spu_relation
     *
     * @mbg.generated
     */
    SmsCouponSpuRelation selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sms_coupon_spu_relation
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(SmsCouponSpuRelation record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sms_coupon_spu_relation
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(SmsCouponSpuRelation record);
}