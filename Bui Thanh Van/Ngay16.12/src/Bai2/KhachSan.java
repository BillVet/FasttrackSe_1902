package Bai2;

public class KhachSan extends Nguoi{
	
	public KhachSan(String hoTen, String ngaySinh, int soCMND) {
		super(hoTen, ngaySinh, soCMND);
	}
	String soPhongTro;
	String loaiPhongTro;
	double soNgayThue;
	double giaPhong;
	double tienPhong;
	
	public KhachSan(String hoTen, String ngaySinh, int soCMND, String soPhongTro, String loaiPhongTro) {
		super(hoTen, ngaySinh, soCMND);
		this.soPhongTro = soPhongTro;
		this.loaiPhongTro = loaiPhongTro;
	}

	public KhachSan(String hoTen, String ngaySinh, int soCMND, String soPhongTro, String loaiPhongTro,
			double soNgayThue, double giaPhong, double tienPhong) {
		super(hoTen, ngaySinh, soCMND);
		this.soPhongTro = soPhongTro;
		this.loaiPhongTro = loaiPhongTro;
		this.soNgayThue = soNgayThue;
		this.giaPhong = giaPhong;
		this.tienPhong = tienPhong;
	}
	
}
