package Pk.BaiKiemTra;

public class TruongPhong extends NhanVienHanhChinh{
	double luongTrachNhiem;



	public TruongPhong(String chucVu, String hoTen, String maNhanVien, double luong, double thue,
			double luongTrachNhiem) {
		super(chucVu, hoTen, maNhanVien, luong, thue);
		this.luongTrachNhiem = luongTrachNhiem;
	}

	public double getLuongTrachNhiem() {
		return luongTrachNhiem;
	}

	public void setLuongTrachNhiem(double luongTrachNhiem) {
		this.luongTrachNhiem = luongTrachNhiem;
	}

	public void hienThiNhanVien() {
		super.hienThiNhanVien();
		System.out.println("Lương trách nhiệm: " + luongTrachNhiem);
	}
}
