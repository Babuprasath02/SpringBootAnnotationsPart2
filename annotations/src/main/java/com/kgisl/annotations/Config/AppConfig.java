package com.kgisl.annotations.Config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.kgisl.annotations.controller.BeanController;
import com.kgisl.annotations.repository.BeanInterface;
import com.kgisl.annotations.service.BeanService;
import com.kgisl.annotations.service.BeanService2;

@Configuration
public class AppConfig {

    @Bean
    public BeanInterface get(){
        return new BeanService();
    }

    @Bean
    public BeanInterface get2(){
        return new BeanService2();
    }
    @Bean(initMethod = "init",destroyMethod = "destroy")
    public BeanController bc(){
        return new BeanController(get2());
    }
}
