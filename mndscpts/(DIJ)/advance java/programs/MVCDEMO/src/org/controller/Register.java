package org.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.DAO.DataAccess;
import org.model.User;


@WebServlet("/Register")
public class Register extends HttpServlet {
	
	
	
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	String name =req.getParameter("name");
	String city =req.getParameter("city");
	String username =req.getParameter("username");
	String password =req.getParameter("password");
	
	System.out.println(name);
	System.out.println(city);
	System.out.println(username);
	System.out.println(password);
	
	User u =new User();
	u.setName(name);
	u.setCity(city);
	u.setUsername(username);
	u.setPassword(password);

	int i =DataAccess.addUser(u);
	
	if(i == 1)
	{
		System.out.println("user added");
		resp.sendRedirect("Login.jsp");
	}
	else
	{
		System.out.println("error");
		resp.sendRedirect("Error.jsp");
		
	}
	}

}
