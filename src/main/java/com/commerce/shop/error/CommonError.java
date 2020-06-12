package com.commerce.shop.error;
/**
* @Description:    错误码接口
* @Author:         Joe
* @CreateDate:     2020/6/11 17:57
*/
public interface CommonError {
    int getErrorCode();
    String getErrorMsg();
    CommonError setErrorMsg(String Msg);
}
