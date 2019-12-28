package lb3;

import java.util.Scanner;

public class SanPham {

	String tenSanPham;
	double donGia;
	double giaGiam;
	double thueNhapKhau;
	
	public void nhap() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhap ten san pham");
		tenSanPham = scanner.nextLine();
		
		System.out.println("Nhap Don Gia");
		donGia = Double.parseDouble(scanner.nextLine());
		
		System.out.println("Nhap Gia Giam");
		giaGiam = Double.parseDouble(scanner.nextLine());
	}
	
	public double thueNhapKhau() {
		return thueNhapKhau = Math.round(donGia*10/100);
	}
	
	public void xuat() {
		System.out.println("Ten sp :"+tenSanPham);
		System.out.println("Don Gia :"+donGia);
		System.out.println("Gia Giam :"+giaGiam);
	}
}
