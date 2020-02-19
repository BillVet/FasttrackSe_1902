package com.form.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.form.db.jdbcConnection;
import com.form.model.User;

public class UserDAO {
	
	public int dangki(User user) {
		int record = 0;
		try {
			String insertUser="INSERT INTO `user`(`USERNAME`, `PASSWORD`) VALUES (?,?)";
			Connection connect= jdbcConnection.getJdbcConnection();
			
			PreparedStatement ps = connect.prepareStatement(insertUser);
			ps.setString(1, user.getUsername());
			ps.setString(2, user.getPassword());

			record = ps.executeUpdate();
			System.out.println(record);
			
			connect.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return record;
	}
	
	public String dangnhap(User user) {
		String name=null;
		try {
			Connection connect= jdbcConnection.getJdbcConnection();
			String sql="SELECT * FROM `user` where username=? and password=?";
			PreparedStatement ps= connect.prepareStatement(sql);
			ps.setString(1, user.getUsername());
			ps.setString(2, user.getPassword());
			
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				name = user.getUsername();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return name;
	}

}
