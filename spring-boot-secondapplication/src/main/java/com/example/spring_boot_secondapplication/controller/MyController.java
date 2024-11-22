package com.example.spring_boot_secondapplication.controller;

import com.example.spring_boot_secondapplication.service.MyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {


    @Autowired
    private final MyService myService;

    public MyController(MyService myService) {
        this.myService = myService;
    }

    @GetMapping("/process")
    public String process(@RequestParam String input) {
        return myService.process(input);
    }
}



