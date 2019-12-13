package bt2;

public class BienLai extends KhachHang{

	public double chiSoCu;
	public double chiSoMoi;

	
	public BienLai(String hoTen, String soNha, String maSoCongTo) {
		super(hoTen, soNha, maSoCongTo);
	}
	
	public BienLai(String hoTen, String soNha, String maSoCongTo, double chiSoCu, double chiSoMoi) {
		super(hoTen, soNha, maSoCongTo);
		this.chiSoCu = chiSoCu;
		this.chiSoMoi = chiSoMoi;
	}
	
	public double soTienTra() {
		return (chiSoMoi - chiSoCu)*750;
	}
	
	public void xuat() {
		super.xuat();
		System.out.println("Chi so cu: "+ chiSoCu);
		System.out.println("Chi so moi: "+ chiSoMoi);
		System.out.println("So tien tra: "+ soTienTra());
	}
}
