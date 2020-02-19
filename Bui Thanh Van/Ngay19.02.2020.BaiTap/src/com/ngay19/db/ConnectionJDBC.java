package com.ngay19.db;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionJDBC {
	public static Connection getJDBCConnection() {
		String url = "jdbc:mysql://localhost:3306/db_new";
		String user = "root";
		String password = "";
		Connection connection = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			connection = DriverManager.getConnection(url,user,password);
		}catch(Exception e) {
			
		}
		return connection;
	}
}
