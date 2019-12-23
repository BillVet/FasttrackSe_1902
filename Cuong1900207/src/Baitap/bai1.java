package Baitap;

import java.util.Scanner;

public class bai1 {
	String Id;
	String hoTen;
	double Tuoi;
	String diaChi;
	double Gpa;
	
	Scanner scanner = new Scanner(System.in);
	
	public void nhap() {
		int n;
		System.out.println("Nhap so sinh vien");
		n = Integer.parseInt(scanner.nextLine());
		
	}
	public void menu() {
		System.out.println("---Menu----");
		System.out.println("1.Them Sinh Vien");
		System.out.println("2.Cap Nhat");
		System.out.println("3.Xoa");
		System.out.println("4.Sap xep theo ten");
		System.out.println("5.Hien Thi Danh Sach");
		System.out.println("0.Ket Thuc");
		
	}
}
