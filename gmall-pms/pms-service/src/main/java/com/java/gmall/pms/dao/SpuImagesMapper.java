package com.java.gmall.pms.dao;

import com.java.gmall.pms.entity.SpuImages;

public interface SpuImagesMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_spu_images
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_spu_images
     *
     * @mbg.generated
     */
    int insert(SpuImages record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_spu_images
     *
     * @mbg.generated
     */
    int insertSelective(SpuImages record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_spu_images
     *
     * @mbg.generated
     */
    SpuImages selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_spu_images
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(SpuImages record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_spu_images
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(SpuImages record);
}