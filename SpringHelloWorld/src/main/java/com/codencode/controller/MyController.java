package com.codencode.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

    @GetMapping("/hello")
    public String sayHello(){
        return "Hello World from CodeNCode";
    }

    @GetMapping("/logout")
    public String logout(){
        return "return Logged Out";
    }
}
