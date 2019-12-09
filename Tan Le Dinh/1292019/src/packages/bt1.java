package packages;

import java.util.Scanner;

public class bt1 {
	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		int a;
		int b;
		int x;
		System.out.println("Nhập a: ");
		a = s.nextInt();
		System.out.println("Nhập b: ");
		b = s.nextInt();
		if(a==0) {
			if(b==0) {
				System.out.println("Vô số nghiệm");
			}
			else {
				System.out.println("Vô nghiệm");
			}
		}
		else {
			x = -b/a;
			System.out.println("Nghiệm =" + x);
		}
	}
}
