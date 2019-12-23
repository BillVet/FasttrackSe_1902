package KeThua;

import java.util.Scanner;

public class MainTong {
	public static void main(String[] args) {
		int dai;
		int rong;
		int canh;
		Scanner s = new Scanner(System.in);
		System.out.println("Nhap chieu dai: ");
		dai=Integer.parseInt(s.nextLine());
		System.out.println("Nhap chieu rong: ");
		rong=Integer.parseInt(s.nextLine());
		System.out.println("Nhap canh:");
		canh=Integer.parseInt(s.nextLine());
		HinhChuNhat hcn = new HinhChuNhat(dai, rong);
		HinhChuNhat hv = new HinhVuong(canh);
		hcn.getchuVi();
		hcn.getdienTich();
		hv.getchuVi();
		hv.getdienTich();
	}
}
