package org.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.model.User;

public class DataAccessUser 
{
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
public static int addUser(User u)
{
	int i=0;
	
	Connection conn =DataAccessUser.makeConnection();
	try 
	{
		PreparedStatement pstmt = conn.prepareStatement("insert into User(User_Id,Name,City,Username,Password)values(?,?,?,?,?)");
		pstmt.setString(1,u.getUser_Id());
		pstmt.setString(2,u.getName());
		pstmt.setString(3,u.getCity());
		pstmt.setString(4,u.getUsername());
		pstmt.setString(5,u.getPassword());
		i = pstmt.executeUpdate();
	} 
	catch (SQLException e) 
	{
		e.printStackTrace();
	}
	return i;
}

public static int selectUser(User u)
{
	int User_Id = 0;
	
	Connection conn = DataAccessUser.makeConnection();
	
	try 
	{
		PreparedStatement pstmt = conn.prepareStatement("select User_Id from User where Username=? and Password=?") ;
		
		pstmt.setString(1, u.getUsername());
		pstmt.setString(2, u.getPassword());
		
		ResultSet rs = pstmt.executeQuery();
		
		while(rs.next())
		{
			User_Id=rs.getInt(1);
		}
		System.out.println(User_Id);
	}
	catch (SQLException e) 
	{
		e.printStackTrace();
	}
	return User_Id;
}
}
