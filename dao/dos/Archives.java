package com.lutasam.blogapi.dao.dos;

import lombok.Data;

@Data
public class Archives {
    private Integer year;

    private Integer month;

    private Long count;
}
