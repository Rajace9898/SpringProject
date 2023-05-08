package com.springcore.lifecycle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class ExampleAnnotation {
    private String subject;

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public ExampleAnnotation(){
        super();
    }

    @Override
    public String toString() {
        return "ExampleAnnotation{" +
                "subject='" + subject + '\'' +
                '}';
    }

    @PostConstruct
    public void start()
    {
        System.out.println("starting method");
    }
    @PreDestroy
    public void end(){
        System.out.println("ending method");
    }
}
