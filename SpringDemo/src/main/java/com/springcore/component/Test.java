package com.springcore.component;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext context = new ClassPathXmlApplicationContext("./com/springcore/component/compconfig.xml");
//		Student student1 = context.getBean("student",Student.class);
//		System.out.println(student1);
		
		Person person1 = context.getBean("person",Person.class);
		System.out.println(person1);
	}

}
