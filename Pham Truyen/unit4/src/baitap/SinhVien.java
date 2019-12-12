package baitap;

abstract public class SinhVien {

	public String hoTen;
	public String nganh;
	
	public SinhVien(String hoTen, String nganh) {
		super();
		this.hoTen = hoTen;
		this.nganh = nganh;
	}

	abstract public double getDiem();
	
	public String getHocLuc() {
		if(getDiem() < 5) {
			return "khong dat";
		}else {
			return "dat";
		}
	}
	
	public void xuat() {
		System.out.println("Ho ten: " + hoTen + "\n Nganh: "+ nganh +"\n Diem: "+ getDiem() + "\n Hoc luc: "+ getHocLuc());
	}

	public static void add(SinhVien it) {
		
	}
}

