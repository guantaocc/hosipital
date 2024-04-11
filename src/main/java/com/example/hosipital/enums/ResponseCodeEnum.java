package com.example.hosipital.enums;

import com.example.hosipital.exception.BaseExceptionInterface;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum ResponseCodeEnum implements BaseExceptionInterface{

    // ----------- 通用异常状态码 -----------
    SYSTEM_ERROR(10000, "出错啦，后台小哥正在努力修复中..."),
    PARAM_NOT_VALID(10001, "参数错误"),


    // ----------- 业务异常状态码 -----------
    LOGIN_FAIL(20000, "登录失败"),
    USERNAME_OR_PWD_ERROR(20001, "用户名或密码错误"),
    ;

    // 异常码
    private int code;
    // 错误信息
    private String errorMessage;

}
