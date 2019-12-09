package lab2;

import java.util.Scanner;

public class bai6 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n;
		do {
		    System.out.println("Nhap vao so hoc sinh: ");
		    n = scanner.nextInt();
		} while (n < 0);    
		String hoten[] = new String[n];
		int diem[] = new int[n];
		        
		System.out.println("Nhap danh sach hoc sinh: ");
		for (int i = 0; i < n; i++) {
		    System.out.print("Nhap hoc sinh thu " + i + ": ");
		    hoten[i] = scanner.nextLine();
		}
		
		System.out.println("Nhap diem hoc sinh hoc sinh: ");
		for (int i = 0; i < n; i++) {
		    System.out.print("Nhap diem hoc sinh thu " + i + ": ");
		    diem[i] = scanner.nextInt();
		}
		
		
		int tg1;
		String tg2;
		for(int i = 0; i < (diem.length)-1; i++) {
			for( int j = 1; j < diem.length; j++) {
				if(diem[i]>diem[j]) {
					tg1 = diem[i];
					diem[i] = diem[j];
					diem[j] = tg1;
					
					tg2 = hoten[i];
					hoten[i] = hoten[j];
					hoten[j] = tg2;
				}
			}
		}
		
		for( int i=0; i < n; i++) {
			System.out.println(hoten[i]);
			System.out.println(diem[i]);
			if(diem[i] < 5) {
				System.out.println("Hoc Sinh Yeu");
			}else if(diem[i] < 6.5) {
				System.out.println("Hoc Sinh Trung Binh");
			}else if(diem[i] < 7.5) {
				System.out.println("Hoc Sinh Kha");
			}else if(diem[i] < 9) {
				System.out.println("Hoc Sinh Gioi");
			}else {
				System.out.println("Hoc Sinh Xuat Sac");
			}
			System.out.println("\n");
		}
	}
}
