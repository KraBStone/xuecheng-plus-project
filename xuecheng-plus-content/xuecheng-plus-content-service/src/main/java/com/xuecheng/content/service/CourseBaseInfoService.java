package com.xuecheng.content.service;

import com.xuecheng.base.model.PageParams;
import com.xuecheng.base.model.PageResult;
import com.xuecheng.content.model.dto.AddCourseDto;
import com.xuecheng.content.model.dto.CourseBaseInfoDto;
import com.xuecheng.content.model.dto.QueryCourseParamsDto;
import com.xuecheng.content.model.po.CourseBase;
import org.springframework.web.bind.annotation.RequestBody;

/**
 * @Title: CourseBaseInfoService
 * @Author XLW
 * @Package com.xuecheng.content.service
 * @Date 2023/5/27 21:54
 * @description: 课程信息管理接口
 */
public interface CourseBaseInfoService {
    /**
     *
     * @param pageParams 分页查询参数
     * @param queryCourseParamsDto 查询条件
     * @return 返回结果
     */
    public PageResult<CourseBase> queryCourseBaseList(PageParams pageParams, QueryCourseParamsDto queryCourseParamsDto);


    /**
     *
     * @param companyId 机构ID
     * @param addCourseDto 课程信息
     * @return 课程详细信息
     */
    public CourseBaseInfoDto createCourseBase(Long companyId,AddCourseDto addCourseDto);

    /**
     *
     * @param courseId 课程ID
     * @return 课程详细信息
     */
    public CourseBaseInfoDto getCourseBaseInfo(Long courseId);


}
