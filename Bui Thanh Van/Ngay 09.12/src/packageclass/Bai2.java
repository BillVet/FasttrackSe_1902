package packageclass;

import java.util.Scanner;

public class Bai2 {
	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		double a;
		double b;
		double c;
		double d;
		double x1;
		double x2;
		System.out.println("Nhập a: ");
		a = s.nextInt();
		System.out.println("Nhập b: ");
		b = s.nextInt();
		System.out.println("Nhập c: ");
		c = s.nextInt();
		if (a==0) {
			if (b==0) {
			if (c==0) {
				System.out.println("Phương trình vô số nghiệm");
			} else {
				System.out.println("Phương trình vô nghiệm");
			}
			} else {
				x1 = -c/b;
				System.out.println("Phương trình có nghiệm: " + x1);
			}
		} else {
			d = Math.pow(b,2)-4*a*c;
			if (d<0) {
				System.out.println("Phương trình vô nghiệm");
			} else if (d==0) {
				x1 = -b/(2*a);
				System.out.println("Phương trình có nghiệm kép: " + x1);
			} else {
				x1 = (-b+Math.sqrt(d))/ 2*a;
				x2 = (-b-Math.sqrt(d))/ 2*a;
				System.out.println("Phương trình có nghiệm x1: " + x1);
				System.out.println("Phương trình có nghiệm x2: " + x2);
			}
		}
	}
}
