package com.commerce.shop.error;
/**
* @Description:    错误码处理
* @Author:         Joe
* @CreateDate:     2020/6/11 18:00
*/
public enum EmBusinessError implements CommonError {
    //通用错误类型：10001
    PARAMETER_VALIDATION_ERROR(10001,"参数不合法"),
    UNKNOWN_ERROR(10002,"未知错误"),

    //20000开头为用户信息相关错误定义
    USER_NOT_EXIST(20001,"用户不存在"),
    USER_LOGIN_FAIL(20002,"用户手机号或密码不正确"),
    USER_NOT_LOGIN(20003,"用户还没有登录"),

    //30000开头为交易信息错误定义
    STOCK_NOT_ENOUGH(30001,"库存不足"),
    ;

    private int Code;
    private String Msg;

    private EmBusinessError(int Code, String Msg) {
        this.Code = Code;
        this.Msg = Msg;
    }

    @Override
    public int getErrorCode() {
        return this.Code;
    }

    @Override
    public String getErrorMsg() {
        return this.Msg;
    }

    @Override
    public CommonError setErrorMsg(String Msg) {
        this.Msg = Msg;
        return this;
    }
}
