package bttl;

public class runSanPham {

	public static void main(String[] args) {
		String tenSp = null;
		double giaSp = 0;
		double giamGia = 0;
		
		SanPham sp1 = new SanPham(tenSp, giaSp, giamGia);
		SanPham sp2 = new SanPham(tenSp, giaSp);
		
		sp1.nhap();
		sp1.xuat();
		sp2.nhap();
		sp2.xuat();
	}
}
