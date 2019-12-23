
public class HanhChinh extends NhanVien{

	public double thuNhap() {
		thuNhap = luong;
		return thuNhap;	
	}
	public void nhap() {
		super.nhap();
	}
	public void xuat() {
		super.xuat();
		System.out.println("Thu Nhập: "+thuNhap());
		System.out.println("Thuế Thu Nhập: "+super.thueThuNhap());
	}
}
