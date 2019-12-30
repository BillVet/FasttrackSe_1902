package bai1;

import java.util.Scanner;

public class DocGia extends ConNguoi {
	Scanner scanner= new Scanner(System.in);
	public int soSachMuon;

	public int getSoSachMuon() {
		return soSachMuon;
	}

	public void setSoSachMuon(int soSachMuon) {
		this.soSachMuon = soSachMuon;
	}

	public DocGia(String ten, String diaChi, int tuoi, int soSachMuon) {
		super(diaChi, diaChi, soSachMuon);
		this.soSachMuon = soSachMuon;
	}

	public DocGia() {
		super();
		// TODO Auto-generated constructor stub
	}

	public DocGia(String ten, String diaChi, int tuoi) {
		super(diaChi, diaChi, tuoi);
		// TODO Auto-generated constructor stub
	}
	public void nhap() {
		super.nhap();
			System.out.println("Nhập Số Sách Mượn: "+soSachMuon);
			this.soSachMuon= scanner.nextInt();
			
	}
	public void xuat() {
		super.xuat();
			System.out.println("Số Sách Đã Mượn: "+soSachMuon);
	}
}
