package com.ngay19.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import com.ngay19.db.ConnectionJDBC;
import com.ngay19.model.categories;
public class ThemDanhMucDao {
public int themDanhMuc(categories categories) {
		
		String insertUser = "INSERT INTO categories(category_id, category_name) values(?,?)";
		
		int record = 0;
		try {
			Connection connection = ConnectionJDBC.getJDBCConnection();
			PreparedStatement preparedStatement = connection.prepareStatement(insertUser);
			preparedStatement.setInt(1, categories.getCategory_id());
			preparedStatement.setString(2, categories.getCategory_name());
			preparedStatement.executeUpdate();
			System.out.print(record);
			connection.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
		return record;
	}
public List<categories> categories(){
	List<categories> listDanhSachDanhMuc = new ArrayList<categories>();
	try {
		Connection connection = ConnectionJDBC.getJDBCConnection();
		PreparedStatement preparedStatement = connection.prepareStatement("SELECT * FROM categories");
		ResultSet resultSet = preparedStatement.executeQuery();
		while (resultSet.next()) {
			categories categories = new categories();
			categories.setCategory_id(resultSet.getInt("category_id"));
			categories.setCategory_name(resultSet.getString("category_name"));
			listDanhSachDanhMuc.add(categories);
		}
	} catch (Exception e) {
		// TODO: handle exception
	}
	return listDanhSachDanhMuc;
}
public static int xoaDanhMuc(String id) {
	
	String delete = "DELETE FROM `categories` WHERE category_id = '"+id+"'";
	
	int record = 0;
	try {
		Connection connection = ConnectionJDBC.getJDBCConnection();
		PreparedStatement preparedStatement = connection.prepareStatement(delete);
		preparedStatement.executeUpdate();
		connection.close();
	}catch(Exception e) {
		e.printStackTrace();
	}
	
	return record;
}
}
