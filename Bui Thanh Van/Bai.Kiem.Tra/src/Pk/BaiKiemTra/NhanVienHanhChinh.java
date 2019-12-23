package Pk.BaiKiemTra;

public class NhanVienHanhChinh {
	String chucVu = "Nhân Viên Hành Chính";
	String hoTen;
	String maNhanVien;
	double luong;
	double thue;
	

	
	public NhanVienHanhChinh(String chucVu, String hoTen, String maNhanVien, double luong, double thue) {
		super();
		this.chucVu = chucVu;
		this.hoTen = hoTen;
		this.maNhanVien = maNhanVien;
		this.luong = luong;
		this.thue = thue;
	}
	public String getHoTen() {
		return hoTen;
	}
	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}
	public String getMaNhanVien() {
		return maNhanVien;
	}
	public void setMaNhanVien(String maNhanVien) {
		this.maNhanVien = maNhanVien;
	}
	public double getLuong() {
		return luong;
	}
	public void setLuong(double luong) {
		this.luong = luong;
	}
	public void hienThiNhanVien() {
		System.out.println("Chức vụ: " + chucVu);
		System.out.println("Họ tên nhân viên: " + hoTen);
		System.out.println("Mã nhân viên: " + maNhanVien);
		System.out.println("Lương nhân viên: " + luong);
		System.out.println("Thuế thu nhập: " + thue);
	}
}
