package com.example.demo62.mapper;

import com.example.demo62.pojo.StaticRolePermission;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface StaticRolePermissionMapper {
    int deleteByPrimaryKey(Integer rolePermissionId);

    int insert(StaticRolePermission record);

    int insertSelective(StaticRolePermission record);

    StaticRolePermission selectByPrimaryKey(Integer rolePermissionId);

    int updateByPrimaryKeySelective(StaticRolePermission record);

    int updateByPrimaryKey(StaticRolePermission record);
}