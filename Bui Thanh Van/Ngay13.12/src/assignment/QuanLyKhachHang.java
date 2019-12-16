package assignment;

import java.util.Scanner;

public class QuanLyKhachHang{
	Scanner nhap = new Scanner(System.in);
	public void menu() {
		while (true) {
		System.out.println("=====MENU=====");
		System.out.println("1. Nhập vào thông tin khách hàng.");
		System.out.println("2. Hiển thị biên lai đã nhập.");
		System.out.println("3. Tính tiền điện khách hàng.");
		System.out.println("4. Kết thúc chương trình.");
		int chon;
		chon = Integer.parseInt(nhap.nextLine());
		switch (chon) {
		case 1:
			nhap();
			break;
		case 2:
			xuat();
			break;
		case 3:
			tinhTien();
			break;
		case 4:
			System.out.println("Chương trình kết thúc.");
			nhap.close();
			System.exit(0);
			break;
		default:
			break;
		}
	}
		
	}
	private KhachHang[] listKhachHang = new KhachHang[10];
	KhachHang khachHang = null;
	private int size;
	private void themKhachHangVaoMang(KhachHang khachHang) {
		listKhachHang[size++] = khachHang;
	}
	
	public void nhap() {
		System.out.println("Nhập tên khách hàng: ");
		String hoTen = nhap.nextLine();
		System.out.println("Nhập địa chỉ khách hàng: ");
		String soNha = nhap.nextLine();
		System.out.println("Nhập mã công tơ khách hàng: ");
		String maSoCongTo = nhap.nextLine();
		khachHang = new BienLai(hoTen, soNha, maSoCongTo);
		themKhachHangVaoMang(khachHang);
	}
	public void xuat() {
		if ( size!=0 ) {
			for(int i=0;i<size;i++) {
				listKhachHang[i].xuat();
				System.out.println("==========================================");
			}
		} else {
			System.out.println("Không có khách hàng");
		}
	}
	
	public void tinhTien() {
		String maCongTo;
		System.out.println("Nhập vào công tơ khách hàng: ");
		maCongTo = nhap.nextLine();
		for(int i=0;i<size;i++) {
			if(maCongTo.equals(listKhachHang[i].maSoCongTo)) {
				System.out.println("Nhập vào số cũ: ");
				double soCu = Double.parseDouble(nhap.nextLine());
				System.out.println("Nhập vào số mới: ");
				double soMoi = Double.parseDouble(nhap.nextLine());
				double tienDien= (soMoi - soCu) * 750;
				System.out.println("Số tiền điện phải trả: " + tienDien);
				khachHang = new BienLai(listKhachHang[i].hoTen, listKhachHang[i].soNha, listKhachHang[i].maSoCongTo, soCu, soMoi);
				listKhachHang[i] = khachHang;
			}
		}
	}
}
