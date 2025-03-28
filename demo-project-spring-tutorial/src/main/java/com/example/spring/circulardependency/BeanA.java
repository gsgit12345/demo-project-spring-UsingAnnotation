package com.example.spring.circulardependency;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BeanA {
    public BeanB beanB;

    @Autowired
    public BeanA(BeanB beanB)
    {
        this.beanB=beanB;
    }
    public String sayName()
    {
        return "I am Beanb";
    }
}
