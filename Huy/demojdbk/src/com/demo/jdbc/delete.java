package com.demo.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class delete {
	public static void main(String [] args) {
		try {
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost/book?user='root'&pass=");
			Statement statement = connection.createStatement();

			String delete ="delete from books where `title` like 'Mat Biec'";
			int up = statement.executeUpdate(delete);
			System.out.println(up+" hello");

//			ResultSet resultSet= statement.executeQuery("select * from phong");
//			while(resultSet.next()) {
//				System.out.println(
//						resultSet.getString(1)+"_"+
//								resultSet.getString(2)+"_"+
//								resultSet.getInt(3)+"_"+
//								resultSet.getInt(4)+"_"+
//								resultSet.getString(5)
//						);
//			}
			connection.close();
		} 
		catch(SQLException e) {
			e.printStackTrace();
		}
	}
}
