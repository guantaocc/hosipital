package com.example.hosipital.exception;

/**
 * @author: 犬小哈
 * @url: www.quanxiaoha.com
 * @date: 2023-08-15 9:54
 * @description: 通用异常接口
 **/
public interface BaseExceptionInterface {
    int getCode();

    String getErrorMessage();
}
