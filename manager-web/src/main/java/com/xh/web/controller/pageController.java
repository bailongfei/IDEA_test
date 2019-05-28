package com.xh.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class pageController {
    @RequestMapping("/{page}")
    public String showPage(@PathVariable String page){
        return page;
    }
}
