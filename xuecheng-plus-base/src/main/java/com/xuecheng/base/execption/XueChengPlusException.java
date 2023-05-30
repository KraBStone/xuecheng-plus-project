package com.xuecheng.base.execption;

import lombok.Data;

/**
 * @Title: XueChengPlusException
 * @Author XLW
 * @Package com.xuecheng.base.execption
 * @Date 2023/5/30 22:40
 * @description: 学成在线项目异常类
 */


@Data
public class XueChengPlusException extends RuntimeException {

    private String errMessage;

    public XueChengPlusException() {
        super();
    }

    public XueChengPlusException(String errMessage) {
        super(errMessage);
        this.errMessage = errMessage;
    }

    public String getErrMessage() {
        return errMessage;
    }

    public static void cast(CommonError commonError){
        throw new XueChengPlusException(commonError.getErrMessage());
    }
    public static void cast(String errMessage){
        throw new XueChengPlusException(errMessage);
    }

}