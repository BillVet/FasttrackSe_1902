package lab2;

import java.util.Scanner;

class SinhVien{
	String hoTen;
	double diem;
	String hocLuc; }

public class baitap6 {


	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int n;
		System.out.println("Nhap so Sinh Vien: ");
		n = Integer.parseInt(scanner.nextLine());
		
		SinhVien[] sv = new SinhVien[n];
		
		for (int i = 0; i < n; i++) {
			System.out.println("Nhap sinh vien thu" + i);
			sv[i] = new SinhVien();
			
			System.out.println("Ho va Ten");
			sv[i].hoTen = scanner.nextLine();
			
			System.out.println("Nhap Diem");
			sv[i].diem = Double.parseDouble(scanner.nextLine());
			
			if(sv[i].diem<5) {
				sv[i].hocLuc = "Bad";
			} else if (5<=sv[i].diem && sv[i].diem<6.5) {
				sv[i].hocLuc = "Normal";
			} else if (6.5<=sv[i].diem && sv[i].diem<7.5) {
				sv[i].hocLuc = "Great"; 
			} else if (7.5<=sv[i].diem && sv[i].diem<9) {
				sv[i].hocLuc = "Good";
			} else if (9<=sv[i].diem) {
				sv[i].hocLuc = "Perfect";
			}
		}
		
		System.out.println("Dah Sach hoc sinh vua nhap");
		for (int i = 0; i < sv.length; i++) {
			System.out.println("Thu tu hoc sinh :" +i);
			System.out.println("Sinh vien" + sv[i].hoTen+"diem"+sv[i].diem+"Hoc Luc"+sv[i].hocLuc);
		}
	}
}
