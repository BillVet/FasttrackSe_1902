package com.lab2;

import java.util.Scanner;

public class demo5 {
	
	private static Scanner scanner;
	
	public static void main(String[] args) {
//		System.out.println(">> Moi ban chon<<");
//		System.out.println("+---------------+");
//		System.out.println("| 1.Cong         ");
//		System.out.println("| 2.Tru          ");
//		System.out.println("| 3.Ket thuc     ");
//		System.out.println("+---------------+");
//		System.out.println(">> Chon chuc nang");

		int answer;
		scanner = new Scanner(System.in);
		
		System.out.println("Nhap phuong thuc ma ban can tinh toan ");
		answer = scanner.nextInt();
		
		switch (answer) {
		case 1:
			thucHienTinhTong();
			break;
		case 2:
			thucHienTinhTru();
			break;
		case 3:
			System.exit(0);
			break;
		default:
			System.out.println("Vui long chon phep tinh ma ban muon >>");
		}
		
		
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
