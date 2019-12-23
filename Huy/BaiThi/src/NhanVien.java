import java.util.Scanner;

public class NhanVien {
	Scanner scanner = new Scanner(System.in);
	public int id;
	public String ten;
	public double luong;
	
	public double hoaHong;
	public double thuNhap, thueThuNhap;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTen() {
		return ten;
	}
	public void setTen(String ten) {
		this.ten = ten;
	}
	public double getLuong() {
		return luong;
	}
	public void setLuong(double luong) {
		this.luong = luong;
	}
	
	public double thueThuNhap() {
		if(thuNhap < 9000000) {
			thueThuNhap = 0;
		}else if(thuNhap >= 9000000 && thuNhap < 15000000) {
			thueThuNhap = thuNhap*10/100;
		}else {
			thueThuNhap = thuNhap*12/100;
		}
		return thueThuNhap;
	}
	public void nhap() {
		System.out.println("Nhập mã nhân viên: ");
		this.id = Integer.parseInt(scanner.nextLine());
		System.out.println("Nhập họ tên nhân viên: ");
		this.ten =scanner.nextLine();
		System.out.println("Nhập mức lương cơ bản: ");
		this.luong = Double.parseDouble(scanner.nextLine());
	}
	
	public void xuat() {
		System.out.println(".-.-.-.-.-.-.-.-.-.-.-.-.-.-");
		System.out.println("Mã Nhân Viên: "+id);
		System.out.println("Họ Tên Nhân Viên: "+ten);
		System.out.println("Lương Cơ Bản: "+luong);
	}
}
