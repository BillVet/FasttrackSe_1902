package packages;

import java.util.Scanner;

public class bt4 {
	public static void main(String[] args) {
		menu();
		Scanner s= new Scanner(System.in);
		int a;
		a = s.nextInt();
		switch (a) {
		case 1 :
			PhuongTrinhBacMot();
			break;

		case 2 :
			PhuongTrinhBacHai();
			break;
		case 3 :
			ThanhToanTienDien();
			break;
		}
	}
	public static void menu() {
		System.out.println("====Menu====");
		System.out.println("1. Phuong Trinh Bac Mot");
		System.out.println("2. Phuong Trinh Bac Hai");
		System.out.println("3. Thanh Toan Tien Dien");
	}
	public static void PhuongTrinhBacMot() {
		Scanner s= new Scanner(System.in);
		int a;
		int b;
		int x;
		System.out.println("Nhập a: ");
		a = s.nextInt();
		System.out.println("Nhập b: ");
		b = s.nextInt();
		if(a==0) {
			if(b==0) {
				System.out.println("Vô số nghiệm");
			}
			else {
				System.out.println("Vô nghiệm");
			}
		}
		else {
			x = -b/a;
			System.out.println("Nghiệm =" + x);
		}
	}
	public static void PhuongTrinhBacHai() {
		Scanner s= new Scanner(System.in);
		double a;
		double b;
		double c;
		double x;
		double x1;
		double x2;
		double d;
		System.out.println("Nhập a: ");
		a = s.nextInt();
		System.out.println("Nhập b: ");
		b = s.nextInt();
		System.out.println("Nhập c: ");
		c = s.nextInt();
		if(a==0) {
			x = -c/b;
			System.out.println("Nghiệm = "+ x);
		}
		else {
			d = b*b - 4*a*c;
			if(d<0) {
				System.out.println("Vô nghiệm");
			}
			else if(d==0){
				x = -b/2*a;
				System.out.println("Nghiệm kép = "+ x);
			}
			else {
				x1 = (-b+Math.sqrt(d))/(2*a);
				System.out.println("Nghiệm x1 = "+ x1);
				x2 = (-b-Math.sqrt(d))/(2*a);
				System.out.println("Nghiệm x2 = "+ x2);
			}
		}
	}
	public static void ThanhToanTienDien() {
		int chisomoi;
		int chisocu;
		int sodien;
		int tongtien;
		Scanner s = new Scanner(System.in);
		System.out.println("Nhập chỉ số mới: ");
		chisomoi = s.nextInt();
		System.out.println("Nhập chỉ số cũ: ");
		chisocu = s.nextInt();
		sodien = chisomoi - chisocu;
		if (sodien<101) {
			tongtien = sodien*1000;
			System.out.println("Chỉ số tiêu thụ: " + sodien);
			System.out.println("Số tiền cần trả: " + tongtien);
		} else {
			tongtien = (sodien-100)*1200 + 100*1000;
			System.out.println("Chỉ số tiêu thụ: " + sodien);
			System.out.println("Số tiền cần trả: " + tongtien);
		}
	}
}