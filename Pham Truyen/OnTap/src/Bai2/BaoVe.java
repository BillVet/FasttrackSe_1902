package Bai2;

public class BaoVe extends NhanVien{

	public String caTruc;

	public String getCaTruc() {
		return caTruc;
	}

	public void setCaTruc(String caTruc) {
		this.caTruc = caTruc;
	}

	public BaoVe() {
		super();
	}

	public BaoVe(String hoTen, double luong, int namSinh, String caTruc) {
		super(hoTen, luong, namSinh);
		this.caTruc = caTruc;
	}
	
	public void nhap() {
		super.nhap();
		System.out.println("Nhap ca truc: ");
		caTruc = sc.nextLine();
	}
	
	public void xuat() {
		super.xuat();
		System.out.println("Bao ve truc ca: "+caTruc);
	}
}
