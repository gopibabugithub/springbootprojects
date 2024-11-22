package com.example.spring_boot_secondapplication.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloGopiController {

    @GetMapping("/push")
    public String sayHello() {
        return "Good afternoon guys";
    }

    @GetMapping("/hello")
    public String hii() {
        return "This second api method";
    }
}
