package assignment;

abstract public class KhachHang {
	String hoTen;
	String soNha;
	String maSoCongTo;
	abstract double getTienDien();
	public KhachHang(String hoTen, String soNha, String maSoCongTo) {
		super();
		this.hoTen = hoTen;
		this.soNha = soNha;
		this.maSoCongTo = maSoCongTo;
	}
	public void xuat() {
		System.out.println("Họ tên chủ hộ: " + hoTen);
		System.out.println("Số nhà chủ hộ: " + soNha);
		System.out.println("Mã công tơ điện: " + maSoCongTo);
	}
}
