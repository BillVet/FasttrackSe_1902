package Bai1;

public class Sach {

	public String tenSach;
	public String tacGia;
	public String nguoiMuon;
	public String getTenSach() {
		return tenSach;
	}
	public void setTenSach(String tenSach) {
		this.tenSach = tenSach;
	}
	public String getTacGia() {
		return tacGia;
	}
	public void setTacGia(String tacGia) {
		this.tacGia = tacGia;
	}
	public String getNguoiMuon() {
		return nguoiMuon;
	}
	public void setNguoiMuon(String nguoiMuon) {
		this.nguoiMuon = nguoiMuon;
	}
	
	public Sach() {
		super();
	}
	
	public Sach(String tenSach, String tacGia, String nguoiMuon) {
		super();
		this.tenSach = tenSach;
		this.tacGia = tacGia;
		this.nguoiMuon = nguoiMuon;
	}
	
	
}
