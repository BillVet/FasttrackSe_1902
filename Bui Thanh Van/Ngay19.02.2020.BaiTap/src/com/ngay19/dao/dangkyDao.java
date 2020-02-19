package com.ngay19.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import com.ngay19.db.ConnectionJDBC;
import com.ngay19.model.user;

public class dangkyDao {
public int dangkyUser(user user) {
		
		String insertUser = "INSERT INTO user(username, password, fullname, email) values(?,?,?,?)";
		
		int record = 0;
		try {
			Connection connection = ConnectionJDBC.getJDBCConnection();
			PreparedStatement preparedStatement = connection.prepareStatement(insertUser);
			preparedStatement.setString(1, user.getUsername());
			preparedStatement.setString(2, user.getPassword());
			preparedStatement.setString(3, user.getFullname());
			preparedStatement.setString(4, user.getEmail());
			preparedStatement.executeUpdate();
			System.out.print(record);
			connection.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
		return record;
	}

}
