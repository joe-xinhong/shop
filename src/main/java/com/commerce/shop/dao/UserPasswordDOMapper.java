package com.commerce.shop.dao;

import com.commerce.shop.dataobject.UserPasswordDO;
import com.commerce.shop.dataobject.UserPasswordDOExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Mapper
public interface UserPasswordDOMapper {
    long countByExample(UserPasswordDOExample example);

    int deleteByExample(UserPasswordDOExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(UserPasswordDO record);

    int insertSelective(UserPasswordDO record);

    List<UserPasswordDO> selectByExample(UserPasswordDOExample example);

    UserPasswordDO selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") UserPasswordDO record, @Param("example") UserPasswordDOExample example);

    int updateByExample(@Param("record") UserPasswordDO record, @Param("example") UserPasswordDOExample example);

    int updateByPrimaryKeySelective(UserPasswordDO record);

    int updateByPrimaryKey(UserPasswordDO record);
}