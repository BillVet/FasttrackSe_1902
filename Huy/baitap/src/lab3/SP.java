package lab3;

import java.util.Scanner;

public class SP {
	private String tenSP;
	private double giaSP;
	private double giamSP;
	
	Scanner scanner = new Scanner(System.in);
	
	public SP() {
		
	}
	
	public SP(String tenSP, double giaSP, double giamSP) {
		super();
		this.tenSP = tenSP;
		this.giaSP = giaSP;
		this.giamSP = giamSP;
		this.scanner = scanner;
	}
	

	public SP(String tenSP, double giaSP) {
		this(tenSP,giaSP,0);
	}

	public void nhap() {
		 System.out.println("Nhap ten san pham:");
		 tenSP = scanner.nextLine(); 
		 
		 System.out.println("Nhap gia san pham:");
		 giaSP = scanner.nextDouble(); 
		 
	}
	public void xuat() {
		System.out.println("ten san pham: "+tenSP);
		System.out.println("gia san pham: "+giaSP);
	}
}
