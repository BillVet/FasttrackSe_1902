package bttl;

import java.util.Scanner;
	
	class SinhVien {
		String hoten;
		double diem;
		String hocluc;
	}

public class sxTangdantheodiemTB {

	private static Scanner scanner;

	public static void main(String[] args) {
		int n;
		System.out.print("Nhap so phan tu cua mang: ");
		scanner = new Scanner(System.in);
		n = Integer.parseInt(scanner.nextLine());
		
		SinhVien[] sv = new SinhVien[n];
		for(int i = 0; i < n ; i++) {
			System.out.print("Nhap vao sv thu: "+i);
			sv[i] = new SinhVien();
			
			System.out.println(" Nhap ho va ten: ");
			sv[i].hoten = scanner.nextLine();
			
			System.out.println(" Nhap so diem: ");
			sv[i].diem = Double.parseDouble(scanner.nextLine());
	
			if(sv[i].diem<5) {
				sv[i].hocluc = "Yeu";
			}else if(sv[i].diem>=5 && sv[i].diem<6.5) {
				sv[i].hocluc = "Trung binh";
			}else if(sv[i].diem>=6.5 && sv[i].diem<7.5) {
				sv[i].hocluc = "Kha";
			}else if(sv[i].diem>=7.5 && sv[i].diem<9) {
				sv[i].hocluc = "Gioi";
			}else {
				sv[i].hocluc = "Xuat xac";
			}
		}
		System.out.println("Danh sach sinh vien vua nhap:");
		for(int i = 0; i < sv.length;i++) {
			System.out.println("Thu tu so hoc sinh: "+i);
			System.out.println(" Ho ten: "+sv[i].hoten + "\n Diem: "+sv[i].diem + "\n Hoc luc: "+sv[i].hocluc);
		}
	}
}
