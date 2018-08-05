package com.hongghe.netfixdemo.domain;

public enum ApiConstant {

    ERROR(-1, "ERROR"),
    SUCCESS(1, "SUCCESS");

    private Integer code;
    private String message;

    ApiConstant(Integer code, String message) {
        this.code = code;
        this.message = message;
    }

    public Integer getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
