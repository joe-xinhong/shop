package com.commerce.shop.controller;

import com.commerce.shop.dto.UserDTO;
import com.commerce.shop.model.UserModel;
import com.commerce.shop.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeanUtils;
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
    private UserService userService;

    @RequestMapping(value = "/home/{id}",name = "查询用户信息",method = RequestMethod.GET)
    public UserDTO home(@PathVariable(value = "id")Integer id){
        UserModel userModel = userService.getUserById(id);
        return convertFromModel(userModel);
    }

    /**
     * 将业务模型——>视图模型 展示给前端
     * @param userModel
     * @return
     */
    private UserDTO convertFromModel(UserModel userModel){
        if (userModel == null){
            return null;
        }
        UserDTO userDTO = new UserDTO();
        BeanUtils.copyProperties(userModel,userDTO);
        return userDTO;
    }
}
