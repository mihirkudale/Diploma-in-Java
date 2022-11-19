package org.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.model.Order;

	
public class DataAccessOrder {
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
	public static int addOrder(Order o)
	{
		int i=0;
		
		Connection conn =DataAccessOrder.makeConnection();
		try 
		{
			PreparedStatement pstmt = conn.prepareStatement("insert into Order_Details(Order_Id,Book_Id,Cust_Name, Phone_No, Address, Order_Date, Quantity)values(?,?,?,?,?,?,?)");
			pstmt.setString(1,o.getOrder_Id());
			pstmt.setString(2,o.getBook_Id());
			pstmt.setString(3,o.getCust_Name());
			pstmt.setString(4,o.getPhone_No());
			pstmt.setString(5,o.getAddress());
			pstmt.setString(6,o.getOrder_Date());
			pstmt.setString(7,o.getQuantity());
			i = pstmt.executeUpdate();
		} 
		catch (SQLException e) 
		{
			e.printStackTrace();
		}
		return i;
	}
	public static int selectOrder(Order o) {
		int Order_Id = 0;
		
		Connection conn = DataAccessOrder.makeConnection();
		
		try 
		{
			PreparedStatement pstmt = conn.prepareStatement("select Order from Order_Details where Order_Id=?");
			
			pstmt.setString(1, o.getOrder_Id());
			
			ResultSet rs = pstmt.executeQuery();
			
			while(rs.next())
			{
				Order_Id=rs.getInt(1);
			}
			System.out.println("Order_Id");
		}
		catch (SQLException e) 
		{
			e.printStackTrace();
		}
		return Order_Id;
	}
}



