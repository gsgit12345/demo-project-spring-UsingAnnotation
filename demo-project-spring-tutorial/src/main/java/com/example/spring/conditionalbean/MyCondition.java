package com.example.spring.conditionalbean;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;

public class MyCondition implements Condition {
    @Override
    public boolean matches(ConditionContext context, AnnotatedTypeMetadata metadata) {
        // String enabled = System.getProperty("enableMyBean");
        //  return "true".equalsIgnoreCase(enabled);
        String environment = "production";
        boolean flag = false;
        if (environment.equalsIgnoreCase("production")) {
            flag = true;
        }
        return flag;
    }
}
