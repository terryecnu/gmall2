package com.java.gmall.pms.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.java.gmall.pms.entity.Category;
import com.java.core.bean.PageVo;
import com.java.core.bean.QueryCondition;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 商品三级分类
 *
 * @author terry
 * @since  2020-05-20 17:00:51
 */
public interface CategoryService  {

   // PageVo queryPage(QueryCondition params);

    List<Category> fetchCategories(Long parentCid, Integer level);

    Category getById(Long catId);

    List<Category> querySubCategory(Long pid);
}

