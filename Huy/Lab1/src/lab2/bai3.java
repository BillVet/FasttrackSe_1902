package lab2;

import java.util.Scanner;

public class bai3 {
	public static void main(String[] args) {
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
}
