package bai1;

import java.util.Scanner;

public class demo1 {
	public	String tensp ;
	public double dongia;
	public double giamgia;
	Scanner scanner=new Scanner(System.in);
	public void output() { 
		System.out.println(tensp);
		System.out.println(dongia);
		System.out.println(giamgia);
	}
	public void input() {
		System.out.println("nhap ten sp");
		tensp= scanner.nextLine();
		System.out.println("nhap don gia");
		dongia= scanner.nextDouble();
		System.out.println("sp giam gia");
		giamgia = scanner.nextDouble();
		
	}
	public void getThueNhapKhau() {
		double b;
		b = ( dongia * 10)/100;
		System.out.println(b);
	}
	
}

