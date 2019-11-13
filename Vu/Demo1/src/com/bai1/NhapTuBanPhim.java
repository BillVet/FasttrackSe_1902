package com.bai1;

import java.util.Scanner;

public class NhapTuBanPhim {
	public static void main(String[] args) {
		String name;
		int tuoi;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap ho ten :");
		name = sc.nextLine();
		System.out.println("Nhap tuoi :");
		tuoi = sc.nextInt();
		
		System.out.println("Hien thi ten :"+name);
		System.out.println("Hien thij tuoi :"+tuoi);
	}

}
