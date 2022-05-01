package com.lutasam.blogapi.controller;

import com.lutasam.blogapi.common.aop.LogAnnotation;
import com.lutasam.blogapi.common.cache.Cache;
import com.lutasam.blogapi.service.ArticleService;
import com.lutasam.blogapi.vo.Result;
import com.lutasam.blogapi.vo.params.ArticleParam;
import com.lutasam.blogapi.vo.params.PageParams;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//json数据交互
@RestController
@RequestMapping("articles")
public class ArticleController {

    @Autowired
    private ArticleService articleService;

    /**
     * 首页 文章列表
     * 
     * @param pageParams
     * @return
     */
    @PostMapping
    @LogAnnotation(module = "文章", operation = "获取文章列表")
    // @Cache(expire = 5 * 60 * 1000, name = "list_article")
    public Result listArticles(@RequestBody PageParams pageParams) {
        return articleService.listArticle(pageParams);
    }

    /**
     * 首页 最热文章
     * 
     * @return
     */
    @PostMapping("hot")
    // @Cache(expire = 5 * 60 * 1000, name = "hot_article")
    public Result hotArticles() {
        int limit = 5;
        return articleService.hotArticle(limit);
    }

    /**
     * 首页 最新文章
     * 
     * @return
     */
    @PostMapping("new")
    // @Cache(expire = 5 * 60 * 1000, name = "new_article")
    public Result newArticles() {
        int limit = 5;
        return articleService.newArticle(limit);
    }

    /**
     * 首页 最新文章
     * 
     * @return
     */
    @PostMapping("listArchives")
    public Result listArchives() {
        return articleService.listArchives();
    }

    @PostMapping("view/{id}")
    public Result findArticleById(@PathVariable("id") Long articleId) {
        return articleService.findArticleById(articleId);
    }

    @PostMapping("publish")
    public Result publish(@RequestBody ArticleParam articleParam) {
        return articleService.publish(articleParam);
    }
}
