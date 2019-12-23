package lab6;

import java.util.Scanner;

public class SV {
	String hoten;
	double tb;
	public String name;
	
	public String getHoten() {
		return hoten;
	}

	public void setHoten(String hoten) {
		this.hoten = hoten;
	}

	public double getTb() {
		return tb;
	}

	public void setTb(double tb) {
		this.tb = tb;
	}

	public void nhap() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Nhap ten sinh vien: ");
		this.hoten = scanner.nextLine();
		
		System.out.print("Nhap diem sinh vien: ");
		this.tb = Double.parseDouble(scanner.nextLine());

	}
	public void xuat() {
		System.out.println("Ho ten:" +this.hoten);
		System.out.println("Diem trung binh:" +this.tb);
		System.out.println("............");
	}

}
