package com.commerce.shop.service.impl;

import com.commerce.shop.dao.UserDOMapper;
import com.commerce.shop.dao.UserPasswordDOMapper;
import com.commerce.shop.dataobject.UserDO;
import com.commerce.shop.dataobject.UserPasswordDO;
import com.commerce.shop.error.BusinessException;
import com.commerce.shop.error.EmBusinessError;
import com.commerce.shop.model.UserModel;
import com.commerce.shop.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DuplicateKeyException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

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

    @Override
    @Transactional
    public void register(UserModel userModel) throws BusinessException {
        if (userModel == null){
            throw new BusinessException(EmBusinessError.PARAMETER_VALIDATION_ERROR);
        }
        if (StringUtils.isEmpty(userModel.getName()) ||
                userModel.getGender() == null ||
                userModel.getAge() == null ||
                StringUtils.isEmpty(userModel.getTelphone())){
            throw new BusinessException(EmBusinessError.PARAMETER_VALIDATION_ERROR);
        }
        UserDO userDO = convertFromModel(userModel);
        try {
            userDOMapper.insertSelective(userDO);
        }catch (DuplicateKeyException ex){
            throw new BusinessException(EmBusinessError.PARAMETER_VALIDATION_ERROR,"手机号重复");
        }


        userModel.setId(userDO.getId());
        UserPasswordDO userPasswordDO = convertPasswordFromModel(userModel);

        userPasswordDOMapper.insertSelective(userPasswordDO);

    }

    @Override
    public UserModel validateLogin(String telphone, String password) throws BusinessException {
        //通过用户手机号获取用户信息
        UserDO userDO = userDOMapper.selectByTelphone(telphone);
        if (userDO == null){
            throw new BusinessException(EmBusinessError.USER_LOGIN_FAIL);
        }
        UserPasswordDO userPasswordDO = userPasswordDOMapper.selectByUserId(userDO.getId());
        UserModel userModel = convertFromDataObject(userDO,userPasswordDO);

        //对比用户密码与实际密码
        if (!StringUtils.equals(password,userModel.getEncrptPassword())){
            throw new BusinessException(EmBusinessError.USER_LOGIN_FAIL);
        }
        return userModel;

    }

    /**
     * 模型传输类Model——>Password DO
     * @param userModel
     * @return
     */
    private UserPasswordDO convertPasswordFromModel(UserModel userModel){
        if (userModel == null){
            return null;
        }
        UserPasswordDO userPasswordDO = new UserPasswordDO();
        userPasswordDO.setEncrptPassword(userModel.getEncrptPassword());
        userPasswordDO.setUserId(userModel.getId());
        return userPasswordDO;
    }

    /**
     * 模型传输类Model——>DO
     * @param userModel
     * @return
     */
    private UserDO convertFromModel(UserModel userModel){
        if (userModel == null){
            return null;
        }
        UserDO userDO = new UserDO();
        BeanUtils.copyProperties(userModel,userDO);
        return userDO;
    }

    /**
     * 根据用户、密码实体类 -——>模型传输类Model
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
