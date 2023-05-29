package com.xuecheng.content.service;

import com.xuecheng.content.model.dto.CourseCategoryTreeDto;

import java.util.List;

/**
 * @Title: CourseCategoryService
 * @Author XLW
 * @Package com.xuecheng.content.service
 * @Date 2023/5/29 17:11
 * @description: 课程分类树型结构查询
 */
public interface CourseCategoryService {

    public List<CourseCategoryTreeDto> queryTreeNodes(String id);
}
