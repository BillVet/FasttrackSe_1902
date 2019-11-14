package com.lab2;

import java.util.Scanner;

public class demo3 {

	private static Scanner scanner;

	public static void main(String[] args) {
		thucHienTinhTong();
		thucHienTinhTru();
	}
	
	public static void thucHienTinhTong() {
		
		int a ,b;
		
		scanner = new Scanner(System.in);
		System.out.println("Nhap so a");
		a = scanner.nextInt();
		System.out.println("Nhap so b");
		b = scanner.nextInt();
		
		double c = a+b;
		System.out.println("Tong :"+c);
		
		
	}
	
	public static void thucHienTinhTru() {
		int a ,b;
		scanner = new Scanner(System.in);
		System.out.println("Nhap so a");
		a = scanner.nextInt();
		System.out.println("Nhap so b");
		b = scanner.nextInt();
		
		double c = a-b;
		System.out.println("Tong :"+c);
	}
}
