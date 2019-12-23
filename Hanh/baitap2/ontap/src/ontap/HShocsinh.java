package ontap;

import java.util.Scanner;

public class HShocsinh extends LopNguoi{
	public String lop;
	public String khoahoc;
	public String kihoc;
	
public HShocsinh(String hoten,int ngaysinh,String quequan,String lop, String khoahoc,String kihoc) {
	super();
	this.hoten=hoten;
	this.ngaysinh=ngaysinh;
	this.quequan=quequan;
	this.lop=lop;
	this.khoahoc=khoahoc;
	this.kihoc=kihoc;
}
public HShocsinh() {
	// TODO Auto-generated constructor stub
}
public void xuat() {
	System.out.println("ho ten "+hoten);
	System.out.println("ngay sinh "+ngaysinh);
	System.out.println("que quan "+quequan);
	System.out.println(" lop "+lop);
	System.out.println("khoa hoc "+khoahoc);
	System.out.println("hoc ki "+kihoc );
	
}
public void nhap () {
	Scanner scanner = new Scanner (System.in);
	System.out.println("nhap ten:");
	hoten = scanner.nextLine();
	System.out.println("nhap ngay thang nam:");
	ngaysinh = Integer.parseInt(scanner.nextLine());
	System.out.println("que quan:");
	quequan = scanner.nextLine();
	System.out.println("nhap lop:");
	lop = scanner.nextLine();
	System.out.println("nhap khoa hoc :");
	khoahoc = scanner.nextLine();
	System.out.println("nhap ki hoc:");
	kihoc = scanner.nextLine();
}
}
