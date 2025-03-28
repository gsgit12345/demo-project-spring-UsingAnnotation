package com.example.spring.controller;

import com.example.spring.service.EmployeeService;
import org.springframework.stereotype.Controller;

@Controller
public class EmployeeController {

    private final EmployeeService service;

    EmployeeController(EmployeeService service)
    {
        this.service=service;
    }
    public String sayHello()
    {
      return   service.sayHello();
    }
}
