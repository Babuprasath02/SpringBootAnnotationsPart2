package com.kgisl.annotations.service;

import org.springframework.stereotype.Service;

import com.kgisl.annotations.repository.MyRepository;
@Service
public class MyService implements MyRepository{

    @Override
    public String myRepository() {
       return "Habibi Come To Dubai";
    }

    
}
