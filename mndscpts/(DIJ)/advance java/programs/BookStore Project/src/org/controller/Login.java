package org.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.DAO.DataAccessUser;
import org.model.User;


@WebServlet("/Login")
public class Login extends HttpServlet {
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String uname = request.getParameter("uname");
		String password = request.getParameter("upass");
		
		System.out.println(uname);
		System.out.println(password);
		
		
		User u = new User();
		u.setUsername(uname);
		u.setPassword(password);
		
		int id = DataAccessUser.selectUser(u);
		
		if(id !=0)
		{
			System.out.println("Login Success");
		}
		else
		{
			System.out.println("Error");
			response.sendRedirect("Error.jsp");
		}
		
		
	}

}
