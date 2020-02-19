package com.dao;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.ServletException;

import com.db.JdbcConnection;
import com.model.User;

public class UserDao {

	public int dangkyUser(User user) {
		String insertUser = "insert into user (username, password) values(?,?)";

		int record = 0;
		try {
			Connection con = JdbcConnection.getConnection();
			PreparedStatement ps = con.prepareStatement(insertUser);
			ps.setString(1, user.getUsername());
			ps.setString(2, user.getPassword());

			record = ps.executeUpdate();
			System.out.println(record);
			con.close();
		} catch (Exception e) {
			// TODO: handle exception
		}
		return record;
	}

	public boolean checkUser(User user) throws ServletException, IOException {
		boolean status = false;
		try {
			Connection con = JdbcConnection.getConnection();
			PreparedStatement ps = con.prepareStatement("select * from user where username = ? and password = ?");
			ps.setString(1, user.getUsername());
			ps.setString(2, user.getPassword());
			
			System.out.println(ps);
			ResultSet rs = ps.executeQuery();
			status = rs.next();
			con.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return status;
	}
	
	
	
}
