package com.example.demo.util;

import com.alibaba.fastjson.JSON;

import java.io.Serializable;

public class Result<T> implements Serializable {
    private static final long serialVersionUID = 3152794357612734144L;
    private T data;
    private Meta meta;
    private boolean success;

    public Result() {
        meta = new Meta();
    }

    public static class Meta {
        private int status;
        private String message;

        public int getStatus() {
            return status;
        }

        public void setStatus(int status) {
            this.status = status;
        }

        public String getMessage() {
            return message;
        }

        public void setMessage(String message) {
            this.message = message;
        }
    }

    public static <T> Result<T> success(T data) {
        if (data == null) {
            return Result.success();
        }
        if (!(data instanceof Serializable)) {
            throw new RuntimeException(
                    String.format("class %s must implements java.io.Serializable", data.getClass().getName()));
        }
        Result<T> result = new Result<T>();
        result.success = true;
        Meta meta = new Meta();
        meta.status = 200;
        meta.message = "请求成功";
        result.data = data;
        result.meta = meta;
        return result;
    }

    public static <T> Result<T> success() {
        Result<T> result = new Result<T>();
        result.success = true;
        Meta meta = new Meta();
        meta.status = 200;
        meta.message = "请求成功";
        result.data = null;
        result.meta = meta;
        return result;
    }

    public static <T> Result<T> fail() {
        Result<T> result = new Result<T>();
        result.success = false;
        Meta meta = new Meta();
        meta.status = 500;
        meta.message = "请求失败";
        result.data = null;
        result.meta = meta;
        return result;
    }

    public static <T> Result<T> fail(ErrorCode code) {
        Result<T> result = new Result<T>();
        result.success = false;
        Meta meta = new Meta();
        meta.status = code.getCode();
        meta.message = code.getMessage();
        result.data = null;
        result.meta = meta;
        return result;
    }

    public static <T> Result<T> fail(int status, String message) {
        Result<T> result = new Result<T>();
        result.success = false;
        Meta meta = new Meta();
        meta.status = status;
        meta.message = message;
        result.data = null;
        result.meta = meta;
        return result;
    }


    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public boolean isSuccess() {
        return success;
    }

    public Meta getMeta() {
        return meta;
    }

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
