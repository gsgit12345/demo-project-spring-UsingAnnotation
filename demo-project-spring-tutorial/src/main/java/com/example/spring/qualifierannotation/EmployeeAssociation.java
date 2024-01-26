package com.example.spring.qualifierannotation;

import org.springframework.stereotype.Component;

@Component("employeeAssociation")
public class EmployeeAssociation implements association {
    @Override
    public void createAssociation() {
        System.out.println("employee association");
    }
}
