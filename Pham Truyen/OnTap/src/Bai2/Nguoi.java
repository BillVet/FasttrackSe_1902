package Bai2;

public class Nguoi {
	
	NhanVien nv = new NhanVien();
	
	public int tinhTuoi() {		
		return 2019-nv.namSinh;
	}
	
	public void xuatTenTuoi() {		
		System.out.println("Ten nhan vien: "+nv.hoTen);
		System.out.println("Tuoi: "+tinhTuoi());
	}
}
