package com.example.spring.qualifierannotation;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.example.spring.qualifierannotation,com.example.spring.qualifierannotation.customqualifierannotation")
public class ApplicationConfiguration {
}
