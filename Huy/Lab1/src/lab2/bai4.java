package lab2;

import java.util.Scanner;

public class bai4 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("----menu----");
		System.out.println("1. Giai PTB1");
		System.out.println("2. GIAI PTB2");
		System.out.println("3. Tinh Tien Dien");
		System.out.println("4. Thoat");
		int choose = scanner.nextInt();
		switch(choose)
			{
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
				thoat();
				break;
			default:
				break;
			}
	}
	public static void phuongTrinhBac1() {
		Scanner scanner = new Scanner(System.in);
		
		 System.out.println("Nhap so a:");
		 int a = scanner.nextInt(); 
		 
		 System.out.println("Nhap so b:");
		 int b = scanner.nextInt();	 
		 
		 if(a ==0) {
			 if(b ==0) {
				 System.out.println("Phuong trinh vo so nghiem");
			 }else {
				 System.out.println("Phuong trinh vo nghiem");
			 }
		 }else {
			 int x = -b/a;
			 System.out.println("Phuong trinh co nghiem" +x);
		 }
	}
	public static void phuongTrinhBac2() {
		Scanner scanner = new Scanner(System.in);
		 
		 System.out.println("Nhap so a:");
		 int a = scanner.nextInt();
		 
		 System.out.println("Nhap so b:");
		 int b = scanner.nextInt();
		 
		 System.out.println("Nhap so c:");
		 int c = scanner.nextInt();
		 
		 if(a == 0) {
			 if(b ==0) {
				 if(c ==0) {
					 System.out.println("Phuong trinh vo so nghiem");
				 }else {
					 System.out.println("Phuong trinh vo nghiem");
				 }
			 }else {
				 int x = -c/b;
				 System.out.println("Phuong trinh co nghiem" +x);
			 }
		 }else {
			 int d = (b*b)-(4*a*c);
			 if(d < 0) {
				 System.out.println("Phuong tirnh vo nghiem");
			 }else if(d == 0) {
				 int x = -b/(2*a);
				 System.out.println("Phuong trinh co nghiem kep: "+x);
			 }else {
				 double x1 = (-b + Math.sqrt(d))/(2*a);
				 double x2 = (-b - Math.sqrt(d))/(2*a);
				 System.out.println("Phuong trinh co 2 nghiem phan biet:");
				 System.out.println("\n"+x1);
				 System.out.println("\n"+x2);
			 }
		 }
	}
	public static void tinhTienDien() {
		Scanner scanner = new Scanner(System.in);
		 
		System.out.println("Nhap so dien:");
		int sodien = scanner.nextInt();
		int tiendien;
		if(sodien <= 50) {
			tiendien = sodien*1000;
		}else {
			tiendien = (50*1000)+((sodien-50)*1200);
		}
		System.out.println("So tien dien phai tra la "+tiendien+" nghin dong");
	}
	public static void thoat() {
		System.exit(0);
	}
}
