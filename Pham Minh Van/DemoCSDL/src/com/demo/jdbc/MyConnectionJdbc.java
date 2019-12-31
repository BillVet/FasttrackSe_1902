package com.demo.jdbc;

import java.sql.DriverManager;
import java.sql.SQLException;

import com.mysql.jdbc.Connection;

public class MyConnectionJdbc {
	public static void main(String[] args) {
		String databaseUrl = "jdbc:mysql://localhost:3306/layloihoi_db";
		String user = "root";
		String pass = "";
		Connection connection = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			connection = (Connection) DriverManager.getConnection(databaseUrl, user, pass);
			if(connection != null) {
				System.out.println("ket noi thanh cong");
			}
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch(SQLException e) {
			System.out.println("ket noi that bai");
			e.printStackTrace();
		}
	}
}
