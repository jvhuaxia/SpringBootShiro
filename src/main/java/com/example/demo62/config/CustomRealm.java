package com.example.demo62.config;

import com.example.demo62.pojo.Permission;
import com.example.demo62.pojo.Role;
import com.example.demo62.pojo.User;
import com.example.demo62.service.UserService;
import org.apache.shiro.authc.*;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.HashSet;
import java.util.Set;

public class CustomRealm extends AuthorizingRealm {

    @Autowired
    private UserService userService;


    /**
     * 获取身份验证信息
     * Shiro中，最终是通过 Realm 来获取应用程序中的用户、角色及权限信息的。
     *
     * @param authenticationToken 用户身份信息 token
     * @return 返回封装了用户信息的 AuthenticationInfo 实例
     */
    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken authenticationToken) throws AuthenticationException {
        System.out.println("————身份认证方法————");
        UsernamePasswordToken token = (UsernamePasswordToken) authenticationToken;
        // 从数据库获取对应用户名密码的用户
        User user = userService.getUser(token.getUsername());

        if (user == null) {
            throw new AccountException("用户名不正确");
        } else if (!user.getPassword().equals(new String((char[]) token.getCredentials()))) {
            throw new AccountException("密码不正确");
        }
        return new SimpleAuthenticationInfo(token.getPrincipal(), user.getPassword(), getName());
    }

    /**
     * 获取授权信息
     *
     * @param principalCollection
     * @return
     */
    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principalCollection) {
        System.out.println("————权限认证————");
        String username = (String) principalCollection.getPrimaryPrincipal();
        User user = userService.getUser(username);
        Set<String> roleSet = new HashSet<>();
        Set<String> permissionSet = new HashSet<>();
        for (Role role : user.getRoles()) {
            roleSet.add(role.getName());
            for (Permission permission : role.getPermissions()) {
                permissionSet.add(permission.getName());
            }
        }

        SimpleAuthorizationInfo authorizationInfo = new SimpleAuthorizationInfo();
        authorizationInfo.addRoles(roleSet);
        authorizationInfo.addStringPermissions(permissionSet);
        System.out.println(
                "\r\n\r\n\r\nJvHuaXia 已经登录成功 授权doGetAuthorizationInfo:" + user.toString() + "\r\n\r\n\r\n");

        return authorizationInfo;
    }
}