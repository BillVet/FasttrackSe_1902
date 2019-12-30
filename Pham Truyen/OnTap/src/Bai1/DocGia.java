package Bai1;

public class DocGia extends ConNguoi{

	public int soSachMuon;

	public int getSoSachMuon() {
		return soSachMuon;
	}

	public void setSoSachMuon(int soSachMuon) {
		this.soSachMuon = soSachMuon;
	}

	public DocGia() {
		super();
	}

	public DocGia(String ten, String diaChi, int tuoi, int soSachMuon) {
		super(ten, diaChi, tuoi);
		this.soSachMuon = soSachMuon;
	}

	
	
	
}
