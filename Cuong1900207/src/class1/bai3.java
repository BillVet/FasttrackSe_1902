package class1;

import java.util.Scanner;

public class bai3 {
	public static void main(String[] args) {
		int a;
		int thetich;
		
Scanner scanner = new Scanner(System.in);
		
		System.out.println("Nhap canh hinh lap phuong");
		a = scanner.nextInt();
		
		System.out.println("The tich cua hinh lap phuong la: " + Math.pow(a, 3));
	}
}
