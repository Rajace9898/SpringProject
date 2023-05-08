package com.springcore.lifecycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        AbstractApplicationContext context=new ClassPathXmlApplicationContext("file:src/main/java/com/springcore/lifecycle/xmlconfig.xml");
//        Samosa samosa=context.getBean("samosa",Samosa.class);
//        System.out.println(samosa);
//
//        //registering shutdown hook
        context.registerShutdownHook();
//
//        System.out.println("++++++++++++++++++++++++++++");
//        Pepsi pepsi=context.getBean("pepsi",Pepsi.class);
//        System.out.println(pepsi);
//        context.registerShutdownHook();

        ExampleAnnotation exampleAnnotation=context.getBean("exampleAnnotation",ExampleAnnotation.class);
        System.out.println(exampleAnnotation);
    }
}
