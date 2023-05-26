package com.xuecheng.base.model;


import java.util.List;
import lombok.Data;
import lombok.ToString;

import java.io.Serializable;

/**
 * @Title: PageResult
 * @Author XLW
 * @Package com.xuecheng.base.model
 * @Date 2023/5/26 22:51
 * @description: 分页查询结果
 */
@Data
@ToString
public class PageResult<T> implements Serializable {

    // 数据列表
    private List<T> items;

    //总记录数
    private long counts;

    //当前页码
    private long page;

    //每页记录数
    private long pageSize;

    public PageResult(List<T> items, long counts, long page, long pageSize) {
        this.items = items;
        this.counts = counts;
        this.page = page;
        this.pageSize = pageSize;
    }



}