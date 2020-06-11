package com.commerce.shop.controller;

import com.commerce.shop.dao.UserDOMapper;
import com.commerce.shop.dataobject.UserDO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/user",name = "用户管理")
@Slf4j
public class UserController {

    @Autowired
    private UserDOMapper userDOMapper;

    @RequestMapping(value = "/home/{id}",name = "查询用户信息",method = RequestMethod.GET)
    public UserDO home(@PathVariable(value = "id")Integer id){
        UserDO userDO = userDOMapper.selectByPrimaryKey(id);
        if (userDO==null){
            return null;
        }
        return userDO;
    }
}
