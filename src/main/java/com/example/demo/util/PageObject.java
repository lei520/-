package com.example.demo.util;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * 分页包装对象
 *
 * @param <T>
 */
@Data
public class PageObject<T> implements Serializable {
    private static final long serialVersionUID = 3398518678970845452L;

    /**
     * list
     */
    private List<T> dataList;
    /**
     * 当前分页	，从1开始
     */
    private int page = 1;
    /**
     * 页面大小
     */
    private int size;
    /**
     * 总数
     */
    private long total = 0;

    public PageObject() {

    }

    public PageObject(List<T> dataList, BasePageQuery query, long total) {
        this.dataList = dataList;
        this.page = query.getPage();
        this.size = query.getSize();
        this.total = total;
    }

    public PageObject(List<T> dataList, int page, int size, long total) {
        this.dataList = dataList;
        this.page = page;
        this.size = size;
        this.total = total;
    }

    public long getTotalPage() {
        if (this.total > 0 && size > 0) {
            return this.total % this.size == 0 ? this.total / this.size : this.total / this.size + 1;
        }
        return 0L;
    }
}