package bai1;

import java.util.Scanner;

public class sanpham {
	public	String tensp ;
	public double dongia;
	Scanner scanner=new Scanner(System.in);
	public void output() { 
		System.out.println(tensp);
		System.out.println(dongia);
		}
	public void input() {
		System.out.println("nhap ten sp");
		tensp= scanner.nextLine();
		System.out.println("nhap don gia");
		dongia= scanner.nextDouble();}
}
