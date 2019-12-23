package Bai1;

import java.util.ArrayList;
import java.util.Scanner;

public class SinhVien {
	String hoTen;
	String email;
	String soDienThoai;
	String soCMND;
	String kiemTraSDT = "0[0-9]{9,10}";
    public	String kiemTraEmail = "^[a-z][a-z0-9_\\.]{5,32}@[a-z0-9]{2,}(\\.[a-z0-9]{2,4}){1,2}$" ;
	String kiemTraSoCMND = "[0-9]{9}";
	public String kiemtraHoTen = "^[A-Z][a-z\\s]+";
	Scanner s = new Scanner(System.in);

	public SinhVien(String hoTen, String email, String soDienThoai, String soCMND) {
		super();
		this.hoTen = hoTen;
		this.email = email;
		this.soDienThoai = soDienThoai;
		this.soCMND = soCMND;
	}
	ArrayList<SinhVien> listSinhVien = new ArrayList<SinhVien>();
	public void nhap() {
		System.out.println("Nhập vào họ tên: ");
		hoTen = s.nextLine();
		while (true) {
			if(hoTen.matches(kiemtraHoTen)) {
				break;
			} else {
				System.out.println("Bạn đã nhập sai họ tên ");
				System.out.println("Nhập lại họ tên: ");
				hoTen = s.nextLine();
			}
		}
		System.out.println("Nhập vào email: ");
		email = s.nextLine();
		while (true) {
			if(email.matches(kiemTraEmail)) {
				break;
			} else {
				System.out.println("Bạn đã nhập sai Email ");
				System.out.println("Nhập lại địa chỉ email: ");
				email = s.nextLine();
			}
		}
		System.out.println("Nhập vào số điện thoại: ");
		soDienThoai = s.nextLine();
		while (true) {
			if(soDienThoai.matches(kiemTraSDT)) {
				break;
			} else {
				System.out.println("Bạn đã nhập sai số điện thoại ");
				System.out.println("Nhập lại số điện thoại: ");
				soDienThoai = s.nextLine();
			}
		}
		System.out.println("Nhập vào số chứng minh nhân nhân: ");
		soCMND = s.nextLine();
		while (true) {
			if(soCMND.matches(kiemTraSoCMND)) {
				break;
			} else {
				System.out.println("Bạn đã nhập sai số CMND ");
				System.out.println("Nhập lại số CMND: ");
				soCMND = s.nextLine();
			}
		}
	}
}
