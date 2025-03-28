package com.example.spring;

import com.example.spring.interview.User;
import com.example.spring.scopebean.Address;
import com.example.spring.scopebean.AdressConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.*;

import javax.annotation.PreDestroy;

/**
 * Hello world!
 *
 */

//@SpringBootApplication
@Configuration
@EnableAutoConfiguration
@ComponentScan

public class APPConfig
{
    public static void main( String[] args )
    {
        SpringApplication.run(APPConfig.class,args);

    }


}
