package com.example.demo62.mapper;

import com.example.demo62.pojo.StaticUserRole;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface StaticUserRoleMapper {
    int deleteByPrimaryKey(Integer userRoleId);

    int insert(StaticUserRole record);

    int insertSelective(StaticUserRole record);

    StaticUserRole selectByPrimaryKey(Integer userRoleId);

    int updateByPrimaryKeySelective(StaticUserRole record);

    int updateByPrimaryKey(StaticUserRole record);
}