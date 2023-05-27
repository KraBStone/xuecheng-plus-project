package com.xuecheng.base.model;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.ToString;

/**
 * @Title: PageParams
 * @Author XLW
 * @Package com.xuecheng.base.model
 * @Date 2023/5/26 22:45
 * @description: 分页查询参数
 */

@Data
@ToString
public class PageParams {

    @ApiModelProperty("页码")
    //当前页码
    private Long pageNo = 1L;

    @ApiModelProperty("每页记录数")
    //每页记录数默认值
    private Long pageSize =10L;

    public PageParams(){

    }

    public PageParams(long pageNo,long pageSize){
        this.pageNo = pageNo;
        this.pageSize = pageSize;
    }
}
