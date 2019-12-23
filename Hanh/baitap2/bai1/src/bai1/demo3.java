package bai1;

import java.util.Scanner;

public class demo3 {
	private	String tensp ;
	private double dongia;
	private double giamgia;
	Scanner scanner=new Scanner(System.in);
	
	
	public demo3() {
		
	}
	
	public demo3(String tensp, double dongia, double giamgia) {
		super();
		this.tensp = tensp;
		this.dongia = dongia;
		this.giamgia = giamgia;
	}
	
	
	public demo3(String tensp, double dongia) {
		this(tensp,dongia,0);
	}

	public void input() {
		System.out.println("nhap ten sp");
		tensp= scanner.nextLine();
		System.out.println("nhap don gia");
		dongia= scanner.nextDouble();
		System.out.println("sp giam gia");
		giamgia = scanner.nextDouble();
		
	}
	
	public void input1() {
		System.out.println("nhap ten sp");
		tensp= scanner.nextLine();
		System.out.println("nhap don gia");
		dongia= scanner.nextDouble();
		4
		
	}
	
	public void output() { 
		System.out.println(tensp);
		System.out.println(dongia);
		System.out.println(giamgia);
	}
	
	
	
	public void getThueNhapKhau() {
		double b;
		b = ( dongia * 10)/100;
		System.out.println(b);
	}
}
