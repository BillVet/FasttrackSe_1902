package Bai2;

public class SanPhamMain {
	public static void main(String[] args) {
		String tenSanPham = null;
		String maSanPham = null;
		double giaSanPham=0;
		SanPham sp1 = new SanPham();
		SanPham sp2 = new SanPham(tenSanPham,maSanPham,giaSanPham);
		sp1.nhap();
		sp2.nhap();
		sp1.xuat();
		sp2.xuat();
	}
}
