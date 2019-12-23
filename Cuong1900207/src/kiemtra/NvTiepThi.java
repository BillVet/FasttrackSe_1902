package kiemtra;

public class NvTiepThi extends nhanvien{
	Double doanhSo;
	Double hoaHong;
	public NvTiepThi(String maNhanVien, String hoTen, Double luong, Double tongThuNhap, Double doanhSo,
			Double hoaHong) {
		super(maNhanVien, hoTen, luong, tongThuNhap);
		this.doanhSo = doanhSo;
		this.hoaHong = hoaHong;
	}
	
}