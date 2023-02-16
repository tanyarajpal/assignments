package com.springcore.lifecycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/lifecycle/lifecycleconfig.xml");
//		Item item1 = (Item) context.getBean("firstitem");
//		System.out.println(item1);
		context.registerShutdownHook();
		
//		SecondItem item2 = (SecondItem) context.getBean("seconditem");
//		System.out.println(item2);
		
		Example ex1 = (Example) context.getBean("example");
		System.out.println(ex1);
	}

}
