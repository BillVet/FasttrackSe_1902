package com.lab6.baitap;

import java.util.Scanner;

public class BaiTap1 {

	private static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		System.out.println("Nhap ho :");
		String ho = scanner.nextLine();
		
		System.out.println("Nhap ten :");
		String ten = scanner.nextLine();
		
		// Xuat ra man hinh ho va ten in hoa
		System.out.println("Ho:"+ho.toUpperCase()+""+ten.toUpperCase());
	}
}
