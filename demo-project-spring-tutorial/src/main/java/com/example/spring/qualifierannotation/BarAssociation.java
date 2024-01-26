package com.example.spring.qualifierannotation;

import org.springframework.stereotype.Component;

@Component("barAssociation")
public class BarAssociation implements association{
    @Override
    public void createAssociation() {
        System.out.println("hello barassociation");

    }
}
