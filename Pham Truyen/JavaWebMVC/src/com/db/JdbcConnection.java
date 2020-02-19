package com.db;

import java.sql.Connection;
import java.sql.DriverManager;

public class JdbcConnection {
	
	public static Connection getConnection() {
		String url = "jdbc:mysql://localhost:3306/ft1009";
		String user = "root";
		String password = "";		
		Connection con = null;
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection(url, user, password);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return con;
	}
}
