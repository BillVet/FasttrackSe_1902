package ontap2;

import java.util.Scanner;

public class XeMay extends PTGT {

	public XeMay() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int congSuat;
	void nhap() {
		Scanner scanner = new Scanner(System.in);
		super.nhap();
		System.out.println("Nhập công xuất:");
		this.congSuat =Integer.parseInt(scanner.nextLine());
	}
	
}
