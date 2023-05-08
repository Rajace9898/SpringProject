package com.springcore.autowire.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext context=new ClassPathXmlApplicationContext("file:src/main/java/com/springcore/autowire/annotation/autoconfig.xml");
        Emp emp=context.getBean("emp", Emp.class);
        System.out.println(emp);

    }
}
