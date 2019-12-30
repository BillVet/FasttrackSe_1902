package Bai2;

public class BaoVe extends NhanVien{
	
	public BaoVe(String tenNhanVien, double luong, int namSinh, String chucVu, String caTruc) {
		super(tenNhanVien, luong, namSinh, chucVu, caTruc);
	}

	@Override
	public void xuat() {
		super.xuat();
		System.out.println("Chức vụ: " + this.chucVu);
		System.out.println("Ca trực: " + this.caTruc);
	}
}
