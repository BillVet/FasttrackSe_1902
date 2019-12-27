package com.demo.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class connec {
	public static void main(String [] args) {
		try {
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost/karaoke?user='root'&pass=");
			Statement statement = connection.createStatement();

			String insert ="insert into phong values ('8','loai3',20,123456,'shellz')";
			int up = statement.executeUpdate(insert);
			System.out.println(up+" hello");

			ResultSet resultSet= statement.executeQuery("select * from phong");
			while(resultSet.next()) {
				System.out.println(
						resultSet.getString(1)+"_"+
								resultSet.getString(2)+"_"+
								resultSet.getInt(3)+"_"+
								resultSet.getInt(4)+"_"+
								resultSet.getString(5)
						);
			}
			connection.close();
		} 
		catch(SQLException e) {
			e.printStackTrace();
		}
	}
}
