package baitap;

public class SinhVienBiz extends SinhVien{

	public double marketting;
	public double sales; 
	
	public SinhVienBiz(String hoTen, String nganh) {
		super(hoTen, nganh);
	}

	public SinhVienBiz(String hoTen, String nganh, double marketting, double sales) {
		super(hoTen, nganh);
		this.marketting = marketting;
		this.sales = sales;
	}

	public double getDiemTrungBinh() {
		return (2*marketting + sales)/3;
	}
	
	public void xuat() {
		super.xuat();
		System.out.println("Diem Maketing :"+marketting);
		System.out.println("Diem Sale ;"+sales);
	}
}
