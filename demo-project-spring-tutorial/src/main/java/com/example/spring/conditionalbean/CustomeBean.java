package com.example.spring.conditionalbean;

public class CustomeBean {
    String custome;
    public CustomeBean()
    {

    }
    public CustomeBean(String custome)
    {
        this.custome=custome;
    }
    public void printCustome()
    {
        System.out.println("printing the custome property::"+custome);
    }
}
