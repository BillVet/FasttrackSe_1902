package lab4;

import java.util.Scanner;

public class Main {
	public static void main(String[]args) {
		int dai,rong,canh;
		Scanner scanner = new Scanner (System.in);
		System.out.println("nhap chieu dai:");
		dai = scanner.nextInt();
		System.out.println("nhap chieu rong:");
		rong = scanner.nextInt();
		System.out.println("nhap canh:");
		canh = scanner.nextInt();
		Hinh cn =new Hinh(dai,rong);
		hinhvuong hv = new hinhvuong(canh);
		
		cn.xuat();
		hv.xuat();
	}
}
