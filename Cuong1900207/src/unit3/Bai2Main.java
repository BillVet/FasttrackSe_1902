package unit3;

public class Bai2Main {
	public static void main(String[] args) {
		String hoTen=null;
		String maSp=null;
		double giaSp=0;
		Bai2 sp1 = new Bai2();
		Bai2 sp2 = new Bai2(hoTen, maSp, giaSp);
		sp1.Nhap();
		sp2.Nhap();
		sp1.Xuat();
		sp2.Xuat();
	}
}
