package bieuthucchinhquy;

import java.util.Scanner;

public class nhanvien {
	public static void main(String[]args) {
		int a ;
		int b ;
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("nhap so a");
			a = scanner.nextInt();
		System.out.print("nhap so b");
			b = scanner.nextInt();			
		int tong= a + b ;
		System.out.print(tong);
	}
}
