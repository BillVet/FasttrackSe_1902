package BaiTap;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class QuanLy {

	Scanner sc = new Scanner(System.in);

	public void dangnhap() {
		System.out.println("Nhap ten dang nhap: ");
		String user= sc.nextLine();
		System.out.println("Nhap mat khau: ");
		String pass= sc.nextLine();
		try {
			if(user.equals("") || pass.equals("")) {
				System.out.println("Vui long khong de trong");
			} else {
				Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/quanlydaotao?useUnicode=true&characterEncoding=utf-8","root","");
				PreparedStatement ps = con.prepareStatement("SELECT * From users where username=? And password=?");
				ps.setString(1, user);
				ps.setString(2, pass);
				ResultSet rs = ps.executeQuery();
				if(rs.next()) {
					System.out.println("Dang nhap thanh cong");

					if (rs.getString(3).equalsIgnoreCase("giangvien")) {
						System.out.println( "Chao giang vien: " + rs.getString(4));
						xem();
					} else {
						System.out.println( "Chao can bo: " + rs.getString(5));
						while (true) {
							menu();
						}
					}
				} else {
					System.out.println("Dang nhap khong thanh cong");
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public void menu() {
		System.out.println("---------QUAN LY SINH VIEN---------");
		System.out.println("1.Xem danh sach sinh vien");
		System.out.println("2.Them sinh vien");
		System.out.println("3.Sua thong tin sinh vien");
		System.out.println("4.Xoa nhan vien");
		System.out.println("5.Dang xuat");

		int chon = Integer.parseInt(sc.nextLine());
		switch (chon) {
		case 1:
			xem();
			break;
		case 2:
			them();
			break;
		case 3:
			sua();
			break;
		case 4:
			xoa();
			break;	
		case 5:
			sc.close();
			System.exit(0);
			break;	
		default:
			break;
		}
	}
	
	public void xem() {
		try {
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/quanlydaotao?useUnicode=true&characterEncoding=utf-8","root","");
			PreparedStatement ps = con.prepareStatement("SELECT * From students");
			ResultSet rs = ps.executeQuery("SELECT * From students");
			while(rs.next()) {
				System.out.println(" Ma sinh vien: "+ rs.getString(1)+" " + " Ten sinh vien: "+ rs.getString(2)+" "+ " ID lop: "+ rs.getString(3));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public void them() {
		try {
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/quanlydaotao?useUnicode=true&characterEncoding=utf-8","root","");
			PreparedStatement ps = con.prepareStatement("insert into students values(?,?,?)");
			System.out.println("Nhập mã sinh viên: ");
			String Ma_SV= sc.nextLine();
			System.out.println("Tên sinh viên: ");
			String Hoten_SV= sc.nextLine();
			System.out.println("ID lớp: ");
			String ID_Lop= sc.nextLine();
			
			ps.setString(1, Ma_SV);
			ps.setString(2, Hoten_SV);
			ps.setString(3, ID_Lop);
			ps.executeUpdate();
			System.out.println("Them thanh cong!");
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public void sua() {
		try {
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/quanlydaotao?useUnicode=true&characterEncoding=utf-8","root","");
			PreparedStatement ps = con.prepareStatement("SELECT * From students where Ma_SV=?");
			System.out.println("Nhap ma sinh vien: ");
			String nhapMaSV = sc.nextLine();
			ps.setString(1, nhapMaSV);
			ResultSet rs = ps.executeQuery();
			if (rs.next()) {
				System.out.println("Ma sinh vien: " + rs.getString(1));	
				System.out.println("Ten sinh vien: "+ rs.getString(2));
				System.out.println("Id lop: "+ rs.getString(3));
				System.out.println("Cap nhap ma sinh vien: ");
				String Ma_SV = sc.nextLine();
				System.out.println("Nhap ten sinh vien: ");
				String Hoten_SV= sc.nextLine();
				System.out.println("Nhap id lop: ");
				String ID_Lop= sc.nextLine();
				
				PreparedStatement pr = con.prepareStatement("UPDATE students SET Ma_SV=?,HoTen_SV=?,ID_Lop=? where Ma_SV=?");
				pr.setString(1, Ma_SV);
				pr.setString(2, Hoten_SV);
				pr.setString(3, ID_Lop);
				pr.setString(4, nhapMaSV);
				pr.executeUpdate();
				System.out.println("Cap thap thanh cong!");
			} else {
				System.out.println("Cap nhap that bai!");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public void xoa() {
		try {
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/quanlydaotao?useUnicode=true&characterEncoding=utf-8","root","");
			PreparedStatement ps = con.prepareStatement("DELETE FROM students where Ma_SV=?");
			System.out.println("Nhap ma sinh vien can xoa: ");
			String nhapmasv = sc.nextLine();
			ps.setString(1, nhapmasv);
			ps.executeUpdate();
			System.out.println("Da xoa: " + nhapmasv);
		} catch (SQLException e) {		
			e.printStackTrace();
		}
	}
}
