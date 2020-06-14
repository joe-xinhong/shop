package com.commerce.shop.model;

import lombok.Data;

import java.math.BigDecimal;

/**
* @Description:    订单模型(整体业务中处理使用)
* @Author:         Joe
* @CreateDate:     2020/6/14 12:53
*/
@Data
public class OrderModel {
    /**2018061400012828
     * 订单号
     */
    private String id;
    /**
     * 用户id
     */
    private Integer userId;
    /**
     * 商品id
     */
    private Integer itemId;
    /**
     * 购买时商品单价
     */
    private BigDecimal itemPrice;
    /**
     * 购买数量
     */
    private Integer amount;
    /**
     * 购买总金额
     */
    private BigDecimal orderPrice;
}
