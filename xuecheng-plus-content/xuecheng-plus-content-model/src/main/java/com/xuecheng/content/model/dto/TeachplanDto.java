package com.xuecheng.content.model.dto;

import com.xuecheng.content.model.po.Teachplan;
import com.xuecheng.content.model.po.TeachplanMedia;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
 * @Title: TeachplanDto
 * @Author XLW
 * @Package com.xuecheng.content.model.dto
 * @Date 2023/6/4 14:45
 * @description: 课程计划树型结构dto
 */
@Data
@ToString
public class TeachplanDto extends Teachplan {
    //与媒资关联的信息
    private TeachplanMedia teachplanMedia;


    //小章节list
    private List<TeachplanDto> teachPlanTreeNodes;
}
