package class1;

import java.util.Scanner;

public class toantu {
	public static void main(String[] args) {
		int a;
		int b;
		int tong;
				
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Nhap so a");
		a = scanner.nextInt();
		
		System.out.println("Nhap so b");
		b = scanner.nextInt();
		
		tong=a + b;
		
		System.out.println("Tong 2 so la: " + tong);
		System.out.println("Binh phuong tong la: " + Math.pow(tong,2));
		System.out.println("can bac 2 tong la: " + Math.sqrt(tong));
		}
}
