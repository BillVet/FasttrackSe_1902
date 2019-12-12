package lab3;

import java.util.Scanner;

public class SinhVien {
	private String hoTen;
	private double diemTB;
	private String loai;
	
	Scanner scanner = new Scanner(System.in);
	
	public SinhVien() {
		
	}
	
	public SinhVien(String hoTen, double diemTB) {
		super();
		this.hoTen = hoTen;
		this.diemTB = diemTB;
	}

	public void nhap() {
		 System.out.println("Nhap ten sinh vien:");
		 hoTen = scanner.nextLine(); 
		 
		 System.out.println("Nhap diem sinh viem:");
		 diemTB = scanner.nextDouble(); 
		 
	}
	public String xepLoai() {
		if(diemTB < 5) {
			loai ="Chua Dat";
		}else {
			loai ="Dat";
		}
		return loai;
	}
	public void xuat() {
		System.out.println("ten sinh vien: "+hoTen);
		System.out.println("diemsinh vien: "+diemTB);
		System.out.println("xep loai: "+loai);
	}
}
