package com.lab2;

import java.util.Scanner;

public class demo1 {

	public static void main(String[] args) {

		int so;
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap so :");
		so = sc.nextInt();
		
		if(so > 0) {
		so = (int) Math.sqrt(so);
		System.out.println("Hien thi can bac 2 : " +so);
		}else {
			System.out.println("Khong phai so duong .Fails");
		}
	}
}
