package bttl;

import java.util.Scanner;

public class ptb1 {
		
	static Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) {
		int a;
		int b;
		System.out.println("Nhap so a: ");
		a = scanner.nextInt();
		System.out.println("Nhap so b: ");
		b = scanner.nextInt();
		
		if(a==0) {
			if(b==0) {
				System.out.println("Vo so nghiem");
			}else {
				System.out.println("Vo nghiem");
			}
		}else {
			double x = -b/a;
			System.out.println("Nghiem x = "+x);
		}
	}
}
