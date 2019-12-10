package lab2;

import java.util.Scanner;

public class bai5 {
	public static void main(String[] arge) {
		 Scanner scanner = new Scanner(System.in);
		 
		 System.out.println("bang cuu chuong");
		 int x = scanner.nextInt();
		 
		 for(int i = 1; i <= x; i++) {
			 System.out.printf("%d x %d = %d\n",x,i,x*i);
		 }
	}
}
