package unit4;

import java.util.Scanner;

public class mainDemo {
	private static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		double chieuDai, chieuRong;
		int canh;
		
		System.out.println("Nhap chieu dai");
		chieuDai = Double.parseDouble(scanner.nextLine());
		
		System.out.println("Nhap chieu rong");
		chieuRong = Double.parseDouble(scanner.nextLine());
		
		System.out.println("Nhap canh hinh vuong");
		canh = Integer.parseInt(scanner.nextLine());
		HinhChuNhat hcn= new HinhChuNhat(chieuDai, chieuRong);
		HinhChuNhat hv = new HinhVuong(canh);
		
		hcn.getChuVi();
		hcn.getDienTich();
		System.out.println("Chu vi diện tích hv");
		hv.getChuVi();
		hv.getDienTich();
	}
}
