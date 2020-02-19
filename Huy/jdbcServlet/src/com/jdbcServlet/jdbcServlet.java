package com.jdbcServlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mysql.jdbc.Statement;
@WebServlet(urlPatterns = {"/listbooks"})
public class jdbcServlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		
		PrintWriter pw = resp.getWriter();
		Connection connection = JdbcConnection.getJdbcConnection();
		
		try {
			java.sql.Statement statement = connection.createStatement();
			String sql = "Select  * from books";
			ResultSet rs = statement.executeQuery(sql);
			while(rs.next()) {
				pw.println(rs.getInt("id")+ "....");
				pw.println(rs.getString("title")+ ".... ");
				pw.println(rs.getString("author")+ "....");
				pw.println(rs.getFloat("price")+ "....");
				pw.println(rs.getInt("qty")+ "....");
			}
					
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			if(connection!=null) {
				try {
					connection.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			}
		}
	}
}
