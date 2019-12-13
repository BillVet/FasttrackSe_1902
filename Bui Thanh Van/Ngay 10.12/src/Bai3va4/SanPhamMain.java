package Bai3va4;

public class SanPhamMain {
	public static void main(String[] args) {
		String tenSanPham = null;
		String maSanPham = null;
		SanPham sp1 = new SanPham();
		SanPham sp2 = new SanPham(tenSanPham,maSanPham);
		sp1.nhap();
		sp2.nhap1();
		sp1.xuat();
		sp2.xuat();
	}
}
