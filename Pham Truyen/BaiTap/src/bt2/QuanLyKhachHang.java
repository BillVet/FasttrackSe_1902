package bt2;

import java.util.Scanner;

public class QuanLyKhachHang {

	Scanner scanner = new Scanner(System.in);

	private KhachHang[] listKhachHang = new KhachHang[5];
	private int size;

	private void themKhachHangVaoMang(KhachHang khachHang) {
		listKhachHang[size++] = khachHang;
	}

	public void menu() {
	
		while(true) {
			System.out.println("---------------------------------------------");
			System.out.println("-1.Them sinh vien                       	 ");
			System.out.println("-2.Xuat thong tinh danh sach sinh vien       ");
			System.out.println("-3.Ket thuc                                  ");
			System.out.println("---------------------------------------------");

			System.out.println("Lua chon menu :");
			String chon;
			chon = scanner.nextLine();
			
			switch (chon) {
			case "1":
				nhap();
				break;
			case "2":
				xuat();
				break;
			case "3":
				System.out.println("Tam biet");
				scanner.close();
				System.exit(0);
				break;

			}
			
		}
	}
	public void nhap() {
		KhachHang khachHang = null;

		System.out.println("Nhap ho ten khach hang: ");
		String hoTen =   scanner.nextLine();
		System.out.println("Nhap dia chi khach hang: ");
		String soNha = scanner.nextLine();
		System.out.println("Nhap so cong to cua khach hang: ");
		String maSoCongTo = scanner.nextLine();
		System.out.println("Nhap chi so cu: ");
		double chiSoCu = scanner.nextDouble();
		System.out.println("Nhap chi so moi: ");
		double chiSoMoi = scanner.nextDouble();

		khachHang = new BienLai(hoTen, soNha, maSoCongTo, chiSoCu, chiSoMoi);

		themKhachHangVaoMang(khachHang);
		
	}

	public void xuat() {
		if (size != 0) {
			for (int i = 0; i < size; i++) {
				System.out.println("----------------------------------");
				listKhachHang[i].xuat();
			}
		} else {
			System.out.println("Danh sach khach hang rong");
		}
	}
}
