package com.commerce.shop.service;

import com.commerce.shop.model.UserModel;

public interface UserService {

    /**
     * 根据用户id获取用户对象的方法
     * @param id
     */
    UserModel getUserById(Integer id);
}
