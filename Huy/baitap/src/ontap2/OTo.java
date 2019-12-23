package ontap2;

import java.util.Scanner;

public class OTo extends PTGT {

	public OTo() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int soChoNgoi;
	public String kieuDongCo;
	
	void nhap() {
		Scanner scanner = new Scanner(System.in);
		super.nhap();
		System.out.println("Nhập trọng tải:");
		this.soChoNgoi =Integer.parseInt(scanner.nextLine());
		System.out.println("Nhập trọng tải:");
		this.kieuDongCo =scanner.nextLine();
	}
}
