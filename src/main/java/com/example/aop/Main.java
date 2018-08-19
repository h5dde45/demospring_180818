package com.example.aop;

import com.example.aop.obj.SomeService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("cntxt.xml");
        SomeService service = (SomeService) context.getBean("someService");
        double value = service.getDoubleValue();
    }
}
