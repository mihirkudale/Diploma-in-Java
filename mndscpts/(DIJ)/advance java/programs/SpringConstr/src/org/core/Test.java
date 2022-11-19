package org.core;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("SpringConfig.xml");
		
		 Emp e=(Emp) context.getBean("emp");
		e.show();
	}
}
