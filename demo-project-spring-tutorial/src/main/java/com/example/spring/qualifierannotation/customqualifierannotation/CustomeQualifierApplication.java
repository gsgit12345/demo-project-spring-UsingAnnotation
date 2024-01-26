package com.example.spring.qualifierannotation.customqualifierannotation;

import com.example.spring.qualifierannotation.ApplicationConfiguration;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class CustomeQualifierApplication {

    public static void main(String str[])
    {
        AnnotationConfigApplicationContext config=new AnnotationConfigApplicationContext(ApplicationConfigurationForCustomQualifier.class);

        DepartmentService service=config.getBean(DepartmentService.class);
        service.createDepartment();
    }
}
