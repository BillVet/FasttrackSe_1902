package bt3;

import java.util.Scanner;

public class SV {
	String hoten;
	double tb;

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
	System.out.println("Nhap ten sinh vien: ");
	this.hoten = scanner.nextLine();

	System.out.println("Nhap diem sinh vien: ");
	this.tb = Double.parseDouble(scanner.nextLine());
	}
	
	public void xuat() {
	System.out.println("Ho ten:" +hoten);
	System.out.println("Diem trung binh:" +tb);
	}

	}

