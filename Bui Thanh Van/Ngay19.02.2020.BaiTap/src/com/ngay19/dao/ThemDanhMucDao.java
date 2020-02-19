package com.ngay19.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

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

}
