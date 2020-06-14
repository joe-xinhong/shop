package com.commerce.shop.model;

import lombok.Data;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
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
    @NotBlank(message = "商品名不能为空")
    private String title;
    /**
     * 价格
     */
    @NotNull(message = "商品价格不能为空")
    @Min(value = 0,message = "商品价格必须大于0")
    private BigDecimal price;
    /**
     * 库存
     */
    @NotNull(message = "库存不能不填")
    private Integer stock;
    /**
     * 描述
     */
    @NotBlank(message = "商品描述信息不能为空")
    private String description;
    /**
     * 销量
     */
    private Integer sales;
    /**
     * 图片
     */
    @NotBlank(message = "商品图片信息不能为空")
    private String imgUrl;
}
