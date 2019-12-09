package com.lab2;

import java.util.Scanner;

public class Lab2Bai1 {
	public static void main(String[] args) {
		
		int a;
		int b;
		
		System.out.println("Phương trình bậc nhất có dạng: ax + b = 0");
		
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Nhập hệ số a: ");
		a = scanner.nextInt();
		System.out.println("Nhập hệ số b: ");
		b = scanner.nextInt();
		
		int x = -b/a;
		
		if (a==0) {
			if(b==0) {
				System.out.println("Phương trình có vô số nghiệm ! \n");
			} else {
				System.out.println("Phương trình vô nghiệm ! \n");
			}
		} else {
			System.out.println("Phương trình có nghiệm = \n" + x);
		}
		
		
		
		
		
		
		
		
	}
}
