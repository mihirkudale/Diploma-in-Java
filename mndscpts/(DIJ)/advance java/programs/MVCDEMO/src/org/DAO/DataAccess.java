package org.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.model.User;

public class DataAccess {
public static Connection makeConnection()
{
	Connection conn =null;
  try {
	Class.forName("com.mysql.jdbc.Driver");
	System.out.println("driver loaded");
	conn =DriverManager.getConnection("jdbc:mysql://localhost:3308/java215","root","root");
	System.out.println("connection success");
} catch (ClassNotFoundException | SQLException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
return conn;
}
public static int addUser(User u)
{
	int i=0;
	
	Connection conn =DataAccess.makeConnection();
	try {
		PreparedStatement pstmt = conn.prepareStatement("insert into user(name,city,username,password)values(?,?,?,?)");
		pstmt.setString(1,u.getName() );
		pstmt.setString(2,u.getCity() );
		pstmt.setString(3,u.getUsername());
		pstmt.setString(4,u.getPassword()) ;
		
		i = pstmt.executeUpdate();
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	return i;
	
	
}

public static int selectUser(User u)
{
	int id = 0;
	
	Connection conn = DataAccess.makeConnection();
	
	try {
		PreparedStatement pstmt = conn.prepareStatement("select id from user where username = ? and password = ?") ;
		
		pstmt.setString(1, u.getUsername());
		pstmt.setString(2, u.getPassword());
		
		ResultSet rs = pstmt.executeQuery();
		
		while(rs.next())
		{
			id=rs.getInt(1);
			}
		
		System.out.println(id);
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	
	return id;
	
}
}
