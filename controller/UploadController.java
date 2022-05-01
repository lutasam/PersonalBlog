package com.lutasam.blogapi.controller;

import java.util.UUID;

import com.lutasam.blogapi.utils.QiniuUtils;
import com.lutasam.blogapi.vo.ErrorCode;
import com.lutasam.blogapi.vo.Result;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

@RestController
@RequestMapping("upload")
public class UploadController {

    @Autowired
    private QiniuUtils qiniuUtils;

    @PostMapping
    public Result upload(@RequestParam("image") MultipartFile file) {
        // 原始文件名称
        String originalFilename = file.getOriginalFilename();
        // 唯一文件名称
        String fileName = UUID.randomUUID().toString() + "." + StringUtils.substringAfterLast(originalFilename, ".");
        // 上传文件
        // 上传到云服务器 降低自身应用服务器的带宽消耗
        boolean upload = qiniuUtils.upload(file, fileName);
        if (upload) {
            return Result.success(QiniuUtils.url + fileName);
        }
        return Result.fail(ErrorCode.UPLOAD_FAIL.getCode(), ErrorCode.UPLOAD_FAIL.getMsg());
    }
}
