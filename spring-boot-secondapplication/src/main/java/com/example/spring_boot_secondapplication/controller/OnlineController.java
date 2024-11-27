package com.example.spring_boot_secondapplication.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OnlineController {


    @GetMapping("/simple")
    public String sayHello(){
        return "hiii gopi how are you";
    }


}
