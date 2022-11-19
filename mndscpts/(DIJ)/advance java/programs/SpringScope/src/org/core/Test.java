package org.core;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("SpringConfig.xml");
		 Rest r1=(Rest) context.getBean("rest");
		 r1.setNote("Welcome");
		 r1.getNote();
		 System.out.println(r1);
		 r1.show();
		 
		 Rest r2=(Rest) context.getBean("rest");
		 r2.getNote();
		 System.out.println(r2);
		 r2.show();
	}
}
