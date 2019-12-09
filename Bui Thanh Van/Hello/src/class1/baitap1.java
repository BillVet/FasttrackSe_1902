package class1;

import java.util.Scanner;

public class baitap1 {
	public static void main(String[] args) {
		int a;
		int b;
		int c;
		Scanner sanner = new Scanner(System.in);
		System.out.println("Nhập a");
		a = sanner.nextInt();
		System.out.println("Nhập b");
		b = sanner.nextInt();
		c = a+b;
		System.out.println("Tổng của a và b là: " + c);
		System.out.println("Căn bậc hai của tổng a và b là: " + Math.sqrt(c));
		System.out.println("Bình phương của tổng a và b là: " + Math.pow(c,2));
	}
}
