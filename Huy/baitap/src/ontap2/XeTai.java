package ontap2;

import java.util.Scanner;

public class XeTai extends PTGT {
	
	public XeTai() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int trongTai;

	void nhap() {
		Scanner scanner = new Scanner(System.in);
		super.nhap();
		System.out.println("Nhập trọng tải:");
		this.trongTai =Integer.parseInt(scanner.nextLine());
	}
}
