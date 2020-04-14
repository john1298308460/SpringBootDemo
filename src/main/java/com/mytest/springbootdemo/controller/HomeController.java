package com.mytest.springbootdemo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class HomeController {

    @RequestMapping("/")
    public String home(){
        return "我的第一个自动化部署项目！";



    }
}
