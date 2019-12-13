package bttl;

import java.util.Scanner;

public class vd1 {

	public String fullname;
	public double luong;
	
	private Scanner scanner = new Scanner(System.in);
	
	public void input() {
		System.out.print("nhap ten: ");
		fullname = scanner.nextLine();
		
		System.out.print("nhap luong: ");
		luong = scanner.nextDouble();
	}
	
	public void output() {
		System.out.print("ten: "+fullname);
		System.out.print("luong: "+luong);
	}
}

