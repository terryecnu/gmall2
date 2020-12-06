package com.java.gmall.pms.dao;

import com.java.gmall.pms.entity.Category;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
@Mapper
public interface CategoryMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_category
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Long catId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_category
     *
     * @mbg.generated
     */
    int insert(Category record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_category
     *
     * @mbg.generated
     */
    int insertSelective(Category record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_category
     *
     * @mbg.generated
     */
    Category selectByPrimaryKey(Long catId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_category
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(Category record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_category
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(Category record);

    List<Category> fetchCategories(@Param("parentCid")Long parentCid,@Param("level")Integer level);

    List<Category> querySubCategory(Long catId);
}