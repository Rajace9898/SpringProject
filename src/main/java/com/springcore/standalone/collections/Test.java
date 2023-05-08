package com.springcore.standalone.collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {

        ApplicationContext context=new ClassPathXmlApplicationContext("file:src/main/java/com/springcore/standalone/collections/aloneconfig.xml");
        Person person=context.getBean("person",Person.class);
        System.out.println(person);
        System.out.println(person.getFriends().getClass().getName());
        System.out.println("-------------------------------------");
        System.out.println(person.getFeeStructure());
        System.out.println(person.getFeeStructure().getClass().getName());
        System.out.println("-------------------------------------");
        System.out.println(person.getProperties());
    }
}
