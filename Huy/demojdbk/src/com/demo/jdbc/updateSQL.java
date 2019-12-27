package com.demo.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class updateSQL {
	public static void main(String [] args) {
		try {
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost/book?user='root'&pass=");
			Statement statement = connection.createStatement();

			String update ="update books set `title`='Apple',`author`='Huy',`price`=9999,`qty`=123 where `id` like '3005'";
			int up = statement.executeUpdate(update);
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
