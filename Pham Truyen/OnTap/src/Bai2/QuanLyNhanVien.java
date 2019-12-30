package Bai2;

import java.util.ArrayList;
import java.util.Scanner;

public class QuanLyNhanVien {

	Scanner sc = new Scanner(System.in);
	
	public void menu() {
		while(true) {
			System.out.println("-----------QUAN LY NHAN VIEN------------");
			System.out.println("1.Nhap du lieu                          ");
			System.out.println("2.Xuat du lieu                          ");
			System.out.println("3.So luong nhan vien quan ly            ");
			System.out.println("4.Danh sach bao ve co ca truc sang      ");
			System.out.println("5.Xoa thong tin quan ly theo ten        ");
			System.out.println("6.Tinh tong luong cua nhan vien quan ly ");
			System.out.println("7.Sap xep danh sach nhan vien bao ve    ");
			System.out.println("0.Ket thuc!                             ");
			
			System.out.println("------Lua chon menu------");
			String chon = sc.nextLine();
			
			switch (chon) {
			case "1":
				nhap();
				break;
			case "2":
				xuat();
				break;
			case "3":
				slNvQl();
				break;
			case "4":
				dsBvCaSang();
				break;
			case "5":
				xoaQuanLy();
				break;
			case "6":
				luongQuanLy();
				break;
			case "7":
				sxDsBv();
				break;
			case "0":
				sc.close();
				System.exit(0);
				break;

			default:
				break;
			}
		}
	}
	
	NhanVien nhanvien;
	int n;
	ArrayList<NhanVien> nv = new ArrayList<NhanVien>();

	private void nhap() {
		System.out.println("Nhap so luong nhan vien: ");
		n = Integer.parseInt(sc.nextLine());
		
		System.out.println("Chon nhan vien: ");
		System.out.println("1.Quan ly");
		System.out.println("2.Bao ve");
		int loai = sc.nextInt();
		
		if(loai == 1) {
			nhanvien = new QuanLy();
			nhanvien.nhap();
			nv.add(nhanvien);
		}else {
			nhanvien = new BaoVe();
			nhanvien.nhap();
			nv.add(nhanvien);
		}
	
	}

	private void xuat() {
		nhanvien.xuat();
	}

	private void slNvQl() {
		// TODO Auto-generated method stub
		
	}

	private void dsBvCaSang() {
		// TODO Auto-generated method stub
		
	}

	private void xoaQuanLy() {
		// TODO Auto-generated method stub
		
	}

	private void luongQuanLy() {
		// TODO Auto-generated method stub
		
	}

	private void sxDsBv() {
		// TODO Auto-generated method stub
		
	}
}
