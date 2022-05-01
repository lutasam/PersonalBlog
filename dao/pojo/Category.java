package com.lutasam.blogapi.dao.pojo;

import lombok.Data;

/**
 * 内容表
 */
@Data
public class Category {
    private Long id;

    private String avatar;

    private String categoryName;

    private String description;
}