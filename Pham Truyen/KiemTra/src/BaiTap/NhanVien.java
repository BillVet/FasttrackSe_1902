package BaiTap;

import java.util.Scanner;

public class NhanVien {

	public String ma;
	public String hoTen;
	public int luong;
	public double tongLuong;
	
	public NhanVien() {
		super();
	}
	
	public NhanVien(String ma, String hoTen, int luong, double tongLuong) {
		super();
		this.ma = ma;
		this.hoTen = hoTen;
		this.luong = luong;
		this.tongLuong = tongLuong;
	}
	
	public String getMa() {
		return ma;
	}

	public void setMa(String ma) {
		this.ma = ma;
	}

	public int getLuong() {
		return luong;
	}

	public void setLuong(int luong) {
		this.luong = luong;
	}

	Scanner scanner = new Scanner(System.in);
	
	public void nhap() {
		System.out.println("Nhap ma nhan vien: ");
		ma = scanner.nextLine();
		System.out.println("Nhap ho ten nhan vien: ");
		hoTen = scanner.nextLine();
		System.out.println("Nhap luong: ");
		luong = Integer.parseInt(scanner.nextLine());
	}
	
	public double thuNhap() {
		if(luong < 9000000) {
			tongLuong = luong;
		}else if(luong > 9000000 && luong < 15000000) {
			tongLuong = Math.round(luong * 10/100);
		}else if(luong > 15000000) {
			tongLuong = Math.round(luong * 12/100);
		}
		return tongLuong;
	}
	
	public void xuat() {
		System.out.println("Ma nhan vien: "+ma);
		System.out.println("Ho va ten: "+hoTen);
		System.out.println("Luong: "+thuNhap());
	}
}
