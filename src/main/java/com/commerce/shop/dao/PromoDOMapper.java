package com.commerce.shop.dao;

import com.commerce.shop.dataobject.PromoDO;
import com.commerce.shop.dataobject.PromoDOExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface PromoDOMapper {
    long countByExample(PromoDOExample example);

    int deleteByExample(PromoDOExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(PromoDO record);

    int insertSelective(PromoDO record);

    List<PromoDO> selectByExample(PromoDOExample example);

    PromoDO selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") PromoDO record, @Param("example") PromoDOExample example);

    int updateByExample(@Param("record") PromoDO record, @Param("example") PromoDOExample example);

    int updateByPrimaryKeySelective(PromoDO record);

    int updateByPrimaryKey(PromoDO record);

    PromoDO selectByItemId(@Param("itemId") Integer itemId);
}