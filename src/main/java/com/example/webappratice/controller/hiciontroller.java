package com.example.webappratice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class hiciontroller {
    @GetMapping("/hi")
    @RequestMapping("/hi")
    public String hi(){
        return "hello,";
    }
}
