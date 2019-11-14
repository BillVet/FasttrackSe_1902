package com.lab2;

import java.util.Scanner;

public class demo2 {

	public static void main(String[] args) {
		
		int a,b,c;
		double delta;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap so a");
		a = sc.nextInt();
		System.out.println("Nhap so b");
		b = sc.nextInt();
		System.out.println("Nhap so c");
		c = sc.nextInt();
		
		delta = Math.pow(b, 2) - 4*a*c;
		System.out.println("Delta :"+delta);
		
		if(delta>0) {
			double x1 = (-b+Math.sqrt(delta))/2*a;
			double x2 = (-b-Math.sqrt(delta))/2*a;
			System.out.println("Ngiem thu 1 :" +x1+ "Nghiem thu 2 :" +x2);
		}else if(delta==0) {
			double nghiemKep;
			nghiemKep=-b/2*a;
			System.out.println("Phuong trinh co nghiem kep x1 = x2 = :"+nghiemKep);
		}else if (delta<0){
			System.out.println("Phuong trinh vo nghiem");
		}
		
	}
}
