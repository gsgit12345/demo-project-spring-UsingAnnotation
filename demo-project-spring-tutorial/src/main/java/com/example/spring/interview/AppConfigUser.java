package com.example.spring.interview;

import com.example.spring.scopebean.Address;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class AppConfigUser {
    @Bean
    public User prototype()
    {
        return new User();
    }
    @Bean
    @Scope("prototype")
    public Address1 Address1()
    {
        return new Address1();
    }
}
