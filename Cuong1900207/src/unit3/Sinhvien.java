package unit3;

import java.util.Scanner;

public class Sinhvien {
	private String hoTen;
	private double diemTb;
	Scanner scanner = new Scanner(System.in);
	
	public Sinhvien() {
		
	}

	public Sinhvien(String hoTen, double diemTb) {
		super();
		this.hoTen = hoTen;
		this.diemTb = diemTb;
	}
	public void Nhap() {
		System.out.println("Nhap ho va ten");
		hoTen = scanner.nextLine();
		
		System.out.println("Nhap diem trung binh");
		diemTb = Double.parseDouble(scanner.nextLine());
		
	}
	public void Xuat() {
		System.out.println("Ho va ten SV:"+hoTen);
		System.out.println("Diem trung binh SV:"+diemTb);
	}
}
