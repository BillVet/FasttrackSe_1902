package OnTap;

import java.util.Scanner;

public class Nguoi {

	public String hoTen;
	public int ngaySinh;
	public String queQuan;
	protected Scanner scanner;
	
	public Nguoi() {
		super();
	}
	
	public Nguoi(String hoTen, int ngaySinh, String queQuan) {
		super();
		this.hoTen = hoTen;
		this.ngaySinh = ngaySinh;
		this.queQuan = queQuan;
	}
	
	public int getNgaySinh() {
        return ngaySinh;
    }
	
    public void setNgaySinh(int ngaySinh) {
        this.ngaySinh = ngaySinh;
    }
    
	public String getQueQuan() {
        return queQuan;
    }
	
    public void setQueQuan(String queQuan) {
        this.queQuan = queQuan;
    }
	
	public void nhap() {
		scanner = new Scanner(System.in);
		
		System.out.println("Nhap ho ten hoc sinh: ");
		hoTen = scanner.nextLine();
		System.out.println("Nhap ngay sinh: ");
		ngaySinh = Integer.parseInt(scanner.nextLine());
		System.out.println("Nhap que quan: ");
		queQuan = scanner.nextLine();
	}
	
	public void xuat() {
		System.out.println("Ho ten hoc sinh: " + hoTen);
		System.out.println("Ngay sinh: " + ngaySinh);
		System.out.println("Que quan: " + queQuan);
	}
}
