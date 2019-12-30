package Bai1;

import java.util.ArrayList;
import java.util.Scanner;

public class ThuVien {

	Scanner sc = new Scanner(System.in);
	
	public void menu() {
		while(true) {
			System.out.println("------------THU VIEN------------");
			System.out.println("1.Nhap du lieu thu vien         ");
			System.out.println("2.Xuat du lieu thu vien         ");
			System.out.println("3.So luong doc gia muon sach    ");
			System.out.println("4.Danh sach sach chua muon      ");
			System.out.println("5.Danh sach doc gia muon 3 cuon ");
			System.out.println("6.Xoa thong tin mot doc gia     ");
			System.out.println("7.Sap xep danh sach doc gia     ");
			System.out.println("8.Ket thuc!                     ");
			
			System.out.println("Lua chon menu: ");
			String chon = sc.nextLine();
			
			switch (chon) {
			case "1":
				nhap();
				break;
			case "2":
				xuat();
				break;
			case "3":
				solgMuon();
				break;
			case "4":
				dsChuaMuon();
				break;
			case "5":
				ds3Cuon();
				break;
			case "6":
				xoa();
				break;
			case "7":
				sapXep();
				break;
			case "8":
				sc.close();
				System.exit(0);
				break;

			default:
				break;
			}
		}
	}

	Sach sach;
	int n;
	ArrayList<String> s = new ArrayList<>();
	
	
	
	private void nhap() {
		// TODO Auto-generated method stub
		
	}

	private void xuat() {
		// TODO Auto-generated method stub
		
	}

	private void solgMuon() {
		// TODO Auto-generated method stub
		
	}

	private void dsChuaMuon() {
		// TODO Auto-generated method stub
		
	}

	private void ds3Cuon() {
		// TODO Auto-generated method stub
		
	}

	private void xoa() {
		// TODO Auto-generated method stub
		
	}

	private void sapXep() {
		// TODO Auto-generated method stub
		
	}

	
}
