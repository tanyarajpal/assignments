package com.springcore.collections;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class test
{
    public static void main( String[] args )
    {
        //System.out.println( "Hello World!" );
        
        ApplicationContext context = new ClassPathXmlApplicationContext("collectionconfig.xml");
        Emp emp1 = (Emp) context.getBean("emp1");
        System.out.println(emp1);
       
    }
}
