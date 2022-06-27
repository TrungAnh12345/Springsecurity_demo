package com.example.springsecurity_example1.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("hello")
public class HelloRestController {
    @GetMapping("user")
    public String helloUser(){
        return "Hello userrrrr";
    }
    public String helloAdmin(){
        return "Hello Admin";
    }


}
