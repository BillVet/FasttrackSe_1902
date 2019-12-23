package testJavaCore;

import java.util.Scanner;

public class NhanVien {
	public String maNhanVien, Ten;
	public int Luong;
	public NhanVien() {
		super();
	}

	public NhanVien(String maNhanVien, String ten, int luong) {
		super();
		this.maNhanVien = maNhanVien;
		Ten = ten;
		Luong = luong;
	}
	
	public void nhap() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhap ten Nhan Vien :");
		Ten = scanner.nextLine();
		System.out.println("Nhap ma Nhan Vien");
		maNhanVien = scanner.nextLine();
		System.out.println("Nhap luong Nhan Vien");
		Luong = scanner.nextInt();
	}
}
