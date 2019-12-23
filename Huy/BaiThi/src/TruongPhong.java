import java.util.Scanner;

public class TruongPhong extends NhanVien{
	Scanner scanner = new Scanner(System.in);
	public double luongTrachNhiem;

	public double getLuongTrachNhiem() {
		return luongTrachNhiem;
	}
	public void setLuongTrachNhiem(double luongTrachNhiem) {
		this.luongTrachNhiem = luongTrachNhiem;
	}
	
	public TruongPhong() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public TruongPhong(double luongTrachNhiem) {
		super();
		this.luongTrachNhiem = luongTrachNhiem;
	}
	public double thuNhap() {
		thuNhap = luong + luongTrachNhiem;
		return thuNhap;	
	}

	public void nhap() {
		super.nhap();
		System.out.println("Nhập doanh số bán hàng:");
		this.luongTrachNhiem =Double.parseDouble(scanner.nextLine());
	}
	
	public void xuat() {
		super.xuat();
		System.out.println("Mức Lương Trách Nhiệm: "+luongTrachNhiem);
		System.out.println("Thu Nhập: "+thuNhap());
		System.out.println("Doanh Số Bán Hàng: "+super.thueThuNhap());
		
	}
	
}
