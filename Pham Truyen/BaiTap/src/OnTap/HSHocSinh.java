package OnTap;

import java.util.Scanner;

public class HSHocSinh extends Nguoi{

	public String lop;
	private String khoaHoc;
	private String hocKy;
	private Scanner scanner;
	
	public HSHocSinh() {
		super();
	}

	public HSHocSinh(String hoTen, int ngaySinh, String queQuan, String lop, String khoaHoc, String hocKy) {
		super();
		this.lop = lop;
		this.khoaHoc = khoaHoc;
		this.hocKy = hocKy;
	}
	
	public void nhap() {
		scanner = new Scanner(System.in);
		super.nhap();
        
		System.out.println("Nhap lop: ");
		lop = scanner.nextLine();
		System.out.println("Nhap khoa hoc: ");
		khoaHoc = scanner.nextLine();
		System.out.println("Nhap hoc ky: ");
		hocKy = scanner.nextLine();
	}
	
	public void xuat() {
		super.xuat();
		System.out.println("Lop: " + lop);
		System.out.println("Khoa hoc: " + khoaHoc);
		System.out.println("Hoc ky: " + hocKy);
	}
}
