

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


@WebServlet("/Delete")
public class Delete extends HttpServlet {
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		int id=Integer.parseInt(req.getParameter("id"));
		
		
		System.out.println(id);
		try {
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("Driver Loaded");
			
			Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/java215","root","root");
			System.out.println("Connection Success");
			

			PreparedStatement psmt=conn.prepareStatement("delete from user where id=?");
			psmt.setInt(1, id);
			
			int i=psmt.executeUpdate();
			
			if (i==1) {
				System.out.println("id deleted successfully");
				
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
	