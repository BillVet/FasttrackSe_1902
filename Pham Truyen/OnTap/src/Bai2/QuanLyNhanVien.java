package Bai2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class QuanLyNhanVien {

	Scanner sc = new Scanner(System.in);
	
	public void menu() {
		while(true) {
			System.out.println("-----------QUAN LY NHAN VIEN------------");
			System.out.println("1.Nhap du lieu                          ");
			System.out.println("2.Xuat du lieu                          ");
			System.out.println("3.So luong nhan vien quan ly            ");
			System.out.println("4.Danh sach bao ve co ca truc sang      ");
			System.out.println("5.Xoa thong tin quan ly theo ten        ");
			System.out.println("6.Tinh tong luong cua nhan vien quan ly ");
			System.out.println("7.Sap xep danh sach nhan vien bao ve    ");
			System.out.println("0.Ket thuc!                             ");
			
			System.out.println("------Lua chon menu------");
			String chon = sc.nextLine();
			
			switch (chon) {
			case "1":
				nhap();
				break;
			case "2":
				xuat();
				break;
			case "3":
				slNvQl();
				break;
			case "4":
				dsBvCaSang();
				break;
			case "5":
				xoaQuanLy();
				break;
			case "6":
				luongQuanLy();
				break;
			case "7":
				sxDsBv();
				break;
			case "0":
				sc.close();
				System.exit(0);
				break;

			default:
				break;
			}
		}
	}
	
	NhanVien nhanvien;
	int n;
	ArrayList<NhanVien> nv = new ArrayList<NhanVien>();

	private void nhap() {
		System.out.println("Nhap so luong nhan vien: ");
		n = Integer.parseInt(sc.nextLine());
		
		System.out.println("Chon nhan vien: ");
		System.out.println("1.Quan ly");
		System.out.println("2.Bao ve");
		int loai = sc.nextInt();
		
		if(loai == 1) {
			nhanvien = new QuanLy();
			nhanvien.nhap();
			nv.add(nhanvien);
		}else {
			nhanvien = new BaoVe();
			nhanvien.nhap();
			nv.add(nhanvien);
		}
	
	}

	private void xuat() {
		nhanvien.xuat();
	}

	@SuppressWarnings("unlikely-arg-type")
	private void slNvQl() {
		int dem = 0;
		for(int i = 0; i < nv.size(); i++) {
			if(nv.get(i).equals("Quan ly")) {
				dem++;
			}
		}
		System.out.println("So luong nhan vien quan ly la: "+dem);
	}

	@SuppressWarnings("unlikely-arg-type")
	private void dsBvCaSang() {
		System.out.println("Danh sach bao ve truc ca sang: ");
		for(int i=0; i < nv.size(); i++) {
			if(nv.get(i).equals("Sang")) {
				nv.get(i).xuat();
			}
		}
	}

	@SuppressWarnings("unlikely-arg-type")
	private void xoaQuanLy() {
		System.out.println("Nhap ten quan ly can xoa: ");
		for(int i = 0; i < nv.size(); i++) {
			String ten = sc.nextLine();
			if(nv.get(i).equals(ten)){
				nv.remove(i);
			}
		}
	}

	@SuppressWarnings("unlikely-arg-type")
	private void luongQuanLy() {
		int dem=0;
		for(int i=0; i < nv.size(); i++) {
			if(nv.get(i).equals("Quan ly")) {
				dem+= nv.get(i).luong;
			}
		}
		System.out.println("Tong luong cua nhan vien quan ly : " + dem);
	}

	@SuppressWarnings("unlikely-arg-type")
	private void sxDsBv() {
		Collections.sort(nv, new Comparator<NhanVien>() {
			 @Override
	            public int compare(NhanVien o1, NhanVien o2) {
	                if (o1.luong < o2.luong) {
	                    return 1;
	                } else {
	                    if (o1.luong == o2.luong) {
	                        return 0;
	                    } else {
	                        return -1;
	                    }
	                }
	            }
	        });
		for (int i = 0; i < nv.size(); i++) {
			if(nv.get(i).equals("Bao ve")) {
				nv.get(i).xuat();
			}
		}
	}
}
