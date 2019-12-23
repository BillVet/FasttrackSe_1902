package BaiTap;

public class NhanVienTiepThi extends NhanVien{

	public double doanhSoBanHang;
	public double hoaHong;
	
	public NhanVienTiepThi() {
		super();
	}

	public NhanVienTiepThi(String ma, String hoTen, int luong, double tongLuong) {
		super(ma, hoTen, luong, tongLuong);
	}

	public NhanVienTiepThi(String ma, String hoTen, int luong, double tongLuong, double doanhSoBanHang,
			double hoaHong) {
		super(ma, hoTen, luong, tongLuong);
		this.doanhSoBanHang = doanhSoBanHang;
		this.hoaHong = hoaHong;
	}

	public void nhap() {
		super.nhap();
		System.out.println("Nhap doanh so ban hang: ");
		doanhSoBanHang = scanner.nextDouble();
		System.out.println("Nhap hoa hong: ");
		hoaHong = scanner.nextDouble();
	}
	
	public double luong() {
		return (thuNhap() + doanhSoBanHang * hoaHong);
	}
	
	public void xuat() {
		super.xuat();
		System.out.println("Tong thu nhap: "+luong());
	}	
}
