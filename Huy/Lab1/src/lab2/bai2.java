package lab2;

import java.util.Scanner;

public class bai2 {
	public static void main(String[] args) {
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
}
