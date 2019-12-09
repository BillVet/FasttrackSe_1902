package com.lab1;

import java.util.Scanner;

public class Lab1Bai4 {
	public static void main(String[] args) {
		float a;
		float b;
		float c;
		double x1, x2;
		
		System.out.println("Phuong trinh bac hai co dang: a*pow(x,2) + b*x + c = 0");
		
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Nhap a (he so bac 2): ");
		a = scanner.nextFloat();
		
		System.out.println("Nhap b (he so bac 1): ");
		b = scanner.nextFloat();
		
		System.out.println("Nhap c: ");
		c = scanner.nextFloat();
		
		double delta = Math.pow(b,2)-4*a*c;
		
		if(delta<0) {
			System.out.println("delta < 0 nen: ");
		} else {
		System.out.println("Delta = " + delta);
		System.out.println("Can bac 2 cua Delta = " + Math.sqrt(delta));
		}
		
		if(delta == 0 ) {
			x1 = x2 = ((-b)/(2*a));
			System.out.println("x1 = x2 = " + x1);
		} else if(delta > 0) {
		x1 = ((-b + Math.sqrt(delta))/(2*a));
		x2 = ((-b - Math.sqrt(delta))/(2*a));
		System.out.println("x1 = " + x1);
		System.out.println("x2 = " + x2);
	} else if(delta < 0) {
		System.out.println("phuong trinh vo nghiem");
	}
}
}