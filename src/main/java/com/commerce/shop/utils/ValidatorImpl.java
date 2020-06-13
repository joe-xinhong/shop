package com.commerce.shop.utils;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import java.util.Set;

/**
* @Description:    校验器
* @Author:         Joe
* @CreateDate:     2020/6/12 20:47
*/
@Component
public class ValidatorImpl implements InitializingBean {

    private Validator validator;

    //实现校验方法并返回校验结果
    public ValidationResult validate(Object bean){
        ValidationResult result = new ValidationResult();
        Set<ConstraintViolation<Object>> validateSet = validator.validate(bean);
        System.out.println("validateSet大小："+validateSet.size());
        if (validateSet.size() >0 ){
            //有错误
            result.setHasErrors(true);
            validateSet.forEach(constraintViolation->{
                String errMsg = constraintViolation.getMessage();
                String propertyName = constraintViolation.getPropertyPath().toString();
                result.getErrorMsgMap().put(propertyName,errMsg);
            });
        }
        return result;
    }


    @Override
    public void afterPropertiesSet() throws Exception {
        //将hibernate validator 通过工厂的初始化方式使其实例化
        validator = Validation.buildDefaultValidatorFactory().getValidator();
    }
}
