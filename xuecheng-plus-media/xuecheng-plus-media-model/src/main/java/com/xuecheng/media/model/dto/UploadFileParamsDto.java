package com.xuecheng.media.model.dto;

import lombok.Data;
import lombok.ToString;

/**
 * @Title: UploadFileParamsDto
 * @Author XLW
 * @Package com.xuecheng.media.model.dto
 * @Date 2023/6/7 21:39
 * @description: 文件信息
 */

@Data
@ToString
public class UploadFileParamsDto {
    /**
     * 文件名称
     */
    private String filename;


    /**
     * 文件类型（文档，音频，视频）
     */
    private String fileType;
    /**
     * 文件大小
     */
    private Long fileSize;

    /**
     * 标签
     */
    private String tags;

    /**
     * 上传人
     */
    private String username;

    /**
     * 备注
     */
    private String remark;
}
