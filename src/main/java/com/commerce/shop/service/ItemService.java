package com.commerce.shop.service;

import com.commerce.shop.error.BusinessException;
import com.commerce.shop.model.ItemModel;

import java.util.List;

public interface ItemService {
    /**
     * 创建商品
     * @param itemModel
     * @return
     */
    ItemModel createItem(ItemModel itemModel) throws BusinessException;

    /**
     * 商品列表浏览
     * @return
     */
    List<ItemModel> listItem();

    /**
     * 商品详情浏览
     * @param id
     * @return
     */
    ItemModel getItemById(Integer id);

    /**
     * 扣减库存
     * @param itemId
     * @param amount
     * @return
     * @throws BusinessException
     */
    boolean decreaseStock(Integer itemId,Integer amount)throws BusinessException;

    /**
     * 商品销量增加
     * @param itemId
     * @param amount
     * @throws BusinessException
     */
    void increaseSales(Integer itemId,Integer amount)throws BusinessException;
}
