package unit3;

import java.util.Scanner;

public class sanPham {
	private String tenSp;
	private double donGia;
	private double giamGia;
	
	Scanner scanner = new Scanner(System.in);
	
	public void thueNk() {
		double b;
		b= (donGia*10)/100;
		System.out.println("Thue nhap khau: "+ b);
	}
	public void Nhap() {
		System.out.println("Nhap ten San Pham: ");
		tenSp = scanner.nextLine();
		System.out.println("Nhap gGia San Pham: ");
		donGia= Double.parseDouble(scanner.nextLine());
		System.out.println("Nhap tien giam gia: ");
		giamGia= Double.parseDouble(scanner.nextLine());
		
	}
	public void Xuat() {
		System.out.println("Ten San Pham: "+ tenSp);
		System.out.println("Gia San Pham: "+donGia);
		System.out.println("Giam gia: "+giamGia);
		
	}
}
