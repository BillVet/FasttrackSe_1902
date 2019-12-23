package lab8;

import java.util.Scanner;

public class NhanVien {
	String hoTen;
	String email;
	int sdt;
	int cmnd;

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
	public int getSdt() {
		return sdt;
	}
	public void setSdt(int sdt) {
		this.sdt = sdt;
	}
	public int getCmnd() {
		return cmnd;
	}
	public void setCmnd(int cmnd) {
		this.cmnd = cmnd;
	}
	public NhanVien(String hoTen, String email, int sdt, int cmnd) {
		super();
		this.hoTen = hoTen;
		this.email = email;
		this.sdt = sdt;
		this.cmnd = cmnd;
	}
	public NhanVien() {
		super();
		// TODO Auto-generated constructor stub
	}
	void nhap() {
		Scanner scanner= new Scanner(System.in);
		boolean flag = false;
		do {

			System.out.println("Nhap ten: ");
			this.hoTen= scanner.nextLine();
			if(hoTen.isEmpty()==true) {
				flag=true;
				System.out.println("Khong duoc de trong");
			}else {
				if(hoTen.matches("^[a-z ]{3,30}") == false) {
					flag = true;
					System.out.println("Ten qua ngan hoac chua ki tu khong phu hop");
				}else {
					flag = false;
					this.hoTen = hoTen.trim();
					this.hoTen = hoTen.replaceAll("\\s+", " ");
					this.hoTen =hoTen.substring(0,1).toUpperCase() + hoTen.substring(1).toLowerCase();
					
					String temp[] = hoTen.split(" ");
					hoTen="";
					for (int i = 0; i < temp.length; i++) {
			            hoTen += String.valueOf(temp[i].charAt(0)).toUpperCase() + temp[i].substring(1);
			            if (i < temp.length - 1) // ? ^-^
			                hoTen += " ";
			        }
				}
			}

		}while(flag);


//		System.out.println("Nhap email: ");
//		this.email= scanner.nextLine();
//
//		System.out.println("Nhap so dien thoai: ");
//		this.sdt = scanner.nextInt();
//
//		System.out.println("Nhap so chung minh nhan dan: ");
//		this.cmnd= scanner.nextInt();

	}
	void xuat() {
		System.out.println("ten:"+this.hoTen);
//		System.out.println("ten: "+this.email);
//		System.out.println("ten: "+this.sdt);
//		System.out.println("ten: "+this.cmnd);
	}

}
