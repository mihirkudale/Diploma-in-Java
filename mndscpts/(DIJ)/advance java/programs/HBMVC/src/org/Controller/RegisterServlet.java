package org.Controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.DAO.DataAccess;
import org.model.Employee;


@WebServlet("/RegisterServlet")
public class RegisterServlet extends HttpServlet {
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int id = Integer.parseInt(request.getParameter("id"));
		String name = request.getParameter("name");
		int salary = Integer.parseInt(request.getParameter("salary"));
		
		System.out.println(id);
		System.out.println(name);
		System.out.println(salary);
		
		
		Employee emp = new Employee();
		emp.setId(id);
		emp.setName(name);
		emp.setSalary(salary);
		
		try {
			DataAccess.addUser(emp);
			response.sendRedirect("Delete.jsp");
		}
		catch (Exception e) {
			response.sendRedirect("Error.jsp");
		}
		
	}

}
