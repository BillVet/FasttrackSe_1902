package Bai2;

public class QuanLy extends NhanVien{

	public QuanLy(String tenNhanVien, double luong, int namSinh, String chucVu) {
		super(tenNhanVien, luong, namSinh, chucVu);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void xuat() {
		super.xuat();
		System.out.println("Chức vụ: " + this.chucVu);
	}
}
