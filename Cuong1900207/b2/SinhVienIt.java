package com.lab4.b2;

public class SinhVienIt extends SinhVien{
	
	public double diemCss;
	public double diemJava;
	public double diemHtml;
	
	public SinhVienIt(String hoTen, String nganh,double diemJava,double diemCss,double diemHtml) {
		super(hoTen, nganh);
		this.diemCss = diemCss;
		this.diemJava = diemJava;
		this.diemHtml = diemHtml;
	}

	@Override
	public double getDiemTrungBinh() {
		// TODO Auto-generated method stub
		return (diemJava+diemCss+diemHtml)/3;
	}
	
	public void xuat() {
		super.xuat();
		System.out.println("Diem Css :"+diemCss);
		System.out.println("Diem Java :"+diemJava);
		System.out.println("Diem Html :"+diemHtml);
	}

	

}
