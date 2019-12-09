package com.lab1;

import java.util.Scanner;

public class LabBai2 {
	public static void main(String[] args) {
		int a;
		int b;
		
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Nhap canh a: ");
		a = scanner.nextInt();
		
		System.out.println("Nhap canh b: ");
		b = scanner.nextInt();
		
		double p = (a+b)*2;
		double s = a * b;
		
		System.out.println("Chu vi = " + p);
		System.out.println("Dien tich = " + s);
		System.out.println("Canh nho nhat la canh co gia tri = " + Math.min(a, b));
		
	}
}