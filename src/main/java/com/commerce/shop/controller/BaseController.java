package com.commerce.shop.controller;

import com.commerce.shop.error.BusinessException;
import com.commerce.shop.error.EmBusinessError;
import com.commerce.shop.utils.CommonReturnType;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

/**
* @Description:    定义ExceptionHandler解决未被Controller层吸收的Exception
* @Author:         Joe
* @CreateDate:     2020/6/12 12:53
*/
public class BaseController {

    //定义ExceptionHandler解决未被Controller层吸收的Exception
    @ExceptionHandler(Exception.class)
    @ResponseStatus(HttpStatus.OK)
    public Object handlerException(HttpServletRequest request, Exception e){
        Map<String,Object> responseData = new HashMap<>();
        if (e instanceof BusinessException){
            BusinessException businessException = (BusinessException) e;
            responseData.put("Code",businessException.getErrorCode());
            responseData.put("Msg",businessException.getErrorMsg());
        }else {
            responseData.put("Code",EmBusinessError.UNKNOWN_ERROR.getErrorCode());
            responseData.put("Msg",EmBusinessError.UNKNOWN_ERROR.getErrorMsg());
        }

        return CommonReturnType.create(responseData,"fail");
    }
}
