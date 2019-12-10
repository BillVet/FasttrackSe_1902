package lab2;

import java.util.Scanner;

public class bai1 {
	public static void main(String[] args) {
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
}