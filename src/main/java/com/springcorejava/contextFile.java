package com.springcorejava;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class contextFile {
    public static void main(String[] args) {
        ApplicationContext context= new ClassPathXmlApplicationContext("file:src/main/java/config.xml");
        Person person=context.getBean("person",Person.class);
        Person person1= context.getBean("person1",Person.class);
        System.out.println(person);
        System.out.println(person1);

    }
}
