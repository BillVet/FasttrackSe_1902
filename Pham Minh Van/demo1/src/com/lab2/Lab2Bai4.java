package com.lab2;

import java.util.Scanner;

public class Lab2Bai4 {

	private static Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("+---------------------------------------------------+");
		System.out.println("1.	Giải phương trình bậc nhất");
		System.out.println("2.	Giải phương trình bậc 2");
		System.out.println("3.	Tính tiền điện");
		System.out.println("4.	Kết thúc");
		System.out.println("+---------------------------------------------------+");


		System.out.println("Chọn chức năng: ");
		int x = scanner.nextInt();
		switch(x) {
		case 1:
			phuongTrinhBac1();
			break;
		case 2:
			phuongTrinhBac2();
			break;
		case 3:
			tinhTienDien();
			break;
		case 4:
			System.out.println("Đã kết thúc");
			break;
		}



	}
	
	public static void phuongTrinhBac1() {
		int a;
		int b;
		
		System.out.println("Phương trình bậc nhất có dạng: ax + b = 0");
		
		
		System.out.println("Nhập hệ số a: ");
		a = scanner.nextInt();
		System.out.println("Nhập hệ số b: ");
		b = scanner.nextInt();
		
		int x = -b/a;
		
		if (a==0) {
			if(b==0) {
				System.out.println("Phương trình có vô số nghiệm ! \n");
			} else {
				System.out.println("Phương trình vô nghiệm ! \n");
			}
		} else {
			System.out.println("Phương trình có nghiệm = \n" + x);
		}
		
		
	}
	
public static void phuongTrinhBac2() {
	float a;
	float b;
	float c;
	double x1, x2;
	
	System.out.println("Phuong trinh bac hai co dang: a*pow(x,2) + b*x + c = 0");
	
	@SuppressWarnings("resource")
	Scanner scanner = new Scanner(System.in);
	
	System.out.println("Nhap a (he so bac 2): ");
	a = scanner.nextFloat();
	
	System.out.println("Nhap b (he so bac 1): ");
	b = scanner.nextFloat();
	
	System.out.println("Nhap c: ");
	c = scanner.nextFloat();
	
	double delta = Math.pow(b,2)-4*a*c;
	
	if(delta<0) {
		System.out.println("delta < 0 nen: ");
	} else {
	System.out.println("Delta = " + delta);
	System.out.println("Can bac 2 cua Delta = " + Math.sqrt(delta));
	}
	
	if(delta == 0 ) {
		x1 = x2 = ((-b)/(2*a));
		System.out.println("x1 = x2 = " + x1);
	} else if(delta > 0) {
	x1 = ((-b + Math.sqrt(delta))/(2*a));
	x2 = ((-b - Math.sqrt(delta))/(2*a));
	System.out.println("x1 = " + x1);
	System.out.println("x2 = " + x2);
} else if(delta < 0) {
	System.out.println("phuong trinh vo nghiem");
}
	
	
}
public static void tinhTienDien() {
	int number;
	
	
	
	@SuppressWarnings("resource")
	Scanner scanner = new Scanner(System.in);
	
	System.out.println("Nhập chỉ số điện:");
	number = scanner.nextInt();
	
		
	
	if(number <= 50) {
		number = number*1000;
	} else {
		number = 50*1000 + (number - 50)*1200;
	}
	
	

	System.out.println("Tổng tiền cần thanh toán: \n" + number + "đồng");
}

}
