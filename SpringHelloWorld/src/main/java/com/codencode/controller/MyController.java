package com.codencode.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

    @GetMapping("/hello")
    public String sayHello(){
        return "Hello World from my name";
    }

    @GetMapping("/logout")
    public String logout(){
        return "return Logged Out";
    }

    @GetMapping("/hello/{name}")
    public String sayHelloToUser(@PathVariable String name)
    {
        return "Hello " + name + " from CodeNCode";
    }
}
