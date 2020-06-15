package com.commerce.shop.service;

import com.commerce.shop.error.BusinessException;
import com.commerce.shop.model.OrderModel;

public interface OrderService {

    //1.[推荐使用：]通过前端url上传过来活动id,然后下单接口内校验对应id是否属于对应商品且活动已经开始｛简单直接，可以防止不同商品的多个活动判断出错｝
    //2.下单接口内判断对应商品是否存在秒杀活动，若存在进行中的则以秒杀价格进行下单｛影响性能，对于普通下单也会进行查询｝


    /**
     * 创建订单
     * @param userId 用户id
     * @param itemId 商品id
     * @param amount 购买数量
     * @return
     */
    OrderModel createOrder(Integer userId,Integer itemId,Integer promoId,Integer amount) throws BusinessException;
}
