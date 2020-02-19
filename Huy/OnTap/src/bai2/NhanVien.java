package bai2;

import java.util.Calendar;
import java.util.Scanner;

public class NhanVien implements Nguoi {
	Scanner scanner= new Scanner(System.in);
	public 	String hoTen, tenTuoi;
	public double luong;
	public int namSinh, tuoi;
	public String ViTri;
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
		// TODO Auto-generated constructor stub
	}
	public NhanVien(Scanner scanner, String hoTen, String tenTuoi, double luong, int namSinh, int tuoi, String viTri) {
		super();
		this.scanner = scanner;
		this.hoTen = hoTen;
		this.tenTuoi = tenTuoi;
		this.luong = luong;
		this.namSinh = namSinh;
		this.tuoi = tuoi;
		ViTri = viTri;
	}
	public int tinhTuoi() {
		Calendar rightNow = Calendar.getInstance();
		int y = rightNow.get(Calendar.YEAR);
		return tuoi = y - this.namSinh;
	}
	public String xuatTenTuoi() {
		return tenTuoi ="> Họ tên:"+hoTen+" Tuổi:"+tinhTuoi()+" Lương:"+luong;
	}
	
	public void nhap() {
		System.out.println("Nhập tên:");
		this.hoTen= scanner.nextLine();
		System.out.println("Nhập lương:");
		this.luong = scanner.nextDouble();
		System.out.println("Nhập Năm Sinh:");
		this.namSinh = scanner.nextInt();
	}
	public void xuat() {
		System.out.println(xuatTenTuoi());
	}
}
