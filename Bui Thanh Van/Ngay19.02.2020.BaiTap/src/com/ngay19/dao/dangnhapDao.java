package com.ngay19.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.ngay19.db.ConnectionJDBC;
import com.ngay19.model.user;

public class dangnhapDao {
	
	public int dangnhapUser(user user) {
		int ketqua = 0;
		try {
			Connection connection = ConnectionJDBC.getJDBCConnection();
			PreparedStatement preparedStatement = connection.prepareStatement("SELECT * From user where username=? And password=?");
			preparedStatement.setString(1, user.getUsername());
			preparedStatement.setString(2, user.getPassword());
			ResultSet resultSet = preparedStatement.executeQuery();
			if(resultSet.next()) {
				ketqua = 1;
			} else {
				ketqua = 0;
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
		return ketqua;
	}
}
