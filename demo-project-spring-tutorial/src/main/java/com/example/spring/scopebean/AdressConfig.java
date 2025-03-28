package com.example.spring.scopebean;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class AdressConfig {
    @Bean("singltonbean")
    @Scope(scopeName = "singleton")

    public Address getAddrss()
    {
        return new Address();
    }

    @Bean("prototypebean")
    @Scope(scopeName = "prototype")
    public Address prototype()
    {
        return new Address();
    }
}
