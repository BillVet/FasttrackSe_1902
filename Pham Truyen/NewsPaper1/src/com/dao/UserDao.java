package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.db.JdbcConnection;
import com.model.User;

public class UserDao {
	public boolean loginCheck(User user) {
		boolean status = false;
		
		try {			
			Connection con = JdbcConnection.getConnection();
			String sqlLogin = "select * from user where username = ? and password = ?";
			PreparedStatement ps = con.prepareStatement(sqlLogin);
			ps.setString(1, user.getUsername());
			ps.setString(2, user.getPassword());
			
			ResultSet rs = ps.executeQuery();
			status = rs.next();
			con.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}
}
