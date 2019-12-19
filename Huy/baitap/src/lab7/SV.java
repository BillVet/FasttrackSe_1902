package lab7;

import java.util.Scanner;

public class SV {
	public int id;
	public String name;
	public int age;
	public String address;
	public double gpa;
	Scanner scanner = new Scanner(System.in);
	
	public void nhap() {
		System.out.println("Nhap id sinh vien: ");
		this.id= scanner.nextInt();
		System.out.println("Nhap ten sinh vien:b");
		this.name= scanner.nextLine();
		System.out.println("Nhap tuoi sinh vien: ");
		this.age= scanner.nextInt();
		System.out.println("Nhap dia chi sinh vien: ");
		this.id= scanner.nextInt();
		System.out.println("Nhap dien trung binh cua sinh vien: ");
		this.gpa= scanner.nextDouble();
	}
}
