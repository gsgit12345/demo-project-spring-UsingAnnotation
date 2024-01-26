package com.example.spring.qualifierannotation.customqualifierannotation;

import org.springframework.stereotype.Component;

@Component("hrDepartment")
public class HrDepartment implements  Department{
    @Override
    public void departmentType() {
        System.out.println("hello hr department");
    }
}
