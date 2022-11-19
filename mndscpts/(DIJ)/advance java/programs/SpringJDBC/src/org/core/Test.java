package org.core;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test 
{
	public static void main(String[] args) 
	{
		ApplicationContext context = new ClassPathXmlApplicationContext("SpringConfig.xml");
		
		EmployeeDao dao = (EmployeeDao) context.getBean("edao");
		
		/*int status1 = dao.saveEmployee(new Employee(101, "ABC", 10000));
		
		System.out.println(status1);
		*/
		
		 /* int status2 = dao.updateEmployee(new Employee(101,"XYZ",15000));
		  
		  System.out.println(status2);
		 */
		
		
		  Employee e = new Employee(); 
		  e.setId(101); 
		  int status3 = dao.deleteEmployee(e); 
		  System.out.println(status3);
		 
		
	}

}
