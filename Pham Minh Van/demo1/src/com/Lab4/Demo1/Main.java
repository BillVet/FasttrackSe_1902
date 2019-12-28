package com.Lab4.Demo1;

import java.util.Scanner;

public class Main{
	public static Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) {
		double chieuDai;
		double chieuRong;
		double canh;
		
		
		
		System.out.println("Nhập chiều dài: ");
		chieuDai = scanner.nextDouble();
		
		System.out.println("Nhập chiều rộng: ");
		chieuRong  = scanner.nextDouble();
		
		System.out.println("Nhập cạnh: ");
		canh = scanner.nextDouble();
		
		HinhChuNhat cn = new HinhChuNhat(chieuDai,chieuRong);
		HinhChuNhat hv = new HinhVuong(canh);
		
		cn.xuat();
		hv.xuat();
	}
}
