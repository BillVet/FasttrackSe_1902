package lab4;

public abstract class SinhVienFpt {
	public String hoTen;
	public String nganh;
	public SinhVienFpt() {
		
	}
	public SinhVienFpt(String hoTen,String  nganh) {
		this.hoTen = hoTen;
		this.nganh = nganh;
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
		System.out.println("ho ten "+hoTen);
		System.out.println("diem "+getDiem());
		System.out.println("hoc luc "+getHocLuc());
	}
}
