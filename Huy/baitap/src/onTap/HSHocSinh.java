package onTap;

import java.util.Scanner;

public class HSHocSinh extends Nguoi{

	public String lop, khoaHoc;
	public int ki;
	public HSHocSinh() {
		super();
		
	}
	
	
	
	void nhap() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhập tên học sinh: ");
		this.name = scanner.nextLine();
		
		System.out.println("Nhập tuổi của học sinh: ");
		this.age = Integer.parseInt(scanner.nextLine());
		
		System.out.println("Nhập địa chỉ  hocsinh: ");
		this.address = scanner.nextLine();
		
		System.out.println("Nhập tên khóa học: ");
		this.khoaHoc = scanner.nextLine();
		
		System.out.println("Nhập lớp: ");
		this.lop = scanner.nextLine();
		
		System.out.println("Nhập học kì: ");
		this.ki = Integer.parseInt(scanner.nextLine());
		
	}
	void xuat(){
		System.out.println("Tên học sinh     :"+this.name);
		System.out.println("Tuổi học sinh    :"+this.age);
		System.out.println("Địa chỉ học sinh :"+this.address);
		System.out.println("Ten khóa học     :"+this.khoaHoc);
		System.out.println("Lớp              :"+this.lop);
		System.out.println("Học Kì           :"+this.ki);
		System.out.println(".............................");
	}
}
