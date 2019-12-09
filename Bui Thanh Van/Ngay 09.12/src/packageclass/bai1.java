package packageclass;

import java.util.Scanner;

public class bai1 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		double a;
		double b;
		double x;
		System.out.println("Nhập a");
		a = s.nextInt();
		System.out.println("Nhập b");
		b = s.nextInt();
		if (a==0) {
			if (b==0) {
				System.out.println("vô số nghiệm");
			}
			else {
				System.out.println("vô nghiệm");
			}
		} else {
			x =-b/a;
			System.out.println("Nhiệm x: " + x);
		}
	}
}
