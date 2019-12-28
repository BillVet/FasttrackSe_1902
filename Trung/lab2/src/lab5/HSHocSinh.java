package lab5;

import java.util.Scanner;

public class HSHocSinh extends Nguoi {
	private String lop;
	private String khoaHoc;
	private int kyHoc;
	
	public HSHocSinh() {
		super();
	}

	public HSHocSinh(String lop, String khoaHoc, int kyHoc) {
		super();
		this.lop = lop;
		this.khoaHoc = khoaHoc;
		this.kyHoc = kyHoc;
	}
	void nhap() {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Nhap lop");
		lop = scanner.nextLine();
		System.out.println("Nhap khoa hoc");
		khoaHoc = scanner.nextLine();
		System.out.println("Nhap ky hoc");
		kyHoc = scanner.nextInt();
	}
	
	void xuat() {
		System.out.println("Ten :" + hoTen);
		System.out.println("Ngay Sinh :" + ngaySinh);
		System.out.println("Que Quan :" + queQuan);
		System.out.println("Lop :" + lop);
		System.out.println("Khoa hoc :" + khoaHoc);
		System.out.println("Ky Hoc :" + kyHoc);
	}
}
