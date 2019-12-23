package assignment;

import java.util.Scanner;

public class BienLai extends KhachHang{
	double chiSoCu;
	double chiSoMoi;
	double tienDien;
	Scanner s = new Scanner(System.in);
	public BienLai(String hoTen, String soNha, String maSoCongTo, double chiSoCu, double chiSoMoi) {
		super(hoTen, soNha, maSoCongTo);
		this.chiSoCu = chiSoCu;
		this.chiSoMoi = chiSoMoi;
	}
	

	public BienLai(String hoTen, String soNha, String maSoCongTo) {
		super(hoTen, soNha, maSoCongTo);
	}
	@Override
	double getTienDien() {
		return (chiSoMoi - chiSoCu) * 750;
	}
	public void xuat() {
		super.xuat();
		System.out.println("Số điện cũ: " + chiSoCu);
		System.out.println("Số điện mới: " + chiSoMoi);
		System.out.println("Tiền phải trả: " + getTienDien());
	}

}
