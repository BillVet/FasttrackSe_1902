package com.lab1;

import java.util.Scanner;

public class Vidu2 {
	public static void main(String[] args) {
		int a;
		int b;
		
		
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Nhap so a: ");
		a = scanner.nextInt();
		
		System.out.println("Nhap so b: ");
		b = scanner.nextInt();
		
		int c = a + b; 
		
		System.out.println("Tong : " + c);
		System.out.println("A luy thua b : " + Math.pow(a, b));
		double kq = Math.sqrt(c);
		System.out.printf("tong cua (a+b): %.4f",kq);
		
	}
}
