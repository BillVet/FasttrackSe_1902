package testJavaCore;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		NhanVien hc;
		Saler sale;
		TruongPhong tp;
		ArrayList<NhanVien> arrNhanVien = new ArrayList<>();
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("---MENU---");
		System.out.println("1. Nhap danh sach nhan vien");
		System.out.println("2. Xuat danh sach nhan vien");
		System.out.println("3. Tim va hien thi nhan vien theo ma nhan vien");
		System.out.println("4. Xoa nhan vien theo ma nhan vien");
		System.out.println("5. Cap nhap thong tin nhan vien theo ma");
		System.out.println("6. Tim nhan vien theo luong");
		System.out.println("7. Sap xep nhan vien theo luong");
		System.out.println("8. Sap xep nhan vien theo Ten");
		System.out.println("9. Xuat nhan vien co thu nhap cao nhat");
		System.out.println("0. End");
		System.out.println("---------------------------");
		int choose = scanner.nextInt();
		switch (choose) {
		case 1:
			nhap();
			break;
		case 2:
			xuat();
			break;
		case 3:
			tim();
			break;
		case 4:
			xoa();
			break;
		case 5:
			capnhat();
			break;
		case 6:
			timTheoLuong();
			break;
		case 7:
			sxTheoLuong();
			break;
		case 8:
			sxTheoTen();
			break;
		case 9:
			xuatTheoLuong();
			break;
		case 0:
			System.exit(0);
		}
	}
	public static void nhap() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Chon loai Nhan vien (1-Nhan vien hanh chinh, 2- Nhan vien tiep thi, 3- Truong Phong");
		int choose = scanner.nextInt();
		
		if (choose == 1 ) {
			NhanVien hc = new NhanVien();
			hc.nhap();
		} else if (choose == 2) {
			NhanVien sale = new Saler();
			sale.nhap();
		} else if (choose == 3){
			NhanVien tp = new TruongPhong();
			tp.nhap();
		} else {
			System.out.println("Sai cu phap!!");
		}
	}
	public static void xuat() {}
	public static void tim() {}
	public static void xoa() {}
	public static void capnhat() {}
	public static void timTheoLuong() {}
	public static void sxTheoLuong() {}
	public static void sxTheoTen() {}
	public static void xuatTheoLuong() {}
}
