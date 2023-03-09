package com.kgisl.annotations.controller;

import com.kgisl.annotations.repository.BeanInterface;

public class BeanController {
    private BeanInterface bi;

    public BeanController(BeanInterface bi) {
        this.bi = bi;
    }
    public String getBeanExample(){
        return bi.beanExample();
    }
    
    public void init(){
        System.out.println("Init Method Called");
    }
    public void destroy(){
        System.out.println("Destroy Method Called"
            
        );
    }
}
