package org.DAO;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.model.Employee;

public class DataAccess {
public static void addUser(Employee emp)
{
	System.out.println("start");
	
	Configuration cfg = new Configuration();
	cfg.configure("Employee.cfg.xml");
	
	SessionFactory sf = cfg.buildSessionFactory();
	Session s = sf.openSession();
	Transaction t = s.beginTransaction();
	
	Employee e =new Employee();
	e.setId(emp.getId());
	e.setName(emp.getName());
	e.setSalary(emp.getSalary());
	
	
	
	s.save(e);
	t.commit();
	s.close();
	sf.close();
	System.out.println("END");
}
}
