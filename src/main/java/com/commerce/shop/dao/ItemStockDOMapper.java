package com.commerce.shop.dao;

import com.commerce.shop.dataobject.ItemStockDO;
import com.commerce.shop.dataobject.ItemStockDOExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface ItemStockDOMapper {
    long countByExample(ItemStockDOExample example);

    int deleteByExample(ItemStockDOExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ItemStockDO record);

    int insertSelective(ItemStockDO record);

    List<ItemStockDO> selectByExample(ItemStockDOExample example);

    ItemStockDO selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ItemStockDO record, @Param("example") ItemStockDOExample example);

    int updateByExample(@Param("record") ItemStockDO record, @Param("example") ItemStockDOExample example);

    int updateByPrimaryKeySelective(ItemStockDO record);

    int updateByPrimaryKey(ItemStockDO record);

    ItemStockDO selectByItemId(@Param("itemId") Integer itemId);

    int decreaseStock(@Param("itemId") Integer itemId,@Param("amount") Integer amount);
}