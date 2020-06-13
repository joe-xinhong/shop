package com.commerce.shop.model;

import lombok.Data;

import java.math.BigDecimal;

/**
* @Description:    商品模型(整体业务中处理使用)
* @Author:         Joe
* @CreateDate:     2020/6/13 14:38
*/
@Data
public class ItemModel {
    /**
     * id
     */
    private Integer id;
    /**
     * 名称
     */
    private String title;
    /**
     * 价格
     */
    private BigDecimal price;
    /**
     * 库存
     */
    private Integer stock;
    /**
     * 描述
     */
    private String description;
    /**
     * 销量
     */
    private Integer sales;
    /**
     * 图片
     */
    private String imgUrl;
}
