package bttl;

import java.util.Scanner;

public class ptb2 {
	static Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) {
		int a;
		int b;
		int c;
		System.out.println("Nhap so a: ");
		a = scanner.nextInt();
		System.out.println("Nhap so b: ");
		b = scanner.nextInt();
		System.out.println("Nhap so c: ");
		c = scanner.nextInt();
		
		if(a==0) {
			if(b==0) {
				if(c==0) {
					System.out.println("Vo so nghiem");
				}else {
					System.out.println("Vo nghiem");
				}
			}else {
				double x = -c/b;
				System.out.println("Nghiem x = "+x);
			}
		}else if(a!=0) {
			double delta;
			delta=(b*b)-4*a*c;
			double x = -b/(2*c);
			if(delta<0) {
				System.out.println("Vo nghiem");
			}else if(delta==0) {
				System.out.println("Ngiem kep x = "+x);
			}else{
				double x1 = (-b+Math.sqrt(delta))/(2*a);
				double x2 = (-b-Math.sqrt(delta))/(2*a);
				System.out.println("Ngiem x1 = "+x1);
				System.out.println("Ngiem x2 = "+x2);
			}
		}
	}
}

