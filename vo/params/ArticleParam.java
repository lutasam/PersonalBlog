package com.lutasam.blogapi.vo.params;

import lombok.Data;

import java.util.List;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.ser.std.ToStringSerializer;
import com.lutasam.blogapi.vo.CategoryVo;
import com.lutasam.blogapi.vo.TagVo;

@Data
public class ArticleParam {

    @JsonSerialize(using = ToStringSerializer.class)
    private Long id;

    private ArticleBodyParam body;

    private CategoryVo category;

    private String summary;

    private List<TagVo> tags;

    private String title;
}