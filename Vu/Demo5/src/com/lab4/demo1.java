package com.lab4;

import java.util.Scanner;

public class demo1 {

	public static void main(String[] args) {
		int n , sum = 0 ,temp;
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
		
		// sắp xếp theo thứ tự giảm dần
	    for (int i = 0; i < n - 1; i++) {
	        for (int j = i + 1; j <= n - 1; j++) {
	            if (arry[i] < arry[j]) {
	                temp = arry[i];
	                arry[i] = arry[j];
	                arry[j] = temp;
	            }
	        }
	    }
	    System.out.println("Mảng sau khi sắp xếp là: ");
	    for (int i = 0; i < n; i++) {
	        System.out.print(arry[i] + "\t");
	    }
	         
	    // tìm phần tử nhỏ nhất
	    // sau khi sắp xếp theo thứ tự giảm dần 
	    // thì phần tử nhỏ nhất là phần tử cuối cùng trong mảng
	    System.out.println("\nPhần tử nhỏ nhất trong mảng là " + arry[n - 1]);
	}
}
