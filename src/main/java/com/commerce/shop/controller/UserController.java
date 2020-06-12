package com.commerce.shop.controller;

import com.commerce.shop.dto.UserDTO;
import com.commerce.shop.error.BusinessException;
import com.commerce.shop.error.EmBusinessError;
import com.commerce.shop.model.UserModel;
import com.commerce.shop.service.UserService;
import com.commerce.shop.utils.CommonReturnType;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.Random;


@RestController
@RequestMapping(value = "/user",name = "用户管理")
@Slf4j
@CrossOrigin
public class UserController extends BaseController{

    @Autowired
    private UserService userService;
    @Autowired
    private HttpServletRequest httpServletRequest;

    @RequestMapping(value = "/home/{id}",name = "查询用户信息",method = RequestMethod.GET)
    public CommonReturnType home(@PathVariable(value = "id")Integer id) throws BusinessException {
        UserModel userModel = userService.getUserById(id);

        //若获取的用户信息不存在
        if (userModel == null){
            throw new BusinessException(EmBusinessError.USER_NOT_EXIST);
        }

        UserDTO userDTO = convertFromModel(userModel);
        //返回通用对象
        return CommonReturnType.create(userDTO);
    }

    @RequestMapping(value = "/getOtp",name = "获取短信验证码",method = RequestMethod.POST)
    public CommonReturnType getOtp(@RequestParam(name = "telphone")String telphone){
        Random random = new Random();
        int r = random.nextInt(99999);
        r += 10000;
        String code = String.valueOf(r);
        httpServletRequest.getSession().setAttribute(telphone,code);
        log.info("手机号：{}",telphone);
        log.info("验证码：{}",code);
        return CommonReturnType.create(code);
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
