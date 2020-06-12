package com.commerce.shop.controller;

import com.alibaba.druid.util.StringUtils;
import com.commerce.shop.dto.UserDTO;
import com.commerce.shop.error.BusinessException;
import com.commerce.shop.error.EmBusinessError;
import com.commerce.shop.model.UserModel;
import com.commerce.shop.service.UserService;
import com.commerce.shop.utils.CommonReturnType;
import lombok.extern.slf4j.Slf4j;
import org.apache.tomcat.util.security.MD5Encoder;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import sun.misc.BASE64Encoder;

import javax.servlet.http.HttpServletRequest;
import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Random;


@RestController
@RequestMapping(value = "/user",name = "用户管理")
@Slf4j
@CrossOrigin(allowCredentials = "true",allowedHeaders = "*")
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

    @RequestMapping(value = "/register",name = "用户注册",method = RequestMethod.POST)
    public CommonReturnType register(@RequestParam(name = "telphone")String telphone,
                                     @RequestParam(name = "code")String code,
                                     @RequestParam(name = "name")String name,
                                     @RequestParam(name = "gender")Integer gender,
                                     @RequestParam(name = "age")Integer age,
                                     @RequestParam(name = "password")String password) throws BusinessException, UnsupportedEncodingException, NoSuchAlgorithmException {
        String inSessionCode = (String) httpServletRequest.getSession().getAttribute(telphone);
        log.info("inSessionCode:{}",inSessionCode);
        if (!StringUtils.equals(code,inSessionCode)){
            throw new BusinessException(EmBusinessError.PARAMETER_VALIDATION_ERROR,"短信验证码不符合");
        }
        UserModel userModel = new UserModel();
        userModel.setName(name);
        userModel.setGender(gender);
        userModel.setAge(age);
        userModel.setTelphone(telphone);
        userModel.setRegisterMode("byphone");
        userModel.setEncrptPassword(EncodeByMd5(password));
        userService.register(userModel);
        return CommonReturnType.create(null);
    }

    @RequestMapping(value = "/login",name = "用户登录",method = RequestMethod.POST)
    public CommonReturnType login(@RequestParam(name = "telphone")String telphone,
                                     @RequestParam(name = "password")String password) throws BusinessException, UnsupportedEncodingException, NoSuchAlgorithmException {
        if(StringUtils.isEmpty(telphone) || StringUtils.isEmpty(password)){
            throw new BusinessException(EmBusinessError.PARAMETER_VALIDATION_ERROR);
        }

        System.out.println("密码："+password+";加密后："+EncodeByMd5(password));
        //用户登录//验证合法性
        UserModel userModel = userService.validateLogin(telphone, EncodeByMd5(password));

        //将登录凭证加入到用户登录成功的session内
        httpServletRequest.getSession().setAttribute("IS_LOGIN",true);
        httpServletRequest.getSession().setAttribute("LOGIN_USER",userModel);
        return CommonReturnType.create(null);
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
     * 密码转换
     * @param str
     * @return
     */
    public String EncodeByMd5(String str) throws NoSuchAlgorithmException, UnsupportedEncodingException {
        //确定计算方法
        MessageDigest md5 = MessageDigest.getInstance("MD5");
        BASE64Encoder base64Encoder = new BASE64Encoder();

        //加密字符串
        String newStr = base64Encoder.encode(md5.digest(str.getBytes("utf-8")));
        return newStr;
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

    /**
     * 性别转换
     * @param gender
     * @return
     */
    private Integer convertFromString(String gender){
        if (gender==null||gender.equals("男")){
            return 1;
        }else {
            return -1;
        }
    }

}
