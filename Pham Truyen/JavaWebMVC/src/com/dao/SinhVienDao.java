package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.db.JdbcConnection;
import com.model.SinhVien;

public class SinhVienDao {

	public List<SinhVien> getAllSinhvien() {
		List<SinhVien> listSinhvien = new ArrayList<SinhVien>();

		try {
			Connection con = JdbcConnection.getConnection();
			Statement statement = con.createStatement();
			ResultSet rs = statement.executeQuery("select * from sinhvien");

			while(rs.next()) {
				SinhVien sv = new SinhVien();
				sv.setId(rs.getInt("id"));
				sv.setName(rs.getString("name"));
				sv.setAge(rs.getInt("age"));
				sv.setClas(rs.getString("clas"));
				sv.setGender(rs.getString("gender"));

				listSinhvien.add(sv);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return listSinhvien;
	}

	public int insert(SinhVien sinhvien) {
		String insertUser = "insert into sinhvien values(?,?,?,?,?)";

		int record = 0;
		try {
			Connection con = JdbcConnection.getConnection();
			PreparedStatement ps = con.prepareStatement(insertUser);
			ps.setInt(1, sinhvien.getId());
			ps.setString(2, sinhvien.getName());
			ps.setInt(3, sinhvien.getAge());
			ps.setString(4, sinhvien.getClas());
			ps.setString(5, sinhvien.getGender());

			record = ps.executeUpdate();
			System.out.println(record);
			con.close();
		} catch (Exception e) {
			// TODO: handle exception
		}
		return record;
	}

}

