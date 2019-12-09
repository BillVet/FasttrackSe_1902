package class1;
import java.util.Scanner;
public class bai4 {
	public static void main(String[] args) {
		int a;
		int b;
		int c;
		double delta;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Nhap a");
		a = scanner.nextInt();
		System.out.println("Nhap b");
		b = scanner.nextInt();
		System.out.println("Nhap c");
		c = scanner.nextInt();
		 
		delta = Math.pow(b,2)-(4*a*c);
		
		System.out.println("Delta la: " + delta);
		System.out.println("Can Delta la: " + Math.sqrt(delta));
	}
}
