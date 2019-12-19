package onTap;

import java.util.ArrayList;
import java.util.Scanner;

import lab6.SV;

public class Menu {
	Scanner scanner = new Scanner(System.in);
	HSHocSinh hs;
	ArrayList<HSHocSinh> arr = new ArrayList<>();

	public void menu() {

		do {

			System.out.println("MENU");
			System.out.println("1. Nhap danh sach ho va ten");
			System.out.println("2. Xuat danh sach vua nhap");
			System.out.println("3. Xuat ngau nhien danh sach vua nhap");
			System.out.println("4. Sap xep giam dan va xuat danh sach");
			System.out.println("5. Tim va xoa ho ten tu bam phim");
			System.out.println("6. exit");
			System.out.println("-------------------------------------------");

			int choose = scanner.nextInt();

			switch(choose)
			{
			case 1:
				add();
				break;
			case 2:
				show();
			case 3:
				find1();
			case 4:
				find2();
			default:
				break;		
			}

		}while(true);


	}
	public void add() {
		System.out.println("Nhap so sinh vien can them:");
		int n = scanner.nextInt();
		for(int i = 0 ; i < n ; i++) {
			hs = new HSHocSinh();
			hs.nhap();
			arr.add(hs);	
		}
	}
	public void show() {
		for(HSHocSinh hs :arr) {
			hs.xuat();
		}
		System.out.println("\n");
		System.out.println("-------------------------------");
	}
	public void find1() {
		for(HSHocSinh hs : arr) {
			if( hs.age == 1985 && hs.address.contentEquals("Thái Nguyên") ) {
				hs.xuat();
			}
		}
	}
	public void find2() {
		for(HSHocSinh hs : arr) {
			if(hs.lop.contentEquals("10A1")) {
				hs.xuat();
			}
		}
	}
	
}
