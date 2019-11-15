package com.lab2.baitap;

import java.util.Scanner;

public class b1 {

	public static void main(String[] args) {
		float a,b,c;
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhap so a:");
		a = scanner.nextFloat();
		System.out.println("Nhap so b:");
		b = scanner.nextFloat();
		System.out.println("Nhap so c:");
		c= scanner.nextFloat();
		double x = -b/a;
		
		if(a==0) {
			if(b==0) {
				System.out.println("Phuong trinh co vo so nghiem");
			}
			else {
				System.out.println("Phuong trinh vo nghiem");
			}
			
		}else {
			System.out.println("Phuong trinh co nghiem :" + x);
		}
		float x1,x2;
		float delta = b*b - 4*a*c;
		if(delta>0) {
			x1 = (float) ((-b + Math.sqrt(delta)) / (2*a));
			x2 = (float) ((-b - Math.sqrt(delta)) / (2*a));
			System.out.println("Phuong trinh co 2 nghiem phan biet : x1 = "+x1+ ",x2=" +x2);
		}else if(delta==0) {
			x1 = (-b/2*a);
			System.out.println("Phuong trinh co nghiem kep x1=x2="+x1);
		}else if(delta<0) {
			System.out.println("Phuong trinh vo nghiem");
		}
	}
}
