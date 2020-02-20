package com.ngay19.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.ngay19.db.ConnectionJDBC;

import com.ngay19.model.user;

public class quanLyThanhVien {
	public List<user> user(){
		List<user> listThanhVien = new ArrayList<user>();
		try {
			Connection connection = ConnectionJDBC.getJDBCConnection();
			PreparedStatement preparedStatement = connection.prepareStatement("SELECT * FROM user");
			ResultSet resultSet = preparedStatement.executeQuery();
			while (resultSet.next()) {
				user user = new user();
				user.setUserid(resultSet.getInt("userid"));
				user.setUsername(resultSet.getString("username"));
				user.setPassword(resultSet.getString("password"));
				user.setFullname(resultSet.getString("fullname"));
				user.setEmail(resultSet.getString("email"));
				user.setRole(resultSet.getInt("role"));
				listThanhVien.add(user);
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		return listThanhVien;
	}
public static int xoa(String id) {
		
		String delete = "DELETE FROM `user` WHERE userid = '"+id+"'";
		
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
