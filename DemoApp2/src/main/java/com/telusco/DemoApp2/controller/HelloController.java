package com.telusco.DemoApp2.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @RequestMapping("/hello")
    public String welcome(){
        return "Welcome to my controller";
        //multiple controllers can work together because of FrontController which is placed before the spring controller
        //the spring mvc is arranged like client => front controller=>controller=>server=>resource=>db

    }
}
