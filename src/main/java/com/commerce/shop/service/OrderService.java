package com.commerce.shop.service;

import com.commerce.shop.error.BusinessException;
import com.commerce.shop.model.OrderModel;

public interface OrderService {

    /**
     * 创建订单
     * @param userId 用户id
     * @param itemId 商品id
     * @param amount 购买数量
     * @return
     */
    OrderModel createOrder(Integer userId,Integer itemId,Integer amount) throws BusinessException;
}
