package bttl;

public class runSinhVien {
	
	public static void main(String[] args) {
		String hoTen = null;
		double diemTB = 0;
		
		SinhVien sv1 = new SinhVien();
		SinhVien sv2 = new SinhVien(hoTen, diemTB);
		sv1.nhap();
		sv1.xuat();
		sv1.xepLoai();
		sv2.nhap();
		sv2.xuat();
		sv2.xepLoai();
		
		SinhVien sv = new SinhVien();
		sv.setHoTen("Nguyen van A");
		sv.setDiem(8);
		sv.xuat();
		sv.xepLoai();
	}
}
