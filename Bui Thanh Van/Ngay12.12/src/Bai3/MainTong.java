package Bai3;

import java.util.Scanner;

public class MainTong {
	
	public static void main(String[] args) {
		String HoTen;
		int Nganh;
		SinhVienIT svit= new SinhVienIT();
		SinhVienBiz svb= new SinhVienBiz();
		Scanner nhap = new Scanner(System.in);
		System.out.println("Nhập họ tên:");
		HoTen=nhap.nextLine();
		System.out.println("Nhập:\n 1: Nếu là sinh viên IT.\n 2: Nếu sinh viên Biz");
		Nganh=Integer.parseInt(nhap.nextLine());
		switch (Nganh) {
		case 1:
			svit.diem();
			System.out.println("Họ Tên: " + HoTen);
			System.out.println("Ngành: IT");
			svit.xeploai();
			break;
        case 2:
        	svb.diem();
        	System.out.println("Họ Tên: " + HoTen);
			System.out.println("Ngành: IT");
        	svb.xeploai();
			break;
		default:
			break;
		}
	}
}
