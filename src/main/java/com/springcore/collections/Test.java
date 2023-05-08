package com.springcore.collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext context=new ClassPathXmlApplicationContext("file:src/main/java/com/springcore/collections/collectionconfig.xml");
        Emp emp= context.getBean("emp",Emp.class);
        System.out.println(emp.getName());
        System.out.println(emp.getPhones());
        System.out.println(emp.getAddresses());
        System.out.println(emp.getCourses());
        System.out.println(emp.getProps());

        System.out.println(emp.getPhones().getClass().getName()); //standalone collection
    }
}
