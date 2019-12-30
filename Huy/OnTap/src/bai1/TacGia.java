package bai1;

import java.util.Scanner;

public class TacGia extends ConNguoi {
	Scanner scanner = new Scanner(System.in);
	public int sachXuatBan;

	public int getSachXuatBan() {
		return sachXuatBan;
	}

	public void setSachXuatBan(int sachXuatBan) {
		this.sachXuatBan = sachXuatBan;
	}

	public TacGia(String ten, String diaChi, int tuoi, int sachXuatBan) {
		super(ten, diaChi, tuoi);
		this.sachXuatBan = sachXuatBan;
	}

	public TacGia() {
		super();
		// TODO Auto-generated constructor stub
	}

	public TacGia(String ten, String diaChi, int tuoi) {
		super(ten, diaChi, tuoi);
		// TODO Auto-generated constructor stub
	}
	public void nhap() {
		super.nhap();
		System.out.println("Nhập số sách xuât bản:");
		this.sachXuatBan= scanner.nextInt();
	}
	public void xuat() {
		super.xuat();
		System.out.println("Số Sách Xuất Bản: "+sachXuatBan);
	}
}
