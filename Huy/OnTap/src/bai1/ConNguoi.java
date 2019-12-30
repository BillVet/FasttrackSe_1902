package bai1;

import java.util.Scanner;

public class ConNguoi {
	Scanner scanner= new Scanner(System.in);
	public String ten, diaChi;
	public int tuoi;
	public String getTen() {
		return ten;
	}
	public void setTen(String ten) {
		this.ten = ten;
	}
	public String getDiaChi() {
		return diaChi;
	}
	public void setDiaChi(String diaChi) {
		this.diaChi = diaChi;
	}
	public int getTuoi() {
		return tuoi;
	}
	public void setTuoi(int tuoi) {
		this.tuoi = tuoi;
	}
	
	public ConNguoi(String ten, String diaChi, int tuoi) {
		super();
		this.ten = ten;
		this.diaChi = diaChi;
		this.tuoi = tuoi;
	}
	public ConNguoi() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public void nhap() {
		System.out.println("Nhập tên:");
		this.ten= scanner.nextLine();
		System.out.println("Nhập địa chỉ:");
		this.diaChi=scanner.nextLine();
		System.out.println("Nhập tuổi:");
		this.tuoi = scanner.nextInt();
	}
	public void xuat() {
		System.out.println("Tên: "+ten);
		System.out.println("Tuổi: "+tuoi);
		System.out.println("Địa Chỉ: "+diaChi);
	}
	
}
