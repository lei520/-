package com.example.demo.util;

import lombok.Data;

import java.io.Serializable;

/**
 * 分页查询基类
 */
@Data
public class BasePageQuery implements Serializable {
    private static final long serialVersionUID = 3048792057530619039L;

    public static final Integer DEFAULT_PAGE_SIZE = 20;

    /**
     * 当前分页，从1开始
     */
    private Integer page = 1;

    /**
     * 页面大小
     */
    private Integer size = DEFAULT_PAGE_SIZE;

    /**
     * DB 查询 offset 值
     */
    public Integer getOffset() {
        return (page - 1) * size;
    }
}
