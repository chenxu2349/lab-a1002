package com.example.laba1002.controller;

import com.example.laba1002.mapper.testMapper;
import com.example.laba1002.pojo.testUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {

    @Autowired
    private testMapper mp1;

    @GetMapping("/")
    public String home() {
        return "login1";
    }

    @GetMapping("/register")
    public String reg() {
        return "register";
    }

    @PostMapping("/login")
    public String login(@RequestParam(name = "username", required = true) String username,
                        @RequestParam(name = "password", required = true) String password,
                        Model model) {
        // 在这里处理用户的登录逻辑，比如通过用户名和密码验证用户信息
        // 如果验证成功，可以跳转到其他页面，如果验证失败，可以返回登录页面并提示错误信息
        return "home"; // 登录成功之后跳转的页面
    }

    @GetMapping("/testMybatis")
    @ResponseBody
    public String mybatisDemo(@RequestParam(value = "id", required = true) int id) {
        testUser u1 = mp1.queryById(id);
        System.out.println(u1.toString());
        return "success";
    }

}
