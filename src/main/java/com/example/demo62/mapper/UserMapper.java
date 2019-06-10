package com.example.demo62.mapper;

import com.example.demo62.pojo.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface UserMapper {

    User selectOne(String id);

    User selectByName(String name);

    void insertOne(@Param("user") User user);

    List<User> selectByRole(String roleId);
}
