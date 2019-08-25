package com.gdou.controller;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@EnableAutoConfiguration
public class HelloWorld {

    @GetMapping("/hello")
    public String hello(){
        return "hello";
    }
}
