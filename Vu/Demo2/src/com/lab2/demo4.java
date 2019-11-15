package com.lab2;

import java.util.Scanner;

public class demo4 {

	private static Scanner scanner ;

	public static void main(String[] args) {

		System.out.println(">> Moi ban chon<<");
		System.out.println("+---------------+");
		System.out.println("| 1.Cong         ");
		System.out.println("| 2.Tru          ");
		System.out.println("| 3.Ket thuc     ");
		System.out.println("+---------------+");
		System.out.println(">> Chon chuc nang");

		Scanner scanner = new Scanner(System.in);
		int answer = scanner.nextInt();
		if(answer==1) {
			thucHienTinhTong();
		}else if (answer==2) {
			thucHienTinhTru();
		}else if(answer==3) {
			System.exit(0);
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
