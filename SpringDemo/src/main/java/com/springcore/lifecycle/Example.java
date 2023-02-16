package com.springcore.lifecycle;
import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
public class Example {
    private String subject;
    public Example() {
        super();
    }
    public String getSubject() {
        return subject;
    }
    public void setSubject(String subject) {
        System.out.println("Setting subject");
        this.subject = subject;
    }
    @Override
    public String toString() {
        return "Example [subject=" + subject + "]";
    }
    
    @PostConstruct
    public void init()
    {
        System.out.println("Welcome, initializing third bean");
    }
    
    @PreDestroy
    public void destroy()
    {
        System.out.println("Destroyed 3rd bean");
    }
}