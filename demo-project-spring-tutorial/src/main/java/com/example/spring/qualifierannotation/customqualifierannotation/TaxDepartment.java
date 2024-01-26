package com.example.spring.qualifierannotation.customqualifierannotation;

import org.springframework.stereotype.Component;

@Component("taxDepartment")
public class TaxDepartment implements Department{
    @Override
    public void departmentType() {
        System.out.println("tax department");
    }
}
