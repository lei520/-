package com.example.demo.util;

import lombok.*;


@Data
@AllArgsConstructor
@NoArgsConstructor
@RequiredArgsConstructor
public class AjaxResult {

    @NonNull
    private boolean success;
    @NonNull
    private int code;
    @NonNull
    private String message;

    private Object data;


    public static AjaxResult success(){
        return new AjaxResult(true, 200,"操作成功");
    }

    public static AjaxResult success(String message){
        return new AjaxResult(true,200, message);
    }

    public static AjaxResult success(String message,Object data){
        return new AjaxResult(true, 200,message,data);
    }

    public static AjaxResult success(Object data){
        return new AjaxResult(true,200, "操作成功",data);
    }


    public static AjaxResult error(int code){
        return new AjaxResult(false,code, "操作失败");
    }
    public static AjaxResult error(int code,String message){
        return new AjaxResult(false,code,message);
    }

    public static AjaxResult error(String message){
        return new AjaxResult(false,-1, message);
    }

    public static AjaxResult error(int code,String message,Object data){
        return new AjaxResult(false,code, message,data);
    }
}
