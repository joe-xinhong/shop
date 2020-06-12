package com.commerce.shop.utils;

import lombok.Data;

/**
* @Description:    返回数据封装
* @Author:         Joe
* @CreateDate:     2020/6/11 17:41
*/
@Data
public class CommonReturnType {

    /**
     * 状态
     * 表明对应请求的返回处理结果：success / fail
     */
    private String status;
    /**
     * 数据
     * 1.status = success 则data内返回前端需要的json数据
     * 2.status = fail 则data内使用通用的错误码格式
     */
    private Object data;

    //定义一个通用的创建方法
    public static CommonReturnType create(Object result){
        return CommonReturnType.create(result,"success");
    }

    public static CommonReturnType create(Object result,String status){
        CommonReturnType type = new CommonReturnType();
        type.setStatus(status);
        type.setData(result);
        return type;
    }
}
