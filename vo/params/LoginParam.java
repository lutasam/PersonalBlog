package com.lutasam.blogapi.vo.params;

import lombok.Data;

@Data
public class LoginParam {
    private String account;

    private String password;

    private String nickname;
}
