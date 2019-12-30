package Bai2;

import java.util.Scanner;

public class NhanVien {

	public String hoTen;
	public double luong;
	public int namSinh;
	
	public String getHoTen() {
		return hoTen;
	}
	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}
	public double getLuong() {
		return luong;
	}
	public void setLuong(double luong) {
		this.luong = luong;
	}
	public int getNamSinh() {
		return namSinh;
	}
	public void setNamSinh(int namSinh) {
		this.namSinh = namSinh;
	}
	
	public NhanVien() {
		super();
	}
	
	public NhanVien(String hoTen, double luong, int namSinh) {
		super();
		this.hoTen = hoTen;
		this.luong = luong;
		this.namSinh = namSinh;
	}
	
	Scanner sc = new Scanner(System.in);
	
	public void nhap() {
		System.out.println("Nhap ho ten nhan vien: ");
		hoTen = sc.nextLine();
		System.out.println("Nhap luong: ");
		luong = sc.nextDouble();
		System.out.println("Nhap nam sinh: ");
		namSinh = sc.nextInt();
	}
	
	public void xuat() {
		Nguoi nguoi = new Nguoi();
		System.out.println("Ho ten: "+hoTen);
		System.out.println("Tuoi: "+nguoi.tinhTuoi());
		System.out.println("Luong: "+luong);
	}
}
