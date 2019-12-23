package testJavaCore;

import java.util.Scanner;

public class TruongPhong extends NhanVien {
	public int luongTrachNhiem;
	public TruongPhong () {
		super();
	}

	public TruongPhong(int luongTrachNhiem) {
		super();
		this.luongTrachNhiem = luongTrachNhiem;
	}
	
	public void nhap() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhap lung trach nhiem");
		luongTrachNhiem = scanner.nextInt();
	}
}
