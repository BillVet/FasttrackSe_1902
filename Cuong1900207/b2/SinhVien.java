package com.lab4.b2;

abstract public class SinhVien {
	public String hoTen;
	public String nganh;
	abstract public double getDiemTrungBinh();
	
	public SinhVien(String hoTen, String nganh) {
		super();
		this.hoTen = hoTen;
		this.nganh = nganh;
	}

	public String getHocLuc() {
		double diemTrungBinh = getDiemTrungBinh();
		if(diemTrungBinh<5) {
			return "Hoc luc yeu";
		}else if(5<=diemTrungBinh && diemTrungBinh<6.5) {
			return "Hoc luc trung binh";
		}else if(6.5<=diemTrungBinh && diemTrungBinh<7.5) {
			return "Hoc luc kha";
		}else if(7.5<=diemTrungBinh && diemTrungBinh<9) {
			return "Hoc luc gioi";
		}else{
			return "Hoc luc xuat sac";
		}
	}
	
	public void xuat() {
		System.out.println("Ten Sinh Vien :"+hoTen);
		System.out.println("Nganh :"+nganh);
		System.out.println("Hoc Luc :"+getHocLuc());
	}
}
