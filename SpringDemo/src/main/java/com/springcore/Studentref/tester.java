package com.springcore.Studentref;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class tester
{
    public static void main( String[] args )
    {
        //System.out.println( "Hello World!" );
        
        ApplicationContext context = new ClassPathXmlApplicationContext("Studentrefconfig.xml");
        Student stu1 = (Student) context.getBean("sturef");
        System.out.println(stu1);
       
    }
}