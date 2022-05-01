package com.lutasam.blogapi.service;

import com.lutasam.blogapi.vo.Result;
import com.lutasam.blogapi.vo.params.CommentParam;

public interface CommentsService {

    /**
     * 根据文章Id 查询所有的评论列表
     * 
     * @param id
     * @return
     */
    Result commentsByArticleId(Long id);

    Result comment(CommentParam commentParam);

}
