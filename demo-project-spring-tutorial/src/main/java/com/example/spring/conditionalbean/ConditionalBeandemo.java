package com.example.spring.conditionalbean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ConditionalBeandemo {
    public static void main(String str[])
    {
        ApplicationContext context= new AnnotationConfigApplicationContext(MyConditionConfiguration.class);

        CustomeBean customeBean= context.getBean(CustomeBean.class);
        customeBean.printCustome();

        ApplicationContext context2= new AnnotationConfigApplicationContext(Student.class);

      Student ss=  context2.getBean(Student.class);
      System.out.println(ss.getName());



    }
}
