package baitap;

import java.util.Scanner;

public class MainHinhChuNhat {
	private static Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) {
		double chieuDai,chieuRong;
		int canh;
		
		System.out.println("Nhap chieu dai: ");
		chieuDai = Double.parseDouble(scanner.nextLine());
		System.out.println("Nhap chieu rong: ");
		chieuRong = Double.parseDouble(scanner.nextLine());
		System.out.println("Nhap canh: ");
		canh = Integer.parseInt(scanner.nextLine());
		
		HinhChuNhat cn = new HinhChuNhat();
		HinhChuNhat hv = new HinhVuong(canh);
		
		cn.xuat();
		hv.xuat();
	}
}
