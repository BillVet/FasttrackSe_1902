package com.form.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class jdbcConnection {

	public static Connection getJdbcConnection() throws SQLException {
		String url = "jdbc:mysql://localhost:3306/book?useUnicode=true&characterEncoding=UTF-8";
		String user = "root";
		String password = "";
		Connection conn = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection(url,user,password);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		return conn;
	}
}
