package com.java.gmall.pms.dao;

import com.java.gmall.pms.entity.AttrGroup;

public interface AttrGroupMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_attr_group
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Long attrGroupId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_attr_group
     *
     * @mbg.generated
     */
    int insert(AttrGroup record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_attr_group
     *
     * @mbg.generated
     */
    int insertSelective(AttrGroup record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_attr_group
     *
     * @mbg.generated
     */
    AttrGroup selectByPrimaryKey(Long attrGroupId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_attr_group
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(AttrGroup record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_attr_group
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(AttrGroup record);
}