

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@SuppressWarnings("serial")
@WebServlet("/Login")
public class Login extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String username=req.getParameter("uname");
		String password=req.getParameter("password");
		System.out.println(username);
		System.out.println(password);
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("Driver Loaded");
			
			Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/java215","root","root");
			System.out.println("Connection Success");
			
			PreparedStatement psmt=conn.prepareStatement("select id from user where username=? and password=?");
			psmt.setString(1, username);
			psmt.setString(2, password);
			
			ResultSet rs=psmt.executeQuery();
			int id=0;
			
			while (rs.next())
			{
				id=rs.getInt(1);
			}
			
			if (id !=0) {
				System.out.println("login success ");
				resp.sendRedirect("update.html");
			}
			else {
				System.out.println("error");
				resp.sendRedirect("Login.html");
			}

		} catch (ClassNotFoundException|SQLException e) {
			e.printStackTrace();
		}
	}
}
