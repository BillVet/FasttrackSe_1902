package SinhVien;

public class MainDemo {
	public static void main(String[] args) {
		String hoTen= null;
		double diemTB= 0;
		Demo1 sv1 = new Demo1();
		Demo1 sv2 = new Demo1( hoTen, diemTB);
		sv1.nhap();
		sv2.nhap();
		sv1.xuat();
		sv1.xeploai();
		sv2.xuat();
		sv2.xeploai();
	}
}
