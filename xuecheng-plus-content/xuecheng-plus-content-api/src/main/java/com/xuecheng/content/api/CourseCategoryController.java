package com.xuecheng.content.api;

import com.xuecheng.content.mapper.CourseCategoryMapper;
import com.xuecheng.content.model.dto.CourseCategoryTreeDto;
import io.swagger.annotations.Api;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Title: CourseCategoryController
 * @Author XLW
 * @Package com.xuecheng.content.api
 * @Date 2023/5/29 17:01
 * @description: 课程分类接口
 */
@Api(value = "课程分类接口",tags = "课程分类接口")
@RestController
@Slf4j
public class CourseCategoryController {

    @GetMapping("/course-category/tree-nodes")
    public List<CourseCategoryTreeDto> queryTreeNodes(){
        return null;
    }
}
