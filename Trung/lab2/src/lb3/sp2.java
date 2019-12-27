package lb3;

import java.util.Scanner;

public class sp2 {

	private String tenSP;
	private double giaSP;
	private double giamGia;
	
	Scanner scanner = new Scanner(System.in);
	
	public sp2() {
		
	}
	
	public sp2(String tenSP, double giaSP, double giamGia) {
		super();
		this.tenSP = tenSP;
		this.giaSP = giaSP;
		this.giamGia = giamGia;
	}
	
	

	public sp2(String tenSP, double giaSP) {
		this(tenSP,giaSP,0);
	}

	public void nhap() {
		System.out.println("Nhap ten san pham");
		tenSP = scanner.nextLine();
		
		System.out.println("Nhap gia san pham");
		giaSP = Double.parseDouble(scanner.nextLine());
		
		System.out.println("Nhap gia giam");
		giamGia = Double.parseDouble(scanner.nextLine());
				
	}
	
	public void xuat() {
		System.out.println("Ten san pham: "+tenSP);
		System.out.println("Gia san pham: "+giaSP);
		System.out.println("Gia giam san pham"+giamGia);
	}
}
