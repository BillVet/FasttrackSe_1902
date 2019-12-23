package bttl;

import java.util.Scanner;

public class NhanVien {

	private String hoTen;
	private String email;
	private String sdt;
	private int cmnd;
	
	public NhanVien() {
		super();
	}
	
	public NhanVien(String hoTen, String email, String sdt, int cmnd) {
		super();
		this.hoTen = hoTen;
		this.email = email;
		this.sdt = sdt;
		this.cmnd = cmnd;
	}
	
	public String getHoTen() {
		return hoTen;
	}

	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}
	
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getSdt() {
		return sdt;
	}
	
	public void setSdt(String sdt) {
		this.sdt = sdt;
	}
	
	public int getCmnd() {
		return cmnd;
	}
	
	public void setCmnd(int cmnd) {
		this.cmnd = cmnd;
	}
	
	Scanner scanner = new Scanner(System.in);
	public void nhap() {
		System.out.println("Nhap ho va ten: ");
		hoTen = scanner.nextLine();
		System.out.println("Nhap email: ");
		email = scanner.nextLine();
		System.out.println("Nhap sdt: ");
		sdt = scanner.nextLine();
		System.out.println("Nhap so cmnd: ");
		cmnd = scanner.nextInt();
	}
	
	public String toString() {
        return hoTen + "-" + email + "-" + sdt + "-" + cmnd;
    }
}
