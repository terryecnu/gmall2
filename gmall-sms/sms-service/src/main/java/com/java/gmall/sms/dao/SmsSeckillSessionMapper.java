package com.java.gmall.sms.dao;

import com.java.gmall.sms.entity.SmsSeckillSession;

public interface SmsSeckillSessionMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sms_seckill_session
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sms_seckill_session
     *
     * @mbg.generated
     */
    int insert(SmsSeckillSession record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sms_seckill_session
     *
     * @mbg.generated
     */
    int insertSelective(SmsSeckillSession record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sms_seckill_session
     *
     * @mbg.generated
     */
    SmsSeckillSession selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sms_seckill_session
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(SmsSeckillSession record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sms_seckill_session
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(SmsSeckillSession record);
}