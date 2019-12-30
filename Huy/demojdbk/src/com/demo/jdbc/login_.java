package com.demo.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class login_ {
	Scanner sc = new Scanner(System.in);
	public void main() {
		System.out.println("Tên đăng nhập: ");
		String user = sc.nextLine();
		System.out.println("Mật khẩu: ");
		String pass = sc.nextLine();
		try {
			if(user.equals("") || pass.equals("")) {
				System.out.println("Vui long nhap lai");
			}else {
				Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/login","root","");
				PreparedStatement ps = con.prepareStatement("Select * from users where username=? and password=?");
				ps.setString(1, user);
				ps.setString(2, pass);
				ResultSet rs = ps.executeQuery();
				if(rs.next()) {
					System.out.println("Login thanh cong");
					
					System.out.println("-------------");
					if(rs.getString(3).equals("CB")) {
						ps = con.prepareStatement("select `HoTen` from thongtin where  username=?");
						ps.setString(1,rs.getString(1));
						ResultSet rs2 = ps.executeQuery();
						if(rs2.next()) {
							System.out.println("chào mừng cán bộ "+rs2.getString(1));
							System.out.println("-------------");
						}
						do {
							System.out.println("MENU");
							System.out.println("1. thêm sinh viên");
							System.out.println("2. xóa sinh viên");
							System.out.println("3. hiển thị sinh viên");
							int choose = sc.nextInt();
							switch(choose)
							{
							case 1:
								add();
								break;
							case 2:
								delete();
								break;
							case 3:
								show();
								break;
							default:
								break;		
							}

						}while(true);

					}else {
						ps = con.prepareStatement("select `HoTen` from thongtin where  username=?");
						ps.setString(1,rs.getString(1));
						ResultSet rs2 = ps.executeQuery();
						if(rs2.next()) {
							System.out.println("chào mừng giảng viên "+rs2.getString(1));
							System.out.println("-------------");
						}
						show();
					}
				}else {
					System.out.println("Login that bai");
				}
				con.close();
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	private void show() {
		try {
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/login","root","");
			Statement statement = con.createStatement();
			ResultSet resultSet= statement.executeQuery("select * from sinhvien");
			while(resultSet.next()) {
				System.out.println(
						"Tên:"+resultSet.getString(1)+
						"    Lớp:"+resultSet.getString(2)+
						"    Mã:"+resultSet.getString(3)
						);
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private void delete() {
		
		System.out.println("Nhập mã của sinh viên cần xóa: ");
		String maSV = sc.nextLine();

		try {
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/login","root","");
			PreparedStatement PreS = con.prepareStatement("delete from `sinhvien` where MaSV = ?");
			PreS.setString(1,maSV);

			int a= PreS.executeUpdate();
			System.out.println(a+" sinh viên đã bị xóa bỏ");

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

		}
	}

	public void add() {
		String afh= sc.nextLine();
		System.out.println("Nhập tên sinh viên: ");
		String ten = sc.nextLine();
		System.out.println("Nhập lớp :");
		String lop = sc.nextLine();
		System.out.println("Nhập id:");
		String maSV = sc.nextLine();
		try {
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/login","root","");
			PreparedStatement PreS = con.prepareStatement("insert into sinhvien values(?,?,?)");
			PreS.setString(1, ten);
			PreS.setString(2,lop);
			PreS.setString(3,maSV);
			int a= PreS.executeUpdate();
			System.out.println(a+" sinh viên đã được thêm");

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}