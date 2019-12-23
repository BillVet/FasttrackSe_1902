package Bai2;

import java.util.Scanner;

public class SanPham {
	private String tenSanPham;
	private String maSanPham;
	private Double giaSanPham;
	Scanner s= new Scanner(System.in);
	public void nhap() {
		System.out.println("Nhập tên sản phẩm: ");
		tenSanPham = s.nextLine();
		System.out.println("Nhập mã sản phẩm: ");
		maSanPham = s.nextLine();
		System.out.println("Nhập giá sản phẩm: ");
		giaSanPham = Double.parseDouble(s.nextLine());
	}
	public void xuat() {
		System.out.println("Tên sản phẩm: " + tenSanPham);
		System.out.println("Mã sản phẩm: " + maSanPham);
		System.out.println("Giá sản phẩm: " + giaSanPham);
	}
	public SanPham() {
	}
	public SanPham(String tenSanPham, String maSanPham, Double giaSanPham) {
		super();
		this.tenSanPham = tenSanPham;
		this.maSanPham = maSanPham;
		this.giaSanPham = giaSanPham;
	}
	
}
