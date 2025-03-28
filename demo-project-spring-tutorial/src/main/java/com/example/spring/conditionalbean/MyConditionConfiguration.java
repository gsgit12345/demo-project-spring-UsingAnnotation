package com.example.spring.conditionalbean;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyConditionConfiguration {

    @Bean
    @Conditional(MyCondition.class)
    public CustomeBean getBeanOb()
    {
        return new CustomeBean();
    }
}
