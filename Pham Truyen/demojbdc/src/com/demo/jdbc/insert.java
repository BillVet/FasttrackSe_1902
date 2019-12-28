package com.demo.jdbc;

	import java.sql.Connection;
	import java.sql.DriverManager;
//	import java.sql.ResultSet;
	import java.sql.SQLException;
	import java.sql.Statement;

public class insert {

	public static void main(String[] args) {
		try {
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/ft1009","root","");
				
			Statement statement = connection.createStatement();
				
			String insertsinhvien = "insert into sinhvien values (12,'Nguyen Van C',23,'FFSE1705,'1')";
			
			int recordesinhvien = statement.executeUpdate(insertsinhvien);
			System.out.println(recordesinhvien+"Mot sinh vien duoc them");
			
//			String listsinhvien = "select * from sinhvien";
//			ResultSet resultSet = statement.executeQuery(listsinhvien);
//			
//			while(resultSet.next()) {
//				System.out.println(resultSet.getInt(1)+"-"+resultSet.getString(2)+"-"+resultSet.getInt(3)+"-"+
//								   resultSet.getString(4)+"-"+resultSet.getString(5));
//			}
			connection.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}

