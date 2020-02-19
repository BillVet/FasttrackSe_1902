package com.jdbcServlet;

import java.sql.Connection;
import java.sql.DriverManager;

public class JdbcConnection {
	
	public static Connection getJdbcConnection() {

		String url ="jdbc:mysql://localhost:3306/book";
		String user ="root" ;
		String pass ="";
		try {
			Class.forName("com.mysql.jdbc.Driver");
			return DriverManager.getConnection(url,user, pass);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return null;
	}
	public static void main(String[] args) {
		Connection connec = getJdbcConnection();
	}
}
