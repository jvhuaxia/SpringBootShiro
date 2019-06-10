package com.example.demo62.service.impl;

import com.example.demo62.mapper.RoleMapper;
import com.example.demo62.mapper.StaticRolePermissionMapper;
import com.example.demo62.pojo.Role;
import com.example.demo62.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RoleServiceImpl implements RoleService {
    @Autowired
    RoleMapper roleMapper;

    @Autowired
    StaticRolePermissionMapper staticRolePermissionMapper;

    @Override
    public void insertRole(Role role) {
//        roleDao.insertOne(role);
//        List<Permission> permissions = role.getPermissions();
//        for (Permission permission : permissions) {
//            staticRolePermissionDao.insert(new StaticRolePermission(role.getId(), permission.getId(), permission.getNote()));
//        }
    }
}
