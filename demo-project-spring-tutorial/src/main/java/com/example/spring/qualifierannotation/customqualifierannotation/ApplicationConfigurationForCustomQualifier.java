package com.example.spring.qualifierannotation.customqualifierannotation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.example.spring.qualifierannotation.customqualifierannotation")
public class ApplicationConfigurationForCustomQualifier {

    @Bean
    public Department taxDepartment()
    {
        return new TaxDepartment();
    }
}
