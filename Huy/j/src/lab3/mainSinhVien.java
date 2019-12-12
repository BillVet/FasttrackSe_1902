package lab3;

public class mainSinhVien {
	public static void main(String[] args) {
		String hoTen = null;
		double diemTb = 0;
		SinhVien sv = new SinhVien();
		SinhVien sv2 = new SinhVien(hoTen, diemTb);
		sv.nhap();
		sv2.nhap();
		sv.xepLoai();
		sv2.xepLoai();
		sv.xuat();
		sv2.xuat();
	}
}
