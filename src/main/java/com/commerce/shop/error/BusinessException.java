package com.commerce.shop.error;
/**
* @Description:    接收/通用异常处理【业务异常类实现】
* @Author:         Joe
* @CreateDate:     2020/6/11 18:10
*/
public class BusinessException extends Exception implements CommonError {

    private CommonError commonError;

    /**
     * 直接接收 EmBusinessError 的传参用于构造业务异常
     * @param commonError
     */
    public BusinessException(CommonError commonError){
        super();
        this.commonError = commonError;
    }

    /**
     * 直接接收 EmBusinessError 的传参用于构造业务异常
     * @param commonError
     * @param Msg
     */
    public BusinessException(CommonError commonError,String Msg){
        super();
        this.commonError = commonError;
        this.commonError.setErrorMsg(Msg);
    }

    @Override
    public int getErrorCode() {
        return this.commonError.getErrorCode();
    }

    @Override
    public String getErrorMsg() {
        return this.commonError.getErrorMsg();
    }

    @Override
    public CommonError setErrorMsg(String Msg) {
        this.commonError.setErrorMsg(Msg);
        return this;
    }
}
