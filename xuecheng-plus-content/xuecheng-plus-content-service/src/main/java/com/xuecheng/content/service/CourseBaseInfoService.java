package com.xuecheng.content.service;

import com.xuecheng.base.model.PageParams;
import com.xuecheng.base.model.PageResult;
import com.xuecheng.content.model.dto.QueryCourseParamsDto;
import com.xuecheng.content.model.po.CourseBase;

/**
 * @Title: CourseBaseInfoService
 * @Author XLW
 * @Package com.xuecheng.content.service
 * @Date 2023/5/27 21:54
 * @description: 课程信息管理接口
 */
public interface CourseBaseInfoService {
    /*
    *
    * 课程分页查询
    *
    * pageParams 分页查询参数
    * queryCourseParamsDto 查询条件
    *   renturn 返回结果
    * */
    PageResult<CourseBase> queryCourseBaseList(PageParams pageParams, QueryCourseParamsDto queryCourseParamsDto);


}
