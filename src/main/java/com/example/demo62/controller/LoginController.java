package com.example.demo62.controller;

import com.example.demo62.dto.Result;
import com.example.demo62.mapper.UserMapper;
import com.example.demo62.pojo.User;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class LoginController {

    @Autowired
    UserMapper userMapper;

    @RequestMapping("/login")
    public String login() {
        return "login";
    }


    @RequestMapping("/loginCheck")
    public String loginCheck(String userName, String password) {
        System.out.println("Hello");
        Subject subject = SecurityUtils.getSubject();
        UsernamePasswordToken usernamePasswordToken = new UsernamePasswordToken(userName, password);
        //进行验证，这里可以捕获异常，然后返回对应信息
        try {
            subject.login(usernamePasswordToken);
        } catch (Exception e) {
            System.out.println(e);
        }
        return "redirect:/index";
    }

    @RequestMapping("/reg")
    public String reg() {
        return "reg";
    }

    @RequestMapping("/regUser")
    @ResponseBody
    public Result<String> saveUser(User user) {
        userMapper.insertOne(user);
        return new Result<>(true, 1, "注册成功");
    }
}
