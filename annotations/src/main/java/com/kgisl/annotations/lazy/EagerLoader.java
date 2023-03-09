package com.kgisl.annotations.lazy;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component

public class EagerLoader {

    public EagerLoader() {
        System.out.println("Eager Loader Called..........");
    }
    @Lazy
    public String eager(){
        return "Eager";
    }
    
    
}
