package lab5;

import java.util.Scanner;

public class Nguoi {
	public String hoTen;
	public int ngaySinh;
	public String queQuan;
	
	public Nguoi() {
		super();
	}
	
	public Nguoi(String hoTen, int ngaySinh, String queQuan) {
		super();
		this.hoTen = hoTen;
		this.ngaySinh = ngaySinh;
		this.queQuan = queQuan;
	}
	
	public String getQueQuan() {
		return queQuan;
	}
	void nhap() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhap ho ten");
		hoTen = scanner.nextLine();
		System.out.println("Nhap ngay sinh");
		ngaySinh = scanner.nextInt();
		System.out.println("Nhap que quan");
		queQuan = scanner.nextLine();				
	}
}
