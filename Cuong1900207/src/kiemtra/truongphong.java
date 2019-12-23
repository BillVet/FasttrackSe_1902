package kiemtra;

public class truongphong extends nhanvien{
	Double luongTrachNhiem;

	public truongphong(String maNhanVien, String hoTen, Double luong, Double tongThuNhap,
			Double luongTrachNhiem) {
		super(maNhanVien, hoTen,luong, tongThuNhap);
		this.luongTrachNhiem = luongTrachNhiem;
	}


}
