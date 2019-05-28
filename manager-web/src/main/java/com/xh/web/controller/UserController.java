package com.xh.web.controller;

import com.xh.pojo.Users;
import com.xh.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;
    @RequestMapping("/addUser")
    public String addUser(Users users){
     this.userService.addUser(users);
        return "ok";
    }
}
