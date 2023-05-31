package com.xuecheng.content.model.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @Title: EditCourseDto
 * @Author XLW
 * @Package com.xuecheng.content.model.dto
 * @Date 2023/5/31 15:50
 * @description: 修改课程模型类
 */
@Data
public class EditCourseDto extends AddCourseDto{


    @ApiModelProperty(value = "课程id", required = true)
    private Long id;
}
