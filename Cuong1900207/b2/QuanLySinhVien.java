package com.lab4.b2;

import java.util.Scanner;

public class QuanLySinhVien {

	private Scanner scanner = new Scanner(System.in);
	private SinhVien[] listSinhVien = new SinhVien[10];
	private int size;
//	
	private void themSinhVienVaoMang(SinhVien sinhVien) {
		listSinhVien[size++] = sinhVien;
	}
	
	public void menu() {
		while(true) {
			System.out.println("---------------------------------------------");
			System.out.println("-1.Them sinh vien                       	 ");
			System.out.println("-2.Xuat thong tinh danh sach sinh vien       ");
			System.out.println("-3.Xuat danh sach sinh vien dat loai gioi    ");
			System.out.println("-4.Sap xep sinh vien theo diem               ");
			System.out.println("-5.Ket thuc                                  ");
			System.out.println("---------------------------------------------");
			
			System.out.println("Lua chon menu :");
			String chon = scanner.nextLine();
			
			switch (chon) {
			case "1":
				nhap();
				break;
			case "2":
				xuat();
				break;
			case "3":
				sinhVienGioi();
				break;
			case "4":
				break;
			case "5":
				System.out.println("Tam biet");
				scanner.close();
				System.exit(0);
				break;
			default:
				System.out.println("Menu khong ton tai");
				break;
			}
		}
	}
	
	public void nhap() {
		System.out.println("Moi ban chon sinh vien de nhap");
		System.out.println("1.Sinh vien It");
		System.out.println("2.Sinh vien Biz");
		
		String loaiSinhVien = scanner.nextLine();
		
		SinhVien sinhVien = null;
		
		boolean kiemTraChonLoaiSinhVien = false;
		
		if("1".equals(loaiSinhVien)) {
			System.out.println("Nhap ten sinh vien");
			String hoTen = scanner.nextLine();
			System.out.println("Nhap nganh hoc sinh vien");
			String nganh = scanner.nextLine();
			System.out.println("Nhap diem Css :");
			double diemCss = Double.parseDouble(scanner.nextLine());
			System.out.println("Nhap diem Java :");
			double diemJava = Double.parseDouble(scanner.nextLine());
			System.out.println("Nhap diem Html :");
			double diemHtml = Double.parseDouble(scanner.nextLine());
			
			sinhVien = new SinhVienIt(hoTen, nganh, diemJava, diemCss, diemHtml);
			
		}else if ("2".equals(loaiSinhVien)) {
			System.out.println("Nhap ten sinh vien");
			String hoTen = scanner.nextLine();
			System.out.println("Nhap nganh hoc sinh vien");
			String nganh = scanner.nextLine();
			System.out.println("Nhap diem Marketing :");
			double diemMaketing = Double.parseDouble(scanner.nextLine());
			System.out.println("Nhap diem Sale :");
			double diemSale = Double.parseDouble(scanner.nextLine());
			sinhVien = new SinhVienBiz(hoTen, nganh, diemMaketing,diemSale);
		}else{
			// Hien thi loi khi chon sai
			System.out.println("Ban chon sai roi");
			kiemTraChonLoaiSinhVien = true;
		}
		
		themSinhVienVaoMang(sinhVien);
	}
	
	private void xuat() {
		if (size != 0) {
			for (int i = 0; i < size; i++) {
				System.out.println("----------------------------------");
				listSinhVien[i].xuat();
			}
		} else {
			System.out.println("Danh sach sinh vien rong");
		}
	}
	
	private void sinhVienGioi() {
		if(size !=0) {
			for(int i = 0; i < size ; i++) {
				System.out.println("----------------------------");
				if("Hoc luc gioi".equals(listSinhVien[i].getHocLuc())) {
					listSinhVien[i].xuat();
				}
			}
		}
	}
	
	private void sapXepSinhVienTheoDiem() {
		
	}
}
