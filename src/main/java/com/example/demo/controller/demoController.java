package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class demoController {
    @RequestMapping("/")
    @ResponseBody
    public String hello() {
        return "Hello Spring Boot cokii";
    }
}
