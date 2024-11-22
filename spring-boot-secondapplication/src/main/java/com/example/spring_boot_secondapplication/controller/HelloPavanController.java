package com.example.spring_boot_secondapplication.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloPavanController {

    @GetMapping("/git")
    public String getHello(){
        return "Hello Git Hub .....";
    }

    @GetMapping("/hi")
    public String sayAsk)() {
    return "are you looking for job change  yes i am looking for job change";
    }
}
