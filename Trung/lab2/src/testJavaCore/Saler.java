package testJavaCore;

import java.util.Scanner;

public class Saler extends NhanVien {
	public int doanhSo;
	public double hoaHong;
	public Saler() {
		super();
	}

	public Saler(int doanhSo, double hoaHong) {
		super();
		this.doanhSo = doanhSo;
		this.hoaHong = hoaHong;
	}
	public void nhap() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhap doanh so ban hang :");
		doanhSo = scanner.nextInt();
		System.out.println("Nhap ti le hoa hoang :");
		hoaHong = Double.parseDouble(scanner.nextLine());
	}
}
