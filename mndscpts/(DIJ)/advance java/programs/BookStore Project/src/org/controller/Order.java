package org.controller;

	import java.io.IOException;
	import javax.servlet.ServletException;
	import javax.servlet.annotation.WebServlet;
	import javax.servlet.http.HttpServlet;
	import javax.servlet.http.HttpServletRequest;
	import javax.servlet.http.HttpServletResponse;

import org.DAO.DataAccessAdmin;
import org.DAO.DataAccessUser;
import org.model.Book;

	@WebServlet("/Order")
	public class Order extends HttpServlet {
		
		protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String Book_Id =req.getParameter("Book_Id");
		String Book_Name =req.getParameter("Book_Name");
		String Author =req.getParameter("Author");
		String Price =req.getParameter("Price");
		
		System.out.println(Book_Id);
		System.out.println(Book_Name);
		System.out.println(Author);
		System.out.println(Price);
		
		Book b =new Book();
		b.setBook_Id(Book_Id);
		b.setBook_Name(Book_Name);
		b.setAuthor(Author);
		b.setPrice(Price);

		int i =DataAccessAdmin.selectBook(b);
		
		if(i == 1)
		{
			System.out.println("Books Added Succesfully");
		}
		else
		{
			System.out.println("Error");
			resp.sendRedirect("Error.jsp");
		}
		}

	}
