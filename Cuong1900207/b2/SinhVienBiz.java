package com.lab4.b2;

public class SinhVienBiz extends SinhVien{

	public double diemMaketing;
	public double diemSale;
	
	public SinhVienBiz(String hoTen, String nganh,double diemMaketing,double diemSale) {
		super(hoTen, nganh);
		this.diemMaketing = diemMaketing;
		this.diemSale = diemSale;
	}
	
	@Override
	public double getDiemTrungBinh() {
		// TODO Auto-generated method stub
		return (diemMaketing+diemSale)/2;
	}
	
	public void xuat() {
		super.xuat();
		System.out.println("Diem Maketing :"+diemMaketing);
		System.out.println("Diem Sale ;"+diemSale);
	}

}
