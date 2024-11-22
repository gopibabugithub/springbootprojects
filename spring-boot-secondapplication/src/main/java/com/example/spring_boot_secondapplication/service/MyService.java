package com.example.spring_boot_secondapplication.service;

import org.springframework.stereotype.Service;

@Service
public class MyService {

    public String process(String input) {

        System.out.println("Processing input: " + input);
        return "Processed: " + input;
    }
}



