package bai2;

import java.util.Scanner;

public class BaoVe extends NhanVien {
	Scanner scanner = new Scanner(System.in);
	public String caTruc;
	public String getCaTruc() {
		return caTruc;
	}

	public void setCaTruc(String caTruc) {
		this.caTruc = caTruc;
	}

	public BaoVe(String caTruc) {
		super();
		this.caTruc = caTruc;
	}

	public BaoVe() {
		super();
		// TODO Auto-generated constructor stub
	}

	public BaoVe(Scanner scanner, String hoTen, String tenTuoi, double luong, int namSinh, int tuoi, String viTri) {
		super(scanner, hoTen, tenTuoi, luong, namSinh, tuoi, viTri);
		// TODO Auto-generated constructor stub
	}

	public void nhap() {
		super.nhap();
		System.out.println("Nhập ca trực: ");
		this.caTruc = scanner.nextLine();
		
		this.ViTri = "Bao Ve";
	}
	public void xuat() {
		super.xuat();
		System.out.println("Ca trực: "+caTruc);
	}
}
