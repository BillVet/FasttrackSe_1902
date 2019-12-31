package com.demo.jdbc;

import java.sql.DriverManager;
import java.sql.SQLException;

import com.mysql.jdbc.Connection;

public class MyConnectionJdbc4 {
		public static void main(String[] args) {
			try {
				Connection connection = (Connection) DriverManager.getConnection ("jdbc:mysql://localhost:3306/layloihoi_db?user='root'&pass=");
				if(connection != null) {
					System.out.println("ket noi thanh cong");
				}
			} catch(SQLException e) {
				System.out.println("ket noi that bai");
				e.printStackTrace();
			}
		}
	}


