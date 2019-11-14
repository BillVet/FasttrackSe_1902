package com.baitap;

import java.util.Scanner;

public class Bai2 {

	public static void main(String[] args) {
		
		int chieuDai;
		int chieuRong;
		double chuVi,dienTich;
		float canhNhoNhat;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap chieu dai :");
		chieuDai = sc.nextInt();
		System.out.println("Nhap chieu rong :");
		chieuRong = sc.nextInt();
		
		// Tinh chu vi va dien tich
		chuVi = (chieuDai+chieuRong)*2;
		dienTich = chieuDai*chieuRong;
		canhNhoNhat = Math.min(chieuDai, chieuRong);
		
		System.out.printf("Hien thi chu vi : "+chuVi);
		System.out.printf("Hien thi dien tich :"+dienTich);
		System.out.printf("Hien thi canh nho nhat :"+canhNhoNhat);
	}
}
