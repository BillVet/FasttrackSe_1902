package com.lab1;

import java.util.Scanner;

public class Lab1Bai3 {
	public static void main(String[] args) {
		int a;
		int b;
		int c;
		
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Nhap canh a: ");
		a = scanner.nextInt();
		
		System.out.println("Nhap canh b: ");
		b = scanner.nextInt();
		
		System.out.println("Nhap canh c: ");
		c = scanner.nextInt();
		
		double v = a * b *c;
		
		System.out.println("The tich cua khoi lap phuong = " + v);
		
	}
}