package bt3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Menu {
	String hoTen;
	Scanner scanner = new Scanner(System.in);
	
	public void menu() {
		while (true) {
			System.out.println("--------------------------------------");
			System.out.println("1.Nhap danh sach sinh vien            ");
			System.out.println("2.Xuat danh sach vua nhap             ");
			System.out.println("3.Xuat danh sach ngau nhien           ");
			System.out.println("4.Sap xep giam dan va xuat danh sach  ");
			System.out.println("5.Tim va xoa ho ten sinh vien         ");
			System.out.println("0.Ket thuc                            ");
			System.out.println("--------------------------------------");
			
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
				ngaunhien();
				break;
			case "4":
				sapxep();
				break;
			case "5":
				xoa();
				break;
			case "0":
				System.out.println("Ket thuc");
				scanner.close();
				System.exit(0);
				break;
			default:
				break;
			}
		}
	}
	
	ArrayList<String> sv = new ArrayList<String>();
	int n;
	protected Object fruitName;
	public void nhap() {
		System.out.print("Nhap so phan tu cua mang: ");
		scanner = new Scanner(System.in);
		n = Integer.parseInt(scanner.nextLine());
		
		for(int i = 0; i < n ; i++) {
			System.out.print(" Nhap vao sv thu: "+i);
			System.out.println("\n Nhap ho va ten sinh vien: ");
			hoTen = scanner.nextLine();
			sv.add(0, hoTen);
		}
	}
	
	public void xuat() {
		if (n != 0) {
			for (String i : sv) {
			      System.out.println("Ho va ten sinh vien: "+i);
			    }
		} else {
			System.out.println("Danh sach sinh vien rong");
		}
	}
	
	public void ngaunhien() {
		Collections.shuffle(sv);
		for (int j = n-1; j < sv.size(); j++) {
			xuat();
		}
	}
	
	public void sapxep() {
		Collections.sort(sv);
		Collections.reverse(sv);
	}

	public void xoa() {
		System.out.println("Nhap ten sinh vien can xoa: ");
		String hoTen = scanner.nextLine();

		boolean flat = false;
		for(String x : sv) {
			if(x.contentEquals(hoTen)) {
				sv.remove(x);
				flat = true;
				break;
			}
		}
		if(flat == false) {
		System.out.println("Khong co ten can xoa");
		}
	}
}
