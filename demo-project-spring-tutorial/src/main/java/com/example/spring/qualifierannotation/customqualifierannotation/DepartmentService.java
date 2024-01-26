package com.example.spring.qualifierannotation.customqualifierannotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DepartmentService {
    @Autowired
    @CustomeQualifier("hrDepartment")
    public Department department;

    public void createDepartment()
    {
        department.departmentType();
    }
}
