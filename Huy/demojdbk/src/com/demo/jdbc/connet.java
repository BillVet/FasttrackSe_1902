package com.demo.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class connet {
	public static void main(String [] args) {
		String databaseUrl = "jdbc:mysql://localhost:3306/karaoke";
		String user= "root";
		String pass= "";
		Connection connection = null;

		try {
			Class.forName("com.mysql.jdbc.Driver");
			connection = DriverManager.getConnection(databaseUrl, user, pass);
			if( connection !=null) {
				System.out.println("Thanh cong");
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		catch(SQLException e) {
			System.out.println("That bai");
			e.printStackTrace();
		}
	}
}
