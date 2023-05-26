package com.xuecheng.content.model.dto;

import lombok.Data;
import lombok.ToString;

/**
 * @Title: QueryCourseParamsDto
 * @Author XLW
 * @Package com.xuecheng.content.model.dto
 * @Date 2023/5/26 22:48
 * @description: 课程查询参数Dto
 */


@Data
@ToString
public class QueryCourseParamsDto {
    //审核状态
    private String auditStatus;
    //课程名称
    private String courseName;
    //发布状态
    private String publishStatus;
}
