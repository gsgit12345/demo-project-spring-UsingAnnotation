package com.example.spring.scopebean;

import com.example.spring.qualifierannotation.AssociationService;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.InitBinder;

public class Address implements DisposableBean, InitializingBean {
    public Address() {

    }

    @Override
    public void destroy() throws Exception {
        System.out.println("destroying the bean");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("bean has been initialized");
    }
}
