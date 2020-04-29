package com.example.demo.util;

public enum ErrorCode {

    EMPTY_RESULT(404, "查询结果为空", "RESULT"),
    NOT_LOGIN(302, "未登录,请先登录", "PARAM_CHECK"),

    UNKNOWN(1111, "未知错误，请联系开发解决.", "SERVICE_EXCEPTION"),
    SYSTEM_ERROR(9999, "系统错误,请稍后重试", "SERVICE_EXCEPTION"),
    PARAM_ERROR(8888, "请求参数错误", "PARAM_CHECK"),
    PERMISSION_DENIED(6666, "没有权限", "SERVICE_EXCEPTION"),
    ILLEGAL_OPERATION(5555, "非法操作", "SERVICE_EXCEPTION"),
    ;

    private int code;

    private String message;

    private String type;

    ErrorCode(int status, String message, String type) {
        this.code = status;
        this.message = message;
        this.type = type;
    }

    public int getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }

    public String getType() {
        return type;
    }
}
