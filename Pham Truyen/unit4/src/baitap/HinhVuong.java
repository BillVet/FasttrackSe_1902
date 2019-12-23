package baitap;

public class HinhVuong extends HinhChuNhat{

	public HinhVuong() {
		
	}
	
	public HinhVuong(int canh) {
		chieuDai = chieuRong = canh;
	}
	
	public void xuat() {
		System.out.println("Chu vi hinh vuong: " + getChuVi());
		System.out.println("Dien tich hinh vuong: " + getDienTich());
	} 
}
