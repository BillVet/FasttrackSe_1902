package class2;
import java.util.Scanner;
public class Bai2 {
	public static void main(String[] args) {
		double a;
		double b;
		double c;
		double d;
		double x1;
		double x2;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("nhap a");
		a = scanner.nextDouble();
		System.out.println("nhap b");
		b = scanner.nextDouble();
		System.out.println("nhap c");
		c = scanner.nextDouble();
		
		if(a==0) {
			if(b==0) {
				if(c==0) {
					System.out.println("Phuong trinh vo so nghiem");
				}
				else {
					System.out.println("Phuong trinh vo nghiem");
				}
			}
			else {
				x1=-c/b;
				System.out.println("phuong trinh co nghiem x la:"+x1);
			}
		}
		else {
			d= b*b - (4*a*c);
			if(d<0) {
				System.out.println("Phuong trinh vo nghiem");
			}
			else if(d==0) {
				x1=-b/(2*a);
				System.out.println("phuong trinh co nghiem kep x ="+ x1);
			}
			else {
				x1= (-b + Math.sqrt(d))/(2*a);
				x2= (-b - Math.sqrt(d))/(2*a);
				System.out.println("phuong trinh co nghiem x1 ="+ x1);
				System.out.println("phuong trinh co nghiem x2 ="+ x2);
			}
		}
	}
}
