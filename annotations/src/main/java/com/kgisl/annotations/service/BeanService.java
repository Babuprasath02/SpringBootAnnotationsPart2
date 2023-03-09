package com.kgisl.annotations.service;

import com.kgisl.annotations.repository.BeanInterface;

public class BeanService implements BeanInterface{

    @Override
    public String beanExample() {
       return "Bean Example";
    }
    
}
