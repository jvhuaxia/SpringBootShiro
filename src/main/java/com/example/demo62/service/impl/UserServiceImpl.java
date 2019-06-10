package com.example.demo62.service.impl;


import com.example.demo62.mapper.StaticRolePermissionMapper;
import com.example.demo62.mapper.StaticUserRoleMapper;
import com.example.demo62.mapper.UserMapper;
import com.example.demo62.pojo.User;
import com.example.demo62.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserMapper userMapper;

    @Autowired
    StaticRolePermissionMapper staticRolePermissionMapper;

    @Autowired
    StaticUserRoleMapper staticUserRoleMapper;

    @Override
    public void saveUser(User user) {
        userMapper.insertOne(user);
    }

    @Override
    public User getUser(String userName) {
        User user = userMapper.selectByName(userName);
        return user;
    }
}
