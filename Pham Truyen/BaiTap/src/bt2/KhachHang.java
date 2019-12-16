package bt2;

public class KhachHang {

	public String hoTen;
	public String soNha;
	public String maSoCongTo;
	
	public KhachHang() {
		
	}
	
	public KhachHang(String hoTen, String soNha, String maSoCongTo) {
		super();
		this.hoTen = hoTen;
		this.soNha = soNha;
		this.maSoCongTo = maSoCongTo;
	}
	
	public void xuat() {
		System.out.println("Ho ten chu ho: "+ hoTen);
		System.out.println("So nha: "+ soNha);
		System.out.println("Ma so cong to dien: "+ maSoCongTo);
	}
}
