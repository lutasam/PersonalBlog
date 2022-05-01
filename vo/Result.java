package com.lutasam.blogapi.vo;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Result {
    private boolean success;

    private int code;

    private String msg;

    private Object data;

    /**
     * 方法成功
     * 
     * @param data 要传输的数据
     * @return 结果集
     */
    public static Result success(Object data) {
        return new Result(true, 200, "success", data);
    }

    /**
     * 方法失败
     * 
     * @param code 错误码
     * @param msg  错误信息
     * @return 结果集
     */
    public static Result fail(int code, String msg) {
        return new Result(false, code, msg, null);
    }
}
