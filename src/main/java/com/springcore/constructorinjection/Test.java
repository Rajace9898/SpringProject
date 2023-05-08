package com.springcore.constructorinjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext context=new ClassPathXmlApplicationContext("file:src/main/java/com/springcore/constructorinjection/consconfig.xml");
        Human human=context.getBean("human",Human.class);
        System.out.println(human);

        Addition add=context.getBean("addition",Addition.class);
        add.doSum();

    }
}
