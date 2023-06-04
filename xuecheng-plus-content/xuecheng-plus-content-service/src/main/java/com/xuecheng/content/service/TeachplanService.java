package com.xuecheng.content.service;

import com.xuecheng.content.model.dto.TeachplanDto;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Title: TeachplanService
 * @Author XLW
 * @Package com.xuecheng.content.service
 * @Date 2023/6/4 15:33
 * @description: 课程计划管理相关接口
 */

public interface TeachplanService {

    /**
     * 根据Id查询课程计划
     * @param courseId 查询课程计划
     * @return
     */
    public List<TeachplanDto> findTeachplanTree(Long courseId);
}
