package bai2;

import java.util.Scanner;

public class QuanLy extends NhanVien{
	Scanner scanner = new Scanner(System.in);
	public String chucVu;
	

	public String getChucVu() {
		return chucVu;
	}

	public void setChucVu(String chucVu) {
		this.chucVu = chucVu;
	}

	
	public QuanLy(Scanner scanner, String chucVu) {
		super();
		this.scanner = scanner;
		this.chucVu = chucVu;
	}

	public QuanLy() {
		super();
		// TODO Auto-generated constructor stub
	}

	public QuanLy(Scanner scanner, String hoTen, String tenTuoi, double luong, int namSinh, int tuoi, String viTri) {
		super(scanner, hoTen, tenTuoi, luong, namSinh, tuoi, viTri);
		// TODO Auto-generated constructor stub
	}

	public void nhap() {
		super.nhap();
		System.out.println("Nhập chức vụ:");
		this.chucVu = scanner.nextLine();
		this.ViTri = "Quan Ly";
	}
	public void xuat() {
		super.xuat();
		System.out.println("Chức vụ: "+chucVu);
	}
	
}
