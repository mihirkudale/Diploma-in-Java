package org.core;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring 
{
	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("SpringCfg.xml");
		
		Restaurant restaurantObj=(Restaurant) context.getBean("restaurantbean");
		
				restaurantObj.greetCustomer();

	}
}