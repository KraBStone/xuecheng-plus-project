package com.xuecheng.base.execption;

import java.io.Serializable;

/**
 * @Title: RestErroResponse
 * @Author XLW
 * @Package com.xuecheng.base.execption
 * @Date 2023/5/30 22:35
 * @description: 与前段约定返回的异常信息模型
 */
public class RestErrorResponse implements Serializable {

    private String errMessage;

    public RestErrorResponse(String errMessage){
        this.errMessage= errMessage;
    }

    public String getErrMessage() {
        return errMessage;
    }

    public void setErrMessage(String errMessage) {
        this.errMessage = errMessage;
    }
}