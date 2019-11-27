package com.lab4;

import java.util.Scanner;

public class demo1 {

	public static void main(String[] args) {
		int n , sum = 0 ;
		Scanner scanner = new Scanner(System.in);
		
		do {
			System.out.println("Nhap so phan tu mang :");
			n = scanner.nextInt();
		} while (n<0);
		
		// Khoi tao mang 
		int arry[] = new int[n];
		System.out.println("Nhap cac phan tu cho mang :");
		
		for(int i = 0 ;i<n;i++) {
			System.out.println("Nhap phan tu thu :"+i);
			arry[i] = scanner.nextInt();
		}
		
		// Hien thi mang vua nhap
		System.out.println("Hien thi mang vua nhap");
		for(int i = 0 ; i < n ; i++) {
			System.out.print(arry[i]+"\t" +"\n");
		}
		
		// Hien thi tong cac phan tu trong mang
		
		for(int i = 0 ; i < n ; i++) {
			sum += arry[i];
		}
		System.out.println("Tổng các phần tử trong mảng :"+sum);
	}
}
