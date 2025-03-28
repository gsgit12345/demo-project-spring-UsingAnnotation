package com.example.spring.circulardependency;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
public class BeanB {
    public BeanA beana;

    @Autowired
    public BeanB(@Lazy BeanA beana) {
        this.beana = beana;
    }
    public String sayName()
    {
        return "I am beana";
    }
}
