package com.Lab4.Demo1;

public class HinhChuNhat {

	public double chieuDai;
	public double chieuRong;
	public double canh;
	
	public HinhChuNhat() {
		
	}

	public HinhChuNhat(double chieuDai, double chieuRong) {
		super();
		this.chieuDai = chieuDai;
		this.chieuRong = chieuRong;
	}
	
	public double getChuVi() {
		double chuVi = (chieuDai + chieuRong)*2;
		return chuVi;
	}
	
	public double getDienTich() {
		double dienTich = chieuDai * chieuRong;
		return dienTich;
	}
	
	public void xuat() {
		System.out.println("Chu vi hình chữ nhật: \n"+ getChuVi());
		System.out.println("Diện tích hình chữ nhật: \n"+ getDienTich());
	}
}
