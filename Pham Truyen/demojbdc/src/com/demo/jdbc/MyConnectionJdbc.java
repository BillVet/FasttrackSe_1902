package com.demo.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
//import java.sql.SQLException;

public class MyConnectionJdbc {

	public static void main(String[] args) {
//		String databaseUrl = "jdbc:mysql://localhost:3306/ft1009";
//		String user = "root";
//		String pass = "";
//		Connection connection = null;
//		try {
//			Class.forName("com.mysql.jdbc.Driver");
//			connection = DriverManager.getConnection(databaseUrl, user, pass);
//			if(connection != null) {
//				System.out.println("ket noi thanh cong");
//			}
//		} catch (ClassNotFoundException e) {
//			e.printStackTrace();
//		} catch (SQLException e) {
//			System.out.println("ket noi that bai");
//			e.printStackTrace();
//		}
		
		try {
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/ft1009?user='root'&pass=");
			if(connection != null) {
				System.out.println("ket noi thanh cong");
			}
		} catch (Exception e) {
			System.out.println("ket noi that bai");
			e.printStackTrace();
		}
	}
}
