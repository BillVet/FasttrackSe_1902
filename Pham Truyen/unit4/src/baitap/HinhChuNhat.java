package baitap;

public class HinhChuNhat{

	protected double chieuDai;
	protected double chieuRong;
	
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
		System.out.println("Chu vi hinh chu nhat: " + getChuVi());
		System.out.println("Dien tich hinh chu nhat: " + getDienTich());
	} 
}
