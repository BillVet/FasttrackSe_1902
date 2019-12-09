package class1;

import java.util.Scanner;

public class bai2 {
	public static void main(String[] args) {
		int a;
		int b;
		int dientich;
		int chuvi;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Nhap canh a");
		a = scanner.nextInt();
		
		System.out.println("Nhap canh b");
		b = scanner.nextInt();
		
		dientich = a*b;
		chuvi=(a+b)*2;
		
		System.out.println("Dien tich hinh chu nhat la: " + dientich);
		System.out.println("Chu vi hinh chu nhat la : " + chuvi);
		System.out.println("Canh nho cua hinh chu nhat la: " + Math.min(a,b));
	}
}
