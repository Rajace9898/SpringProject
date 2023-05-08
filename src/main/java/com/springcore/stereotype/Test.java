package com.springcore.stereotype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext context=new ClassPathXmlApplicationContext("file:src/main/java/com/springcore/stereotype/stereoconfig.xml");
        Student student=context.getBean("object",Student.class);
        System.out.println(student);
    }
}
