package baithi;

import java.util.Scanner;

public abstract class nhanvien {
	private static final String mucLuong = null;
 public String hoten;
 public String manv;
 public String mucluong;
protected int getthuethunhap;
Scanner scanner = new Scanner(System.in);
 
 public nhanvien() {
	super();
	// TODO Auto-generated constructor stub
}
public nhanvien(String hoten, String manv, String mucluong, int getthuethunhap, Scanner scanner) {
	super();
	this.hoten = hoten;
	this.manv = manv;
	this.mucluong = mucluong;
	this.getthuethunhap = getthuethunhap;
	this.scanner = scanner;
}
public abstract double getthuethunhap();
 public void getmucthunhap() {
	 if(getthuethunhap()<9000000) {
		 mucluong =" mien thue";
		 
	 }else if(getthuethunhap()>=9000000 && getthuethunhap <15000000) {
		 mucluong =" phai dong 10% thue ";
	 }else {
		 mucluong= "phai dong 12% thue";
	 }
		 
	 }
 public void xuat() {
		System.out.println("ho ten "+hoten);
		System.out.println("ma nhan vien"+manv);
		System.out.println("muc luong "+mucluong);
		
 }
 
 public void nhap() {
	System.out.print(" ho ten ");
	 	hoten = scanner.nextLine();
	System.out.print("Nhập mã nhân viên: ");
	 	manv = scanner.nextLine();
	System.out.println(" luong ");
		mucluong = scanner.nextLine();
 }

	
}



