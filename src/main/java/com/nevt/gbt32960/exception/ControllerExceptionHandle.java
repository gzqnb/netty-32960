package com.nevt.gbt32960.exception;


import com.nevt.gbt32960.common.result.BaseResult;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ControllerExceptionHandle {

    @ExceptionHandler(value = Exception.class)
    public BaseResult<String> exceptionHandler(Exception e) {
        return BaseResult.exception("Request exception cause:" + e.getClass().getSimpleName());
    }

    @ExceptionHandler(value = NullPointerException.class)
    public BaseResult<String> nullException(NullPointerException e) {
        return BaseResult.exception("NullPointerException cause:" + e.getMessage());
    }

}
