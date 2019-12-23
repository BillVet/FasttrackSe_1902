package OnTap2;

public class Oto extends PTGT{
	String soChoNgoi;
	String kieuDongCo;
	
	public Oto(String hangSanXuat, String namSanXuat, String giaBan, String mau, String soChoNgoi, String kieuDongCo) {
		super(hangSanXuat, namSanXuat, giaBan, mau);
		this.soChoNgoi = soChoNgoi;
		this.kieuDongCo = kieuDongCo;
	}
	public String getSoChoNgoi() {
		return soChoNgoi;
	}
	public void setSoChoNgoi(String soChoNgoi) {
		this.soChoNgoi = soChoNgoi;
	}
	public String getKieuDongCo() {
		return kieuDongCo;
	}
	public void setKieuDongCo(String kieuDongCo) {
		this.kieuDongCo = kieuDongCo;
	}
	public void hienThongTin() {
		super.hienThongTin();
		System.out.println("Chổ ngồi: " + this.soChoNgoi);
		System.out.println("Kiểu động cơ: " + this.kieuDongCo);
	}
}
