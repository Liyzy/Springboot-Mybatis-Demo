package com.dashang.controller;

import com.dashang.model.UserDomain;
import com.dashang.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/showAllUsers")
    public List<UserDomain> showAllUsers(){
        return userService.getUsers();
    }

    @RequestMapping("/hello")
    public String hello() {
        return "Hello, world";
    }
}

// @RequestMapping如果没有指定请求方式，将接收Get,Post,Head,Options等所有的请求方式
// @GetMapping是一个组合注解，是@RequestMapping(method = RequestMethod.GET)的缩写。 
// @PostMapping是一个组合注解，是@RequestMapping(method = RequestMethod.POST)的缩写。
