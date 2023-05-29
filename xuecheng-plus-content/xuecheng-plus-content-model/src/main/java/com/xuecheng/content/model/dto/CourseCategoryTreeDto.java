package com.xuecheng.content.model.dto;

import com.xuecheng.content.model.po.CourseCategory;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;

import java.io.Serializable;
import java.util.List;

/**
 * @Title: CourseCategoryTreeDto
 * @Author XLW
 * @Package com.xuecheng.content.model.dto
 * @Date 2023/5/29 16:58
 * @description: 课程分类树型节点Dto
 */
@Data
@Slf4j
public class CourseCategoryTreeDto extends CourseCategory implements java.io.Serializable {

    List<CourseCategory> childrenTreeNodes;


}
