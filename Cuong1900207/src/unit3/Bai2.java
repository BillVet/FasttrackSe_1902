package unit3;

import java.util.Scanner;

public class Bai2 {
	private String tenSp;
	private String maSp;
	private Double giaSp;
	
	Scanner scanner = new Scanner(System.in);
	public Bai2() {
}
	public Bai2(String tenSp, String maSp, Double giaSp) {
		super();
		this.tenSp = tenSp;
		this.maSp = maSp;
		giaSp = giaSp;
	}
	public Bai2(String tenSp, double donGia) {
		this.(tenSp, donGia,0);
	}
	public void Nhap() {
		System.out.println("Nhap Ten SP");
		tenSp=scanner.nextLine();
		System.out.println("Nhap ma SP");
		maSp=scanner.nextLine();
		System.out.println("Nhap gia SP");
		giaSp= Double.parseDouble(scanner.nextLine());
	}
	public void Xuat() {
		System.out.println("Ten san pham :" + tenSp);
		System.out.println("Ma san pham :" + maSp);
		System.out.println("Gia tien :" + giaSp);
	}
}
