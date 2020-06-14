package com.commerce.shop.dao;

import com.commerce.shop.dataobject.SequenceDO;
import com.commerce.shop.dataobject.SequenceDOExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface SequenceDOMapper {
    long countByExample(SequenceDOExample example);

    int deleteByExample(SequenceDOExample example);

    int deleteByPrimaryKey(String name);

    int insert(SequenceDO record);

    int insertSelective(SequenceDO record);

    List<SequenceDO> selectByExample(SequenceDOExample example);

    SequenceDO selectByPrimaryKey(String name);

    int updateByExampleSelective(@Param("record") SequenceDO record, @Param("example") SequenceDOExample example);

    int updateByExample(@Param("record") SequenceDO record, @Param("example") SequenceDOExample example);

    int updateByPrimaryKeySelective(SequenceDO record);

    int updateByPrimaryKey(SequenceDO record);

    SequenceDO getSequenceByName(@Param("name")String name);
}