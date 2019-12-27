package com.Lab4.Bai2;

public class SinhVienFpt {
	public String name;
	public String nganh;
	public SinhVienFpt() {
		
	}
	public SinhVienFpt(String name, String nganh) {
		super();
		this.name = name;
		this.nganh = nganh;
	}
	
	
	public double getDiem() {
		return 0;
		
	}
	
	public double getHocLuc() {
		return 0;
		
	}
	public void xuat() {
		System.out.println("" + getHocLuc());
		System.out.println("" + getDiem());
	}
}
