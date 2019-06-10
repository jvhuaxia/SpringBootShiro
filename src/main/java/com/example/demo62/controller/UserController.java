package com.example.demo62.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/user")
public class UserController {
//
//    @Autowired
//    UserMapper userMapper;
//
//    @RequestMapping("/listView")
//    public String listView() {
//        return "user/userList";
//    }
//
//    @RequestMapping("/addView")
//    public String addView() {
//        return "user/add";
//    }
//
//    @RequestMapping("/updateView")
//    public ModelAndView updateView(String id) {
//        ModelAndView modelAndView = new ModelAndView("user/update");
//        modelAndView.addObject("user", userMapper.selectById(id));
//        return modelAndView;
//    }
//
//    @RequestMapping("/listPage")
//    @ResponseBody
//    public Result<IPage<User>> listPage(@RequestParam(defaultValue = "1") Integer page, @RequestParam(defaultValue = "10") Integer limit, User user) {
//        Page<User> userPage = new Page<>(page, limit);
//        QueryWrapper queryWrapper = new QueryWrapper();
//        if (user.getName() != null && !user.getName().equals("")) {
//            queryWrapper.like("user_name", user.getName());
//        }
//        return new Result<IPage<User>>(true, 0, userMapper.selectPage(userPage, queryWrapper), "success");
//    }
//
//    @RequestMapping("/add")
//    @ResponseBody
//    public Result<String> add(User user) {
//        System.out.println(user);
//        userMapper.insert(user);
//        return new Result<String>(true, 1, "success");
//    }
//
//    @RequestMapping("/update")
//    @ResponseBody
//    public Result<String> update(User user) {
//        System.out.println(user);
//        userMapper.updateById(user);
//        return new Result<String>(true, 1, "success");
//    }
}
