package packageclass;

import java.util.Scanner;

public class Bai4 {
	public static void main(String[] args) {
		menu();
		int a=2;
		Scanner s = new Scanner(System.in);
//		a = s.nextInt();
		switch (a) {
		case 1: {PhuongTrinhBatMot();
				break;}
		case 2: {PhuongTrinhBatHai();
				break;}
		case 3: {TinhTienDien();
				 break;}
		case 4: {
		 		break;}
		}
	}
	public static void menu() {
		System.out.println("----Menu-----");
		System.out.println("1. Giải phương trình bật nhất");
		System.out.println("2. Giải phương trình bật hai");
		System.out.println("3. Tính tiền điện");
		System.out.println("4. Kết thúc");
		
	}
	public static void PhuongTrinhBatMot() {
		Scanner s = new Scanner(System.in);
		double a;
		double b;
		double x;
		System.out.println("Nhập a");
		a = s.nextInt();
		System.out.println("Nhập b");
		b = s.nextInt();
		if (a==0) {
			if (b==0) {
				System.out.println("vô số nghiệm");
			}
			else {
				System.out.println("vô nghiệm");
			}
		} else {
			x =-b/a;
			System.out.println("Nhiệm x: " + x);
		}
		
	}
	public static void PhuongTrinhBatHai() {
		Scanner s= new Scanner(System.in);
		double a;
		double b;
		double c;
		double d;
		double x1;
		double x2;
		System.out.println("Nhập a: ");
		a = s.nextInt();
		System.out.println("Nhập b: ");
		b = s.nextInt();
		System.out.println("Nhập c: ");
		c = s.nextInt();
		if (a==0) {
			if (b==0) {
			if (c==0) {
				System.out.println("Phương trình vô số nghiệm");
			} else {
				System.out.println("Phương trình vô nghiệm");
			}
			} else {
				x1 = -c/b;
				System.out.println("Phương trình có nghiệm: " + x1);
			}
		} else {
			d = Math.pow(b,2)-4*a*c;
			if (d<0) {
				System.out.println("Phương trình vô nghiệm");
			} else if (d==0) {
				x1 = -b/(2*a);
				System.out.println("Phương trình có nghiệm kép: " + x1);
			} else {
				x1 = (-b+Math.sqrt(d))/ 2*a;
				x2 = (-b-Math.sqrt(d))/ 2*a;
				System.out.println("Phương trình có nghiệm x1: " + x1);
				System.out.println("Phương trình có nghiệm x2: " + x2);
			}
		}
	}
	public static void TinhTienDien() {
		Scanner s = new Scanner(System.in);
		int a;
		int b;
		int c;
		int d;
		System.out.println("Nhập số cũ");
		a = s.nextInt();
		System.out.println("Nhập số mới");
		b = s.nextInt();
		c = b - a;
		if (c < 50) {
			d = c*100;
			System.out.println("Tiền cần trả: " + d);
		} else {
			d = (c-50)*1200 + 50*1000;
			System.out.println("Tiền cần trả: " + d);
		}
		
	}
}
