

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/UpdateCity")
public class UpdateCity extends HttpServlet {
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		int id=Integer.parseInt(req.getParameter("id"));
		String city=req.getParameter("city");
		
		System.out.println(id);
		System.out.println(city);
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("Driver Loaded");
			
			Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/java215","root","root");
			System.out.println("Connection Success");
			

			PreparedStatement psmt=conn.prepareStatement("update user set city=? where id=?");
			psmt.setString(1, city);
			psmt.setInt(2, id);
			
			int i=psmt.executeUpdate();
			
			if (i==1) {
				System.out.println("city updated successfully");
				
			}
			else {
				System.out.println("error");
				resp.sendRedirect("Error.html");
			}
		}
		catch (ClassNotFoundException|SQLException e) {
			e.printStackTrace();
		}
	}
}
	
