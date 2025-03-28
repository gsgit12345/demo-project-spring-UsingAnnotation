package com.example.spring.conditionalbean;

import org.springframework.stereotype.Component;

@Component
public class Student {

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    String name;
}
