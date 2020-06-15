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
     * 若非空值，则表示以秒杀商品的方式下单
     */
    private Integer promoId;
    /**
     * 购买时商品单价[若promoId非空值，则表示以秒杀商品价格]
     */
    private BigDecimal itemPrice;
    /**
     * 购买数量
     */
    private Integer amount;
    /**
     * 购买总金额[若promoId非空值，则表示以秒杀商品价格计算总价]
     */
    private BigDecimal orderPrice;
}
