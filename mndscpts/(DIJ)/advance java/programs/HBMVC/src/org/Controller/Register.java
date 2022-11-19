package org.Controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.DAO.DataAccess;
import org.infinispan.factories.ResponseGeneratorFactory;
import org.model.Employee;

import com.sun.xml.internal.ws.client.ResponseContextReceiver;

import jdk.nashorn.internal.ir.RuntimeNode.Request;



@WebServlet("/Register")
public class Register extends HttpServlet 
{
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException 
	{
		int id =Integer.parseInt(req.getParameter("id"));
		String name =req.getParameter("name");
		int salary =Integer.parseInt(req.getParameter("salary"));
		
		System.out.println(id);
		System.out.println(name);
		System.out.println(salary);
		
		Employee emp=new Employee();
		emp.setId(id);
		emp.setName(name);
		emp.setSalary(salary);

		try 
		{
			DataAccess.addUser(emp);
			resp.sendRedirect("delete.jsp");
			
		}
		catch (Exception e) 
		{
			resp.sendRedirect("error.jsp");
		}
	}
}