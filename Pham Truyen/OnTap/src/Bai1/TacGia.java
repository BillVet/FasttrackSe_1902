package Bai1;

public class TacGia extends ConNguoi{

	public int sachXuatBan;

	public int getSachXuatBan() {
		return sachXuatBan;
	}

	public void setSachXuatBan(int sachXuatBan) {
		this.sachXuatBan = sachXuatBan;
	}

	public TacGia() {
		super();
	}

	public TacGia(String ten, String diaChi, int tuoi, int sachXuatBan) {
		super(ten, diaChi, tuoi);
		this.sachXuatBan = sachXuatBan;
	}
	
	
}
