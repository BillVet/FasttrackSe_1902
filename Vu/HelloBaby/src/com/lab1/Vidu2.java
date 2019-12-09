package com.lab1;

import java.util.Scanner;

public class Vidu2 {

	public static void main(String[] args) {
		
		String hovaten;
		int sbd;
		int diem;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Nhap ho va ten");
		hovaten = scanner.nextLine();
		
		
		System.out.println("Nhap so bao danh");
		sbd = scanner.nextInt();
		
		System.out.println("Nhap diem:");
		diem = scanner.nextInt();
		
		System.out.println("Hien thi ho va ten :"+hovaten);
		System.out.println("Hien thi so bao danh :"+sbd);
		System.out.println("Hien thi diem :"+diem);
	}
}
