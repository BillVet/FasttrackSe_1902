package Pk.BaiKiemTra;

public class NhanVienTiepThi extends NhanVienHanhChinh{
	double tiLeHoaHong;
	double doanhSoBanHang;

	

	public NhanVienTiepThi(String chucVu, String hoTen, String maNhanVien, double luong, double thue,
			double tiLeHoaHong, double doanhSoBanHang) {
		super(chucVu, hoTen, maNhanVien, luong, thue);
		this.tiLeHoaHong = tiLeHoaHong;
		this.doanhSoBanHang = doanhSoBanHang;
	}

	public double getTiLeHoaHong() {
		return tiLeHoaHong;
	}

	public void setTiLeHoaHong(double tiLeHoaHong) {
		this.tiLeHoaHong = tiLeHoaHong;
	}

	public double getDoanhSoBanHang() {
		return doanhSoBanHang;
	}

	public void setDoanhSoBanHang(double doanhSoBanHang) {
		this.doanhSoBanHang = doanhSoBanHang;
	}
	public void hienThiNhanVien() {
		super.hienThiNhanVien();
		System.out.println("Tỉ lệ hoa hồng: " + tiLeHoaHong);
		System.out.println("Doanh Số Bán Hàng: " + doanhSoBanHang);
	}


	
	
}
