package lab5;

import java.util.Scanner;


public class abc {
	
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Nhap so a :");
		int a = scanner.nextInt();
		System.out.println("Nhap so b :");
		int b = scanner.nextInt();
		
		int tong = a+b;
		System.out.println("Tong = " + tong);
		
}
}