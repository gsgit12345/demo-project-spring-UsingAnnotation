package com.example.spring.interview;

import com.example.spring.scopebean.Address;
import com.example.spring.scopebean.AdressConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class EqualDemo {
    public  static void main(String str[])
    {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfigUser.class);
        User user1= context.getBean(User.class);

        User user2= context.getBean(User.class);

        if(user1==user2)
        {
            System.out.println("true");
        }else
        {
            System.out.println("false");

        }
    }
}
