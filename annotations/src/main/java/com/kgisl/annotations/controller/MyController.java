package com.kgisl.annotations.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kgisl.annotations.service.MyService;

@RestController
public class MyController {
    @Autowired
    private MyService ms;
    
    @GetMapping("/say")
    public String sayHello(){
        return ms.myRepository();
    }
    
}
