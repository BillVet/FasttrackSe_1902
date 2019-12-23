package lab3;

public abstract class SinhVien {
	public String hoTen;
	public String nghanh;
	
	public SinhVien() {
		
	}

	public SinhVien(String hoTen, String nghanh) {
		super();
		this.hoTen = hoTen;
		this.nghanh = nghanh;
	}
	
	public abstract double getDiem();
	public String getHocLuc() {
			String hocLuc;
			if(getDiem() > 5) {
				hocLuc ="dat";
			}else {
				hocLuc="chua dat";
			}
			return hocLuc;
	}
	public void xuat() {
		System.out.println("ho ten :" + hoTen);
		System.out.println("nghanh :" + nghanh);
		System.out.println("hoc luc :" + getHocLuc());
	}
}
