package com.kgisl.annotations.service;

import com.kgisl.annotations.repository.BeanInterface;

public class BeanService2 implements BeanInterface{

    @Override
    public String beanExample() {
      return "Bean Service 2";
    }
    
}
