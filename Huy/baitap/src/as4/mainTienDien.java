package as4;

import java.util.Scanner;

public class mainTienDien {
	static int size = 0;

	private static BienLai[] bill = new BienLai[10];
	private static Scanner scanner = new Scanner(System.in);

	public static void main(String[] arge) {

		int chon;
		do{
			System.out.println("1. Add khach hang");
			System.out.println("2. List bill");
			chon = scanner.nextInt();

			switch(chon) {
			case 1:
				add();
				break;
			case 2:
				show();
				break;
			}
		}while(true);
	}


	public static void add() {

		int id = size;
		System.out.println("Nhap ten nguoi su dung dien: ");
		int name = scanner.nextInt();

		System.out.println("Nhap tuoi: ");
		int age = scanner.nextInt();
		
		System.out.println("Nhap dia chi: ");
		int address = scanner.nextInt();
		
		System.out.println("Nhap so dien thoai: ");
		int phone = scanner.nextInt();
		
		System.out.println("Nhap ma so cong to dien: ");
		int code = scanner.nextInt();
		
		System.out.println("Nhap chi so dien moi: ");
		int newNum = scanner.nextInt();
		
		System.out.println("Nhap chi so dien cu : ");
		int oldNum = scanner.nextInt();

		bill[size++] = new BienLai(id,name,age,address,phone,code,newNum,oldNum);
	}

	public static void show() {
		if (size != 0) {
			for (int i = 0; i < size; i++) {
				System.out.println("----------------------------------");
				bill[i].xuat();
			}
		} else {
			System.out.println("Danh sach sinh vien rong");
		}
	}

}