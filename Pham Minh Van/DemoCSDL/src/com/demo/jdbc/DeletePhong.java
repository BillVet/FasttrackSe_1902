package com.demo.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DeletePhong {

	public static void main(String[] args) {
		try {
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/layloihoi_db","root","");
			Statement statement = connection.createStatement();
			String deletePhong = "DELETE FROM phong WHERE phong.MaPhong >= '4'";
			System.out.println("Cau lenh delete:"+deletePhong);
			
			
			int recordePhong = statement.executeUpdate(deletePhong);
			System.err.println(recordePhong+"Mot phong da duoc xóa");
			
			String listPhong = "select * from phong";
			System.out.println("cau lenh select phong");
			ResultSet resultSet = statement.executeQuery(listPhong);
			
					while(resultSet.next()) {
						System.out.println(resultSet.getString(1)+"-"+resultSet.getString(2)+"-"+resultSet.getInt(3)+"-"+resultSet.getFloat(4)+"-"+resultSet.getString(5));
					}
			connection.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
