package com.java.gmall.sms.dao;

import com.java.gmall.sms.entity.SmsHomeSubjectSpu;

public interface SmsHomeSubjectSpuMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sms_home_subject_spu
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sms_home_subject_spu
     *
     * @mbg.generated
     */
    int insert(SmsHomeSubjectSpu record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sms_home_subject_spu
     *
     * @mbg.generated
     */
    int insertSelective(SmsHomeSubjectSpu record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sms_home_subject_spu
     *
     * @mbg.generated
     */
    SmsHomeSubjectSpu selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sms_home_subject_spu
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(SmsHomeSubjectSpu record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sms_home_subject_spu
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(SmsHomeSubjectSpu record);
}