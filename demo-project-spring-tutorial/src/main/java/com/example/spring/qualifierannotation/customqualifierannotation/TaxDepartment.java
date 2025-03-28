package com.example.spring.qualifierannotation.customqualifierannotation;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Qualifier("taxDepartment")
@Component()
public class TaxDepartment implements Department{
    @Override
    public void departmentType() {
        System.out.println("tax department");
    }
}
