import java.util.Scanner;

public class TiepThi extends NhanVien {
	Scanner scanner = new Scanner(System.in);
	public double doanhSo;
	
	public double getDoanhSo() {
		return doanhSo;
	}
	public void setDoanhSo(double doanhSo) {
		this.doanhSo = doanhSo;
	}
	public double getHoaHong() {
		return hoaHong;
	}
	public void setHoaHong(double hoaHong) {
		this.hoaHong = hoaHong;
	}
	public TiepThi(Scanner scanner, double doanhSo) {
		super();
		this.scanner = scanner;
		this.doanhSo = doanhSo;
	}
	
	
	public TiepThi() {
		super();
		// TODO Auto-generated constructor stub
	}
	public double thuNhap() {
		thuNhap = luong + (doanhSo*hoaHong/100);
		return thuNhap;	
	}
	
	
	public void nhap() {
		super.nhap();
		System.out.println("Nhập doanh số bán hàng:");
		this.doanhSo =Double.parseDouble(scanner.nextLine());
		System.out.println("Nhập tỉ lệ hoa hồng:");
		this.hoaHong =Double.parseDouble(scanner.nextLine());
	}
	
	public void xuat() {
		super.xuat();
		System.out.println("Doanh Số Bán Hàng: "+doanhSo);
		System.out.println("Tỉ Lệ Hoa Hồng: "+hoaHong);
		System.out.println("Thu Nhập: "+thuNhap());
		System.out.println("Thuế Thu Nhập: "+super.thueThuNhap());
	}
}
