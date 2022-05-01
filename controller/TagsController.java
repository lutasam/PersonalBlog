package com.lutasam.blogapi.controller;

import com.lutasam.blogapi.service.TagService;
import com.lutasam.blogapi.vo.Result;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//@RestController代表我们返回的是json数据
//@RequestMapping("tags")表示路径映射
@RestController
@RequestMapping("tags")
public class TagsController {

    @Autowired
    private TagService tagService;

    @GetMapping("hot")
    public Result hot() {
        int limit = 6;
        return tagService.hots(limit);
    }

    @GetMapping
    public Result findAll() {
        return tagService.findAll();
    }

    @GetMapping("detail")
    public Result findAllDetail() {
        return tagService.findAllDetail();
    }

    @GetMapping("detail/{id}")
    public Result findADetailById(@PathVariable("id") Long id) {
        /**
         * 查询所有文章标签下所有的文章
         * 
         * @return
         */
        return tagService.findDetailById(id);
    }

}
