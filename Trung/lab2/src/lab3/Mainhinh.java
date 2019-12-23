package lab3;

import java.util.Scanner;

public class Mainhinh {

	private static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		double dai,rong;
		int canh;
		
		System.out.println("Nhap chieu dai :");
		dai = Double.parseDouble(scanner.nextLine());
		
		System.out.println("Nhap chieu rong :");
		rong = Double.parseDouble(scanner.nextLine());
		
		System.out.println("Nhap canh :");
		canh = Integer.parseInt(scanner.nextLine());
	
		hinh cn = new hinh(dai,rong);
		hinh hv = new hinhvuong(canh);
		
		cn.xuat();
		hv.xuat();
	}
}
