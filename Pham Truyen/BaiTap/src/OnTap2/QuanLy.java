package OnTap2;

import java.util.ArrayList;
import java.util.Scanner;

public class QuanLy {

	Scanner scanner = new Scanner(System.in);
	
	public void menu() {
		
		while(true) {
			System.out.println("---------------------------------");
			System.out.println("1.Nhap dang ky phuong tien       ");
			System.out.println("2.Xuat thong tin                 ");
			System.out.println("3.Tim phuong tien giao thong     ");
			System.out.println("0.Ket thuc                       ");
			
			System.out.println("Lua chon menu: ");
			String chon = scanner.nextLine();
			
			switch (chon) {
			case "1":
				nhap();
				break;
			case "2":
				xuat();
				break;
			case "3":
				tim();
				break;
			case "0":
				scanner.close();
				System.exit(0);
				break;
			default:
				break;
			}
		}
	}
	
	PTGT ptgt;
	int n;
	ArrayList<PTGT> pt = new ArrayList<PTGT>();
	
	public void nhap() {
		System.out.println("Nhap so luong dang ky: ");
		n = Integer.parseInt(scanner.nextLine());
		
		System.out.println("Moi ban chon xe de nhap");
		System.out.println("1.XeTai");
		System.out.println("2.XeMay");
		System.out.println("3.Oto");
		
		String loaiXe = scanner.nextLine();
		
		PTGT ptgt = null;
		
		for(int i = 0; i < n; i++) {
			ptgt = new PTGT();
			System.out.println("Nhap thong tin dang ky thu: " + (i+1) + " : ");
			
			if("1".equals(loaiXe)) {
				XeTai xeTai = new XeTai();
				xeTai.nhap();
			}else if("2".equals(loaiXe)) {
				XeMay xeMay = new XeMay();
				xeMay.nhap();
			}else if("3".equals(loaiXe)) {
				Oto oto = new Oto();
				oto.nhap();
			}else {
				System.out.println("Ban chon sai roi!");
			}
			pt.add(ptgt);
		}
	}
	
	public void xuat() {
			ptgt.xuat();
	}
	
	public void tim() {
		
	}
}
