package com.lutasam.blogapi.service;

import java.util.List;

import com.lutasam.blogapi.vo.Result;
import com.lutasam.blogapi.vo.TagVo;

public interface TagService {

    List<TagVo> findTagsByArticleId(Long articleId);

    Result hots(int limit);

    /**
     * 查询所有的 文章标签
     * 
     * @return
     */
    Result findAll();

    Result findAllDetail();

    Result findDetailById(Long id);

}
