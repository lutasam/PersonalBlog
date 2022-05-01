package com.lutasam.blogapi.service;

import com.lutasam.blogapi.vo.CategoryVo;
import com.lutasam.blogapi.vo.Result;

public interface CategoryService {

    CategoryVo findCategoryById(Long categoryId);

    Result findAll();

    Result findAllDetail();

    Result categoriesDetailById(Long id);

}
