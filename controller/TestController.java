package com.lutasam.blogapi.controller;

import com.lutasam.blogapi.dao.pojo.SysUser;
import com.lutasam.blogapi.utils.UserThreadLocal;
import com.lutasam.blogapi.vo.Result;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("test")
public class TestController {

    @RequestMapping
    public Result test() {
        SysUser sysUser = UserThreadLocal.get();
        System.out.println(sysUser);
        return Result.success(null);
    }

}