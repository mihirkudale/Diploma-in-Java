import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class RegisterServlet extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String name =req.getParameter("name");
		String city =req.getParameter("city");
		String username =req.getParameter("username");
		String password =req.getParameter("password");
		
		System.out.println(name);
		System.out.println(city);
		System.out.println(username);
		System.out.println(password);
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("Driver Loaded");
			
			
			Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/java215","root","root");
			System.out.println("Connection Success");
			
			PreparedStatement pstmt=conn.prepareStatement("insert into user(name, city, username, password) values(?,?,?,?)");
					pstmt.setString(1, name);
					pstmt.setString(2, city);
					pstmt.setString(3, username);
					pstmt.setString(4, password);
					
					int i= pstmt.executeUpdate();
					
					if (i==1) {
						System.out.println("success");
						resp.sendRedirect("Login.html");
						}
						
						else {
							System.out.println("error");
							resp.sendRedirect("Register.html");
						}
					
			
		} catch (ClassNotFoundException|SQLException e) {
			e.printStackTrace();
		}
		
		
		
	}

}


