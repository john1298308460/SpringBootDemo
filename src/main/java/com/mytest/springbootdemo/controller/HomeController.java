package com.mytest.springbootdemo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class HomeController {

    @RequestMapping("/")
    public String home(){
        return "Jenkins + Github + 内网穿透的持续集成部署项目！";




    }
}
