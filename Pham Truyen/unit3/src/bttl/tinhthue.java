package bttl;

import java.util.Scanner; 

public class tinhthue {

	private String tenSp;
	private double donGia;
	private double giamGia;
	private double thueNhapKhau;

	Scanner tinhThue = new Scanner(System.in);

	public void nhap() {
		System.out.println("Nhap ten san pham: ");
		tenSp = tinhThue.nextLine();
		System.out.println("Nhap don gia: ");
		donGia = tinhThue.nextDouble();
		System.out.println("Nhap giam gia: ");
		giamGia = tinhThue.nextDouble();
	}
	public double getThueNhapKhau() {
		return thueNhapKhau = Math.round(donGia*10/100);
	}
	
	public void xuat() {
		
		System.out.println("Ten san pham: "+tenSp);
		System.out.println("Don gia: "+donGia);
		System.out.println("Giam gia: "+giamGia);
		System.out.println("Thue nhap khau: "+thueNhapKhau);
	}
}


