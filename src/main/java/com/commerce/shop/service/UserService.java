package com.commerce.shop.service;

import com.commerce.shop.error.BusinessException;
import com.commerce.shop.model.UserModel;

public interface UserService {

    /**
     * 根据用户id获取用户对象的方法
     * @param id
     */
    UserModel getUserById(Integer id);

    /**
     * 注册
     * @param userModel
     */
    void register(UserModel userModel) throws BusinessException;

    /**
     * 登录
     * @param telphone 注册手机号
     * @param password 加密后密码
     */
    UserModel validateLogin(String telphone,String password) throws BusinessException;
}
