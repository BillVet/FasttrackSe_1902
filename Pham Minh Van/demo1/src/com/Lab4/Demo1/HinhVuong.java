package com.Lab4.Demo1;

public class HinhVuong extends HinhChuNhat {
	public HinhVuong() {
		
	}
	
	public HinhVuong(double canh) {
		super();
		chieuDai = chieuRong = canh;
	}
	
	public void xuat() {
		System.out.println("Chu vi hình vuông: \n"+ getChuVi());
		System.out.println("Diện tích hình vuông: \n"+ getDienTich());
	}
}
