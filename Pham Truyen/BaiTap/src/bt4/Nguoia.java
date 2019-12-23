package bt4;

import java.util.Scanner;

public class Nguoia {

	private String hoTen;
	public String ngaySinh;
	private String soCMND;
	protected Scanner scanner;
	
	public Nguoia() {
		super();
	}
	
	public Nguoia(String hoTen, String ngaySinh, int cmnd, String soCMND) {
		super();
		this.hoTen = hoTen;
		this.ngaySinh = ngaySinh;
		this.soCMND = soCMND;
	}
	
	public String getSoCMND() {
        return soCMND;
    }
	
    public void setSoCMND(String soCMND) {
        this.soCMND = soCMND;
    }
    
    public void nhap() {
        scanner = new Scanner(System.in);
        System.out.print("Nhap ho va ten khach tro: ");
        hoTen = scanner.nextLine();
        System.out.print("Nhap ngay sinh: ");
        ngaySinh = scanner.nextLine();
        System.out.print("Nhap chung minh thu: ");
        soCMND = scanner.nextLine();
    }
    
	public void xuat() {
		System.out.println("" + hoTen + "-" + ngaySinh + "-" + soCMND);
	}
}
