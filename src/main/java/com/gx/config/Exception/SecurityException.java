package com.gx.config.Exception;

/**
 * 自定义异常
 */
public class SecurityException extends RuntimeException {

    public SecurityException(ExceptionEnum exceptionEnum){
        super(exceptionEnum.getMessage());
    }

    public SecurityException(String message){
        super(message);
    }

}
