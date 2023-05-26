package com.xuecheng.content.api;

import com.xuecheng.base.model.PageParams;
import com.xuecheng.base.model.PageResult;
import com.xuecheng.content.model.dto.QueryCourseParamsDto;
import com.xuecheng.content.model.po.CourseBase;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Title: CourseBaseInfoController
 * @Author XLW
 * @Package com.xuecheng.content.api
 * @Date 2023/5/26 22:56
 * @description: 课程信息编辑接口
 */

@RestController
public class CourseBaseInfoController {

    @RequestMapping("/course/list")
    public PageResult<CourseBase> List(PageParams pageParams, @RequestBody(required=false) QueryCourseParamsDto queryCourseParamsDto){


        return null;
    }

}
