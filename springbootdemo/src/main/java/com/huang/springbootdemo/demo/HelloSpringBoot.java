package com.huang.springbootdemo.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloSpringBoot {

    @RequestMapping("/hello")
    public String hellospringboot(){
        return "hello spring boot!";
    }
}
