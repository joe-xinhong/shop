package com.commerce.shop.service;

import com.commerce.shop.model.PromoModel;

public interface PromoService {
    /**
     * 根据itemId获取即将进行或者正在进行的活动
     * @param itemId
     * @return
     */
    PromoModel getPromoByItemId(Integer itemId);
}
