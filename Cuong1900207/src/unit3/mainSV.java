package unit3;

public class mainSV {
	public static void main(String[] args) {
		String hoTen=null;
		double diemTb=0;
		Sinhvien sv1 = new Sinhvien();
		Sinhvien sv2 = new Sinhvien(hoTen, diemTb);
		sv1.Nhap();
		sv2.Nhap();
		sv1.Xuat();
		sv2.Xuat();
	}
}