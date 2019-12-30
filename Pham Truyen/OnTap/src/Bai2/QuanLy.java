package Bai2;

public class QuanLy extends NhanVien{

	public String chucVu;

	public String getChucVu() {
		return chucVu;
	}

	public void setChucVu(String chucVu) {
		this.chucVu = chucVu;
	}

	public QuanLy() {
		super();
	}

	public QuanLy(String hoTen, double luong, int namSinh, String chucVu) {
		super(hoTen, luong, namSinh);
		this.chucVu = chucVu;
	}
	
	public void nhap() {
		super.nhap();
		System.out.println("Nhap chuc vu: ");
		chucVu = sc.nextLine();
	}
	
	public void xuat() {
		super.xuat();
		System.out.println("Chuc vu: "+chucVu);
	}
}
