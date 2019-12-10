package Bai3va4;

import java.util.Scanner;

public class SanPham {
	private String tenSanPham;
	private String donGiaSanPham;
	private Double giamGiaSanPham;
	Scanner s= new Scanner(System.in);
	public void nhap() {
		System.out.println("Nhap ten san pham: ");
		tenSanPham = s.nextLine();
		System.out.println("Nhap don gia san pham: ");
		donGiaSanPham = s.nextLine();
		System.out.println("Nhap giam gia san pham: ");
		giamGiaSanPham = Double.parseDouble(s.nextLine());
	}
	public void xuat() {
		System.out.println("Ten san pham: " + tenSanPham);
		System.out.println("Don gia san pham: " + donGiaSanPham);
		System.out.println("Giam gia san pham: " + giamGiaSanPham);
	}
	public SanPham() {
	}
	public SanPham(String tenSanPham, String maSanPham) {
		super();
		this.tenSanPham = tenSanPham;
		this.donGiaSanPham = maSanPham;
		this.giamGiaSanPham= (double) 0;
	}
	public void nhap1() {
		System.out.println("Nhap ten san pham: ");
		tenSanPham = s.nextLine();
		System.out.println("Nhap don gia san pham: ");
		donGiaSanPham = s.nextLine();
	}
	public String getTenSanPham() {
		return tenSanPham;
	}
	public void setTenSanPham(String tenSanPham) {
		this.tenSanPham = tenSanPham;
	}
	public Double getGiamGiaSanPham() {
		return giamGiaSanPham;
	}
	public void setGiamGiaSanPham(Double giamGiaSanPham) {
		this.giamGiaSanPham = giamGiaSanPham;
	}
	public String getDonGiaSanPham() {
		return donGiaSanPham;
	}
	public void setDonGiaSanPham(String donGiaSanPham) {
		this.donGiaSanPham = donGiaSanPham;
	}
	
}
