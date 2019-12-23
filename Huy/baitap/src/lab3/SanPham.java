package lab3;

import java.util.Scanner;

public class SanPham {
	public String tenSp;
	public double donGia;
	public double giamGia;
	public double tienThue;
	
	Scanner scanner = new Scanner(System.in);
	
	public void nhap() {
		 System.out.println("Nhap ten san pham:");
		 tenSp = scanner.nextLine(); 
		 
		 System.out.println("Nhap don gia san pham:");
		 donGia = scanner.nextDouble(); 
		 
		 System.out.println("Nhap giam gia:");
		 giamGia = scanner.nextDouble(); 
	}
	
	public double getThueNhapKhau() {
		return tienThue = donGia*10/100;
	}
	
	public void xuat() {
		 System.out.println(tenSp);
		 System.out.println(donGia);
		 System.out.println(giamGia);	
		 System.out.println(tienThue);	
	}
}
