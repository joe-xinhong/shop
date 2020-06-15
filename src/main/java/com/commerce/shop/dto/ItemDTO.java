package com.commerce.shop.dto;

import lombok.Data;
import org.joda.time.DateTime;

import java.math.BigDecimal;
@Data
public class ItemDTO {

    private Integer id;
    private String title;
    private BigDecimal price;
    private Integer stock;
    private String description;
    private Integer sales;
    private String imgUrl;
    /**
     * 商品是否在秒杀活动中，以及对应的状态
     * 0：没有活动
     * 1：秒杀活动待开始
     * 2：秒杀活动进行中
     */
    private Integer promoStatus;
    /**
     * 秒杀活动中的价格
     */
    private BigDecimal promoPrice;
    /**
     * 秒杀活动id
     */
    private Integer promoId;
    /**
     * 秒杀活动的开始时间[倒计时展示用]
     */
    private String startDate;
}
