package org.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.DAO.DataAccessUser;
import org.model.User;


@WebServlet("/Register")
public class Register extends HttpServlet {
	
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	String User_Id =req.getParameter("User_Id");
	String Name =req.getParameter("Name");
	String City =req.getParameter("City");
	String Username =req.getParameter("Username");
	String Password =req.getParameter("Password");
	
	
	System.out.println(Name);
	System.out.println(City);
	System.out.println(Username);
	System.out.println(Password);
	
	User u =new User();
	u.setUser_Id(User_Id);
	u.setName(Name);
	u.setCity(City);
	u.setUsername(Username);
	u.setPassword(Password);

	int i =DataAccessUser.addUser(u);
	
	if(i == 1)
	{
		System.out.println("User Added");
		resp.sendRedirect("Login.jsp");
	}
	else
	{
		System.out.println("Error");
		resp.sendRedirect("Error.jsp");
	}
	}

}
