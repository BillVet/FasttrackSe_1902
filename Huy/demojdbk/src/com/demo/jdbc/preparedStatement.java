package com.demo.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class preparedStatement {
	public static void main(String [] args) {
		try {
			Connection connect = DriverManager.getConnection("jdbc:mysql://localhost/book?user='root'&pass=");
			PreparedStatement PreS = connect.prepareStatement("insert into books values(?,?,?,?,?)");

			PreS.setInt(1, 4000);
			PreS.setString(2,"Mat Biec");
			PreS.setString(3,"Nguyen Nhat Anh");
			PreS.setFloat(4,66);
			PreS.setInt(5,12345);

			int a = PreS.executeUpdate();
			System.out.println(a+" hello");
			
			ResultSet resultSet= PreS.executeQuery("select * from books");
			while(resultSet.next()) {
				System.out.println(
					resultSet.getInt(1)+"_"+
					resultSet.getString(2)+"_"+
					resultSet.getString(3)+"_"+
					resultSet.getFloat(4)+"_"
				);
			}
			connect.close();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
