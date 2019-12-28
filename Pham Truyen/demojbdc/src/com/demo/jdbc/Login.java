package com.demo.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class Login {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Moi ban nhap ten: ");
		String user = sc.nextLine();
		
		System.out.println("Moi ban nhap mat khau: ");
		String pass = sc.nextLine();
		
		try {
			if(user.equals("") || pass.equals("")) {
				System.out.println("Vui long nhap lai");
			}else {
				Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/login","root","");
				String sqlLogin = "Select * from users where username=? and password=?";
				PreparedStatement ps = con.prepareStatement(sqlLogin);
				ps.setString(1, user);
				ps.setString(2, pass);
				ResultSet rs = ps.executeQuery();
				if(rs.next()) {
					System.out.println("Login thanh cong");
				}else {
					System.out.println("Login that bai");
				}
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
