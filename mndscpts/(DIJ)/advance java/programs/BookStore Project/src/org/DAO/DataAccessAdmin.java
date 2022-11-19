package org.DAO;


	import java.sql.Connection;
	import java.sql.DriverManager;
	import java.sql.PreparedStatement;
	import java.sql.ResultSet;
	import java.sql.SQLException;

	import org.model.Administrator;
    import org.model.Book;
    import org.model.Order;
    import org.model.User;
    

	public class DataAccessAdmin {
		public static Connection makeConnection()
		{
			Connection conn =null;
		  try {
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("Driver Loaded");
			conn =DriverManager.getConnection("jdbc:mysql://localhost:3306/bookstore","root","root");
			System.out.println("Connection Success");
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		return conn;
		}
	}