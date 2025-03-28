package com.example.spring.circulardependency;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class CircularDependencyDemo {
    public static void main(String str[])
    {
        ApplicationContext context=new AnnotationConfigApplicationContext(BeanB.class);
     BeanB bean=   context.getBean(BeanB.class);
     System.out.println(bean.sayName());
    }
}
