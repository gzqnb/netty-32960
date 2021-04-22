package com.nevt.gbt32960.common.result;

import com.nevt.gbt32960.common.enums.ResultEnum;

public class BaseResult<T> {

    private int code;

    private String message;

    private T data;

    public BaseResult(int code, String message, T data){
        this.code = code;
        this.message = message;
        this.data = data;
    }

    public BaseResult(int code, String message) {
        this(code,message,null);
    }

    public static <T> BaseResult<T> success(T data) {
        return new BaseResult<>(ResultEnum.SUCCESS.value(), ResultEnum.SUCCESS.getReasonPhrase(),data);
    }

    public static <T> BaseResult<T> error(T data) {
        return new BaseResult<>(ResultEnum.ERROR.value(), ResultEnum.ERROR.getReasonPhrase(),data);
    }

    public static <T> BaseResult<T> exception(T data) {
        return new BaseResult<>(ResultEnum.EXCEPTION.value(), ResultEnum.EXCEPTION.getReasonPhrase(),data);
    }

    public static <T> BaseResult<T> custom(int value, String reasonPhrase, T data) {
        return new BaseResult<>(value,reasonPhrase,data);
    }

    public static <T> BaseResult<T> nullData() {
        return new BaseResult<>(3000,"not data");
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "BaseResult{" +
                "code=" + code +
                ", message='" + message + '\'' +
                ", data=" + data +
                '}';
    }
}
