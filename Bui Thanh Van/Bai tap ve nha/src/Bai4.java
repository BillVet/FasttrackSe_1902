import java.util.Scanner;

public class Bai4 {
	public static void main(String[] args) {
		int a;
		int b;
		int c;
		double d;
		Scanner sanner = new Scanner(System.in);
		System.out.println("Nhập a:");
		a = sanner.nextInt();
		System.out.println("Nhập b:");
		b = sanner.nextInt();
		System.out.println("Nhập c:");
		c = sanner.nextInt();
		d = Math.pow(b,2) - 4*a*c;
		System.out.println("Delta: " + d);
		System.out.println("Căn delta: " + Math.sqrt(d));
	}
}
