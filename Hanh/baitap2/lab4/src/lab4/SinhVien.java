package lab4;

public abstract class SinhVien {
	private static final String Diem = null;
	private static final String HocLuc = null;
	public String hoTen;
	public String nganh;
	private String Hocluc;
	public SinhVien() {
		
	}
	public SinhVien(String hoTen, String nganh) {
		super();
		this.hoTen=hoTen;
		this.nganh=nganh;
	}
	public abstract double getDiem() ;
	public String getHocLuc() {
		
		if(getDiem() <5 ) {
			Hocluc= "yeu";
		}else if(5<= getDiem()&& getDiem() <6.5) {
			Hocluc="trung binh";
		}
		else if(6.5 <= getDiem() && getDiem() <7.5) {
			Hocluc="kha";
		}else { Hocluc="gioi";
		}
		return HocLuc;
	
}
	public void xuat() {
		System.out.println("ho ten"+hoTen);
		System.out.println("diem trung binh"+getDiem());
		System.out.println("xep loai"+getHocLuc());
	
	}
	}