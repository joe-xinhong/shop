package com.commerce.shop.service.impl;

import com.commerce.shop.dao.UserDOMapper;
import com.commerce.shop.dao.UserPasswordDOMapper;
import com.commerce.shop.dataobject.UserDO;
import com.commerce.shop.dataobject.UserPasswordDO;
import com.commerce.shop.model.UserModel;
import com.commerce.shop.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDOMapper userDOMapper;
    @Autowired
    private UserPasswordDOMapper userPasswordDOMapper;

    @Override
    public UserModel getUserById(Integer id) {
        //该对象不能透露给前端的
        UserDO userDO = userDOMapper.selectByPrimaryKey(id);
        if (userDO == null){
            return null;
        }
        //根据用户id获取对应用户的加密信息
        UserPasswordDO userPasswordDO = userPasswordDOMapper.selectByUserId(userDO.getId());

        return convertFromDataObject(userDO,userPasswordDO);


    }

    /**
     * 根据用户、密码实体类 -——>模型传输类
     * @param userDO
     * @param userPasswordDO
     * @return
     */
    private UserModel convertFromDataObject(UserDO userDO, UserPasswordDO userPasswordDO){
        if (userDO == null){
            return null;
        }
        UserModel userModel = new UserModel();
        BeanUtils.copyProperties(userDO,userModel);
        if (userPasswordDO != null){
            userModel.setEncrptPassword(userPasswordDO.getEncrptPassword());
        }

        return userModel;
    }
}
