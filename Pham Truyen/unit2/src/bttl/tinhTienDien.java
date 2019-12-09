package bttl;

import java.util.Scanner;

public class tinhTienDien {
	static Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) {
		int a;
		System.out.println("Nhap so dien: ");
		a = scanner.nextInt();
		int sotien1 = a*1000;
		int sotien2 = 50*1000 + (a-50)*1200;
		if(a<50) {
			System.out.println("So tien la: "+sotien1);
		}else {
			System.out.println("So tien la: "+sotien2);
		}
	}
}
