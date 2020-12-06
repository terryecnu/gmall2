package com.java.gmall.pms.controller;

import java.util.Arrays;
import java.util.List;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.java.core.bean.PageVo;
import com.java.core.bean.QueryCondition;
import com.java.core.bean.Resp;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import com.java.gmall.pms.entity.Category;
import com.java.gmall.pms.service.CategoryService;

/**
 * 商品三级分类
 * @author terry
 * @since  2020-05-20 17:00:51
 */
@Api(tags = "商品三级分类 管理")
@RestController
@RequestMapping("pms/category")
public class CategoryController {
    @Autowired
    private CategoryService categoryService;


    @ApiOperation("根据分类等级或者父id查询分类")
    @GetMapping()
    @PreAuthorize("hasAuthority('pms:category:list')")
   public Resp<List<Category>> queryCategoryByPidOrLevel(@RequestParam(value="parentCid", required = false)Long parentCid,
           @RequestParam(value = "level", defaultValue = "0")Integer level){

       List<Category> categories = this.categoryService.fetchCategories(parentCid,level);

       return Resp.ok(categories);
   }

    @ApiOperation("父id查询二级分类及其子分类")
    @GetMapping("{pid}")
    public Resp<List<Category>> querySubCategory(@PathVariable("pid")Long pid){
        List<Category> categoryEntityList = this.categoryService.querySubCategory(pid);
        return Resp.ok(categoryEntityList);
    }


    /**
     * 列表
     */
    @ApiOperation("分页查询(排序)")
    @GetMapping("/list")
    @PreAuthorize("hasAuthority('pms:category:list')")
    public Resp<PageVo> list(QueryCondition queryCondition) {
       // PageVo page = categoryService.queryPage(queryCondition);

        return Resp.ok(null);
    }


    /**
     * 信息
     */
    @ApiOperation("详情查询")
    @GetMapping("/info/{catId}")
    @PreAuthorize("hasAuthority('pms:category:info')")
    public Resp<Category> info(@PathVariable("catId") Long catId){
		Category category = categoryService.getById(catId);

        return Resp.ok(null);
    }

    /**
     * 保存
     */
    @ApiOperation("保存")
    @PostMapping("/save")
    @PreAuthorize("hasAuthority('pms:category:save')")
    public Resp<Object> save(@RequestBody Category category){
		//categoryService.save(category);

        return Resp.ok(null);
    }

    /**
     * 修改
     */
    @ApiOperation("修改")
    @PostMapping("/update")
    @PreAuthorize("hasAuthority('pms:category:update')")
    public Resp<Object> update(@RequestBody Category category){
		//categoryService.updateById(category);

        return Resp.ok(null);
    }

    /**
     * 删除
     */
    @ApiOperation("删除")
    @PostMapping("/delete")
    @PreAuthorize("hasAuthority('pms:category:delete')")
    public Resp<Object> delete(@RequestBody Long[] catIds){
		//categoryService.removeByIds(Arrays.asList(catIds));

        return Resp.ok(null);
    }

}
