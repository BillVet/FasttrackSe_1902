package com.demo.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class PreStatement {

	public static void main(String[] args) {
		try {
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ft1009","root","");
			
			PreparedStatement ps = con.prepareStatement("insert into sinhvien values(?,?,?,?,?)");
//			PreparedStatement ps = con.prepareStatement("insert into sinhvien (id) values(?)"); neu them 1
			ps.setInt(1, 12);
			ps.setString(2, "Nguyen Thanh Thanh");
			ps.setInt(3, 20);
			ps.setString(4, "FFSE1705");
			ps.setString(5, "nu");
			
			int record = ps.executeUpdate();
			System.out.println(record + "Them 1 sinh vien thanh cong");
			
			ResultSet re = ps.executeQuery("select * from sinhvien");
			
			while(re.next()) {
				System.out.println(re.getInt(1)+"-"+re.getString(2)+"-"+re.getInt(3)+"-"+re.getString(4)+"-"+re.getString(5));
			}
			con.close();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
