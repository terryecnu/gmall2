package com.java.gmall.pms.service.impl;

import com.java.gmall.pms.dao.CategoryMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.java.core.bean.PageVo;
import com.java.core.bean.Query;
import com.java.core.bean.QueryCondition;


import com.java.gmall.pms.entity.Category;
import com.java.gmall.pms.service.CategoryService;

import java.util.List;

@Service("categoryService")
public class CategoryServiceImpl  implements CategoryService {
@Autowired
private CategoryMapper categoryMapper;

    @Override
    public List<Category> fetchCategories(Long parentCid, Integer level) {
        return this.categoryMapper.fetchCategories(parentCid,level);

    }

    @Override
    public Category getById(Long catId) {
        return null;

    }

    @Override
    public List<Category> querySubCategory(Long catId) {
        return this.categoryMapper.querySubCategory(catId);
    }
}