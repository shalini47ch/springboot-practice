package com.telusco.DemoApp2;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Hello {
    @RequestMapping("/")
    public String greet(){
        return "Hello welcome to my spring boot application";

    }
}
