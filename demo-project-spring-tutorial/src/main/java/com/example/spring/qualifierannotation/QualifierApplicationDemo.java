package com.example.spring.qualifierannotation;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class QualifierApplicationDemo {
    public static void main(String str[])
    {
        AnnotationConfigApplicationContext annotationConfigApplicationContext=new AnnotationConfigApplicationContext(ApplicationConfiguration.class);
        AssociationService association=annotationConfigApplicationContext.getBean(com.example.spring.qualifierannotation.AssociationService.class);
      association.whichAssociation();
    }
}
