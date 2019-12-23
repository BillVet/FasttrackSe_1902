package BaiTap;

public class TruongPhong extends NhanVien{

	public double luongTrachNhiem;
	
	public TruongPhong() {
		super();
	}

	public TruongPhong(String ma, String hoTen, int luong, double tongLuong) {
		super(ma, hoTen, luong, tongLuong);
	}

	public TruongPhong(String ma, String hoTen, int luong, double tongLuong, double luongTrachNhiem) {
		super(ma, hoTen, luong, tongLuong);
		this.luongTrachNhiem = luongTrachNhiem;
	}

	public void nhap() {
		super.nhap();
		System.out.println("Nhap luong trach nhiem: ");
		luongTrachNhiem = scanner.nextDouble();
	}
	
	public double luong() {
		return (thuNhap() + luongTrachNhiem);
	}
	
	public void xuat() {
		super.xuat();
		System.out.println("Tong thu nhap: "+luong());
	}
}
