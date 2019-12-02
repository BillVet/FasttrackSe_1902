package com.lab6;

import java.util.Scanner;

public class Demo1 {

	private static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		System.out.println("Nhap so dien thoai");
		String sdt = scanner.nextLine();
		
		String parten = "0[0-9]{9,10}";
		
		if(sdt.matches(parten)) {
			System.out.println("Ban da nhap dung so dien thoai");
		}else {
			System.out.println("Ban da khong nhap dung so dien thoai");
		}
	}
}
