package com.demo.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertInto {
	public static void main(String[] args) {
		try {
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/layloihoi_db","root","");
		Statement statement = connection.createStatement();
		String chenvaoPhong = "insert into phong values('5','VIP',5,1000.00,'Thoai mai')";
		System.out.println("Cau lenh ínert:"+chenvaoPhong);
		int recordePhong = statement.executeUpdate(chenvaoPhong);
		System.err.println(recordePhong+"Mot phong da duoc them vao");
		
		String listPhong = "select * from phong";
		System.out.println("cau lenh select phong");
		ResultSet resultSet = statement.executeQuery(listPhong);  //tạo biến result để chứa các recorde sao đó chạy xoay vòng dưới vòng while.
		
				while(resultSet.next()) {
					System.out.println(resultSet.getString(1)+"-"+resultSet.getString(2)+"-"+resultSet.getInt(3)+"-"+resultSet.getFloat(4)+"-"+resultSet.getString(5));
				}
		connection.close();
	} catch (SQLException e) {
		e.printStackTrace();
	}
}
}
