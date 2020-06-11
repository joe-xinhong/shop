package com.commerce.shop.model;

import lombok.Data;
/**
* @Description:    用户模型(整体业务处理携带)
* @Author:         Joe
* @CreateDate:     2020/6/11 17:05
*/
@Data
public class UserModel {

    private Integer id;

    private String name;

    private Integer gender;

    private Integer age;

    private String telphone;

    private String registerMode;

    private String thirdPartyId;

    private String encrptPassword;
}
