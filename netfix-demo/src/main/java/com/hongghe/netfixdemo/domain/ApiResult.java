package com.hongghe.netfixdemo.domain;

import java.util.HashMap;

public class ApiResult {

    private Integer code = ApiConstant.SUCCESS.getCode();
    private String message = ApiConstant.SUCCESS.getMessage();
    private Object data = new HashMap<>();

    public ApiResult(ApiConstant apiConstant) {
        this.code = apiConstant.getCode();
        this.message = apiConstant.getMessage();
    }

    public ApiResult(Integer code, String message, Object data) {
        this.code = code;
        this.message = message;
        this.data = data;
    }

    public ApiResult(ApiConstant apiConstant, Object data) {
        this.code = apiConstant.getCode();
        this.message = apiConstant.getMessage();
        this.data = data;
    }

    public ApiResult(Integer code, ApiConstant apiConstant, Object data) {
        this.code = code;
        this.message = apiConstant.getMessage();
        this.data = data;
    }

    public ApiResult(ApiConstant apiConstant, String message, Object data) {
        this.code = apiConstant.getCode();
        this.message = message;
        this.data = data;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public Integer getCode() {
        return code;
    }
}
