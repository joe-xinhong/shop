package com.commerce.shop.dto;

import lombok.Data;
/**
* @Description:    用户对象[给前端展示即可]
* @Author:         Joe
* @CreateDate:     2020/6/11 17:26
*/
@Data
public class UserDTO {

    private Integer id;

    private String name;

    private Integer gender;

    private Integer age;

    private String telphone;
}
