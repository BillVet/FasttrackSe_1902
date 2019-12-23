package class2;
import java.util.Scanner;
public class Bai1 {
	public static void main(String[] args) {
		double a;
		double b;
		double x;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Nhap a");
		a=scanner.nextDouble();
		System.out.println("Nhap b");
		b=scanner.nextDouble();
		
		if(a==0) {
			if(b==0) {
				System.out.println("Phuong trinh vo so nghiem");
			}
			else {
				System.out.println("Phuong trinh vo nghiem");
			}
		}
		else {
			x=-b/a;
			System.out.println("phuong trinh co nghiem x la:"+x);
		}
	}
}
