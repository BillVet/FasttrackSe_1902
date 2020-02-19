package Jdbc;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = {"/listStudent"})
public class JdbcServlet extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		
		PrintWriter pw = resp.getWriter();
		
		Connection connection = JdbcConnection.getJdbcConnection();
		
		try {
			Statement statement = connection.createStatement();
			String sql = "Select * from sinhvien";
			ResultSet resultSet = statement.executeQuery(sql);
			
			while (resultSet.next()) {
				pw.println(resultSet.getInt("id")+" - ");
				pw.println(resultSet.getString("name")+" - ");
				pw.println(resultSet.getInt("age")+" - ");
				pw.println(resultSet.getString("clas")+" - ");
				pw.println(resultSet.getString("gender")+"</br>");				
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			if(connection!=null) {
				try {
					connection.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}		
	}
}
