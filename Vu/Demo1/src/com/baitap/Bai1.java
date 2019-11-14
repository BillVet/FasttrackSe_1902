package com.baitap;

import java.util.Scanner;

public class Bai1 {

	public static void main(String[] args) {
		
		String ten;
		double diem;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap ten :");
		ten = sc.nextLine();
		System.out.println("Nhap diem :");
		diem = sc.nextDouble();
		
		// Xuat ra man hinh
		System.out.println("Ho va ten :" +ten+  "Diem :"+diem);
		
		System.out.printf("%s %f điểm", ten, diem);
		
	}
}
