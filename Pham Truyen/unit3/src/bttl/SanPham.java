package bttl;

import java.util.Scanner; 

public class SanPham {
	
	private String tenSp;
	private double giaSp;
	private double giamGia;
	
	Scanner sanpham = new Scanner(System.in);
	
	public SanPham(String tenSp, double giaSp, double giamGia) {
		this.tenSp = tenSp;
		this.giaSp = giaSp;
		this.giamGia = giamGia;
	}
	
	public SanPham(String tenSp, double giaSp) {
		this(tenSp, giaSp,0);
	}

	public void nhap() {
		System.out.println("Nhap ten sp: ");
		tenSp = sanpham.nextLine();
		
		System.out.println("Nhap gia sp: ");
		giaSp = sanpham.nextDouble();
		
		System.out.println("Nhap giam gia: ");
		giamGia = sanpham.nextDouble();
	}
	
	public void xuat() {
		System.out.println("Ten sp: "+tenSp);
		System.out.println("Gia sp: "+giaSp);
		System.out.println("Giam gia : "+giamGia);
	}
}
