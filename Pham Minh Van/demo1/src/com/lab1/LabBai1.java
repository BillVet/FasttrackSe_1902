package com.lab1;

import java.util.Scanner;

public class LabBai1 {
	public static void main(String[] args) {
		String hoten;
		double diemTB;
		
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Nhap ho ten: ");
		hoten = scanner.nextLine();
		
		System.out.println("Nhap diem trung binh: ");
		diemTB = scanner.nextInt();
		
		System.out.println("Ho ten : " + hoten);
		System.out.println("Diem Trung Binh : " + diemTB);
		
	}
}