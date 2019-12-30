package Bai2;

public class NhanVien {
	String tenNhanVien;
	double luong;
	int namSinh;
	String chucVu;
	String caTruc;
	public NhanVien(String tenNhanVien, double luong, int namSinh, String chucVu, String caTruc) {
		super();
		this.tenNhanVien = tenNhanVien;
		this.luong = luong;
		this.namSinh = namSinh;
		this.chucVu = chucVu;
		this.caTruc = caTruc;
	}
	public NhanVien(String tenNhanVien, double luong, int namSinh, String chucVu) {
		super();
		this.tenNhanVien = tenNhanVien;
		this.luong = luong;
		this.namSinh = namSinh;
		this.chucVu = chucVu;
	}
	public String getTenNhanVien() {
		return tenNhanVien;
	}
	public void setTenNhanVien(String tenNhanVien) {
		this.tenNhanVien = tenNhanVien;
	}
	public double getLuong() {
		return luong;
	}
	public void setLuong(double luong) {
		this.luong = luong;
	}
	public int getNamSinh() {
		return namSinh;
	}
	public void setNamSinh(int namSinh) {
		this.namSinh = namSinh;
	}
	public void xuat() {
		System.out.println("Họ tên: " + this.tenNhanVien);
		System.out.println("Mức lương: "  + this.luong);
		System.out.println("Năm sinh: " + this.namSinh);
	}
}
