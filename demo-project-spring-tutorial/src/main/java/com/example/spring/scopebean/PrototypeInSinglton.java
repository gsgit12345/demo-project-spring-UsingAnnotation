package com.example.spring.scopebean;

import com.example.spring.APPConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;


public class PrototypeInSinglton {
    public static void main(String str[]) throws Exception {
        ApplicationContext context = new AnnotationConfigApplicationContext(AdressConfig.class);
        Address singlton = (Address) context.getBean("prototypebean");
        Address singlton2 = (Address) context.getBean("singltonbean");

        System.out.println("employeebean:"+singlton.hashCode());
        System.out.println("employeebean2:"+singlton2.hashCode());
//destroying the prototype bean
        singlton2.destroy();;




    }
}
