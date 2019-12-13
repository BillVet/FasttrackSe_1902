package packageclass;

import java.util.Scanner;

public class Bai3 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int a;
		int b;
		int c;
		int d;
		System.out.println("Nhập số cũ");
		a = s.nextInt();
		System.out.println("Nhập số mới");
		b = s.nextInt();
		c = b - a;
		if (c < 50) {
			d = c*100;
			System.out.println("Tiền cần trả: " + d);
		} else {
			d = (c-50)*1200 + 50*1000;
			System.out.println("Tiền cần trả: " + d);
		}
	}
}
