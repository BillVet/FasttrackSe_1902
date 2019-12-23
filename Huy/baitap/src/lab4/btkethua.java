package lab4;

import java.util.Scanner;

public class btkethua {
	public static void main(String[]  args) {
		int dai,rong,canh;
		Scanner scanner= new Scanner(System.in);
		
		System.out.println("Nhap chieu dai :");
		dai = Integer.parseInt(scanner.nextLine());
		
		System.out.println("Nhap chieu rong :");
		rong = Integer.parseInt(scanner.nextLine());
		
		System.out.println("Nhap canh :");
		canh = Integer.parseInt(scanner.nextLine());
		
		ChuNhat cn = new ChuNhat(dai, rong);
		ChuNhat hv = new Vuong(canh);
		
		cn.xuat();
		hv.xuat();
	}
}
