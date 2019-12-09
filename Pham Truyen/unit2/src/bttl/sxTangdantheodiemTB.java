package bttl;

import java.util.Scanner;

public class sxTangdantheodiemTB {
	
	static Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.print("Nhap so phan tu cua mang: ");
		int n = scanner.nextInt();
		int [] arr = new int[n];
		System.out.print("Nhap cac phan tu cua mang: ");
		
		System.out.println("Nhap ho va ten: ");
		String hoten = scanner.nextLine();
		
		System.out.println("Nhap so diem: ");
		double diem = scanner.nextDouble();
		
		if(diem<5) {
			System.out.println("Hoc luc: Yeu");
		}else if(diem>=5 && diem<6.5) {
			System.out.println("Hoc luc: Trung binh");
		}else if(diem>=6.5 && diem<7.5) {
			System.out.println("Hoc luc: Kha");
		}else if(diem>=7.5 && diem<9) {
			System.out.println("Hoc luc: Gioi");
		}else {
			System.out.println("Hoc luc: Xuat xac");
		}
	}
}
