package MySQL;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class DangNhap {
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Nhập user");
		String user = s.nextLine();
		System.out.println("Nhập pass");
		String pass = s.nextLine();
		try {
			if(user.equals("") || pass.equals("")) {
				System.out.println( "Vui long dien day du thong tin");
			} else {
				 Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/user","root","");
				 PreparedStatement preparedStatement = connection.prepareStatement("SELECT * From dang_nhap where TenDangNhap=? And MatKhau=?");
				 preparedStatement.setString(1, user);
				 preparedStatement.setString(2, pass);
				 ResultSet resultSet = preparedStatement.executeQuery();
				 if(resultSet.next()) {
					 System.out.println("Đăng nhập thành công");
				 } else {
					 System.out.println("Đăng nhập không thành công");
				}
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
