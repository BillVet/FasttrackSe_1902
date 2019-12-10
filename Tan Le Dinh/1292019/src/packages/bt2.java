package packages;

import java.util.Scanner;

public class bt2 {
	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		double a;
		double b;
		double c;
		double x;
		double x1;
		double x2;
		double d;
		System.out.println("Nhập a: ");
		a = s.nextInt();
		System.out.println("Nhập b: ");
		b = s.nextInt();
		System.out.println("Nhập c: ");
		c = s.nextInt();
		if(a==0) {
			x = -c/b;
			System.out.println("Nghiệm = "+ x);
		}
		else {
			d = b*b - 4*a*c;
			if(d<0) {
				System.out.println("Vô nghiệm");
			}
			else if(d==0){
				x = -b/2*a;
				System.out.println("Nghiệm kép = "+ x);
			}
			else {
				x1 = (-b+Math.sqrt(d))/(2*a);
				System.out.println("Nghiệm x1 = "+ x1);
				x2 = (-b-Math.sqrt(d))/(2*a);
				System.out.println("Nghiệm x2 = "+ x2);
			}
		}
	}
}
