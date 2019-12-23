package bt1;

import java.util.ArrayList;
import java.util.Scanner;

public class NhanVien {
	String hoTen;
	String email;
	String soDienThoai;
	String soCMND;
	Scanner s = new Scanner(System.in);
	
	ArrayList<NhanVien> listSinhVien = new ArrayList<NhanVien>();
	
	public void nhap() {
		String kiemtrahoTen = "^[a-zA-Z][\\\\b]";
		System.out.println("Nhập họ tên: ");
		hoTen = s.nextLine();
		
		String kiemtraemail = "^[a-zA-Z][\\\\w-]+@([\\\\w]+\\\\.[\\\\w]+|[\\\\w]+\\\\.[\\\\w]{2,}\\\\.[\\\\w]{2,})$";
		System.out.println("Nhập email: ");
		email = s.nextLine();
		
		String kiemtraSDT = "0[0-9] {9,10}";
		System.out.println("Nhập số điện thoại: ");
		soDienThoai = s.nextLine();
		 
		String kiemtraCMND = "[0-9] {9}";
		System.out.println("Nhập số chứng minh nhân dân: ");
		soCMND = s.nextLine();
		
		if(hoTen.matches(kiemtrahoTen)) {
			System.out.println("Bạn đã nhập đúng.");
		}else {
			System.out.println("Bạn đã nhập không đúng họ tên.");
		}
		
		if(email.matches(kiemtraemail)) {
			System.out.println("Bạn đã nhập đúng.");
		}else {
			System.out.println("Bạn đã nhập không đúng email.");
		}
		
		if(soDienThoai.matches(kiemtraSDT)) {
			System.out.println("Bạn đã nhập đúng.");
		}else {
			System.out.println("Bạn đã nhập không đúng số điện thoại.");
		}
		
		if(soCMND.matches(kiemtraCMND)) {
			System.out.println("Bạn đã nhập đúng.");
		}else {
			System.out.println("Bạn đã nhập không đúng CMND.");
		}
	}
}
