package com.gx.config.Exception;

import lombok.Getter;

@Getter
public enum ExceptionEnum {


    USER_ALERDY_EXIST(1,"当前用户已经存在"),

    TOKEN_EXPIRED(2,"token令牌已经过期");

    private Integer code;

    private String message;

    ExceptionEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }

}
