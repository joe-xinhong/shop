package com.commerce.shop.model;

import lombok.Data;
import org.joda.time.DateTime;

import java.math.BigDecimal;


@Data
public class PromoModel {
    /**
     * 活动id
     */
    private Integer id;
    /**
     * 活动状态
     * 1：未开始；
     * 2：进行中
     * 3：已结束
     */
    private Integer status;
    /**
     * 活动名称
     */
    private String promoName;
    /**
     * 活动开始时间
     */
    private DateTime startDate;
    /**
     * 活动结束时间
     */
    private DateTime endDate;
    /**
     * 活动适用的商品
     */
    private Integer itemId;
    /**
     * 活动中商品的价格
     */
    private BigDecimal promoItemPrice;
}
