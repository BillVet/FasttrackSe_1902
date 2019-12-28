package com.demo.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class suademo {

	public static void main(String[] args) {
		try {
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/ft1009","root","");
			Statement statement = connection.createStatement();
			
			String sql = "update sinhvien set name = 'Nguyen An' where name = 'Nguyen Van A';";
			
			statement.executeUpdate(sql);
			
			System.out.println("Update!");
			
			ResultSet resultSet = statement.executeQuery("select * from sinhvien");
			
			while(resultSet.next()) {
				System.out.println(resultSet.getInt(1)+"-"+resultSet.getString(2)+"-"+resultSet.getInt(3)+"-"+resultSet.getString(4)+"-"+resultSet.getString(5));
			}
			connection.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
