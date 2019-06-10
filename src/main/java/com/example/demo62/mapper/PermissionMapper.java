package com.example.demo62.mapper;

import com.example.demo62.pojo.Permission;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface PermissionMapper {
    Permission selectOne(int id);

    List<Permission> selectByRole(int roleId);

    void insertOne(Permission permission);
}
