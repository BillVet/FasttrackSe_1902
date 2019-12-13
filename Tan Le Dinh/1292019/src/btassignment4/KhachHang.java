package btassignment4;

abstract public class KhachHang {
	public String hoTen;
	public String soNha;
	public double maSo;
	abstract public double Chisotieuthu();
	
	public KhachHang(String hoTen, String soNha, double maSo) {
		super(); 
		this.hoTen = hoTen;
		this.soNha = soNha;
		this.maSo = maSo;
	}
	
	public void xuat() {
		System.out.println("Ten Khach Hang: "+hoTen);
		System.out.println("So nha: "+soNha);
		System.out.println("Ma so cong to dien: "+maSo);
	}
}