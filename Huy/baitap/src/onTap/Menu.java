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
			System.out.println("1. Nhập danh sách học sinh");
			System.out.println("2. Hiển thị toàn bộ danh sách");
			System.out.println("3. Hiển thị học sinh sinh năm 1985 và ở Thái Nguyên");
			System.out.println("4. Hiển thị tất cả học sinh lớp 10A1");
			System.out.println("5. exit");
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
			case 5:
				System.exit(0);
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
