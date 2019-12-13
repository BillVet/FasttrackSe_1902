package btassignment4;

import java.util.Scanner;

public class QuanLyKhachHang {
	private Scanner scanner = new Scanner(System.in);
	private KhachHang[] listKhachHang = new KhachHang[10];
	private int n;
	
	private void themKhachHangVaoMang(KhachHang khachHang) {
		listKhachHang[n++] = khachHang;
	}
	
	public void menu() {
		while(true) {
			System.out.println("---------------------------------------------");
			System.out.println("-1.Khach Hang");
			System.out.println("-2.Bien Lai");
			System.out.println("-3.Ket thuc");
			System.out.println("---------------------------------------------");
			
			System.out.println("Lua chon menu :");
			String chon = scanner.nextLine();
			
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
			default:
				System.out.println("Menu khong ton tai");
				break;
			}
		}
	}
	public void nhap() {
		KhachHang khachHang = null;
		
		System.out.println("Nhap ten khach hang: ");
		String hoTen = scanner.nextLine();
		System.out.println("Nhap so nha: ");
		String soNha = scanner.nextLine();
		System.out.println("Ma So Cong To: ");
		double maSo = Double.parseDouble(scanner.nextLine());
		System.out.println("Nhap chi so cu");
		double Socu = Double.parseDouble(scanner.nextLine());
		System.out.println("Nhap chi so moi");
		double Somoi = Double.parseDouble(scanner.nextLine());
		
		khachHang = new BienLai(hoTen, soNha, maSo, Somoi, Socu);
		
		themKhachHangVaoMang(khachHang);
	}
	public void xuat() {
		if (n != 0) {
			for (int i = 0; i < n; i++) {
				System.out.println("----------------------------------");
				listKhachHang[i].xuat();
			}
		} else {
			System.out.println("Danh sach khach hang rong");
		}
	}
}
