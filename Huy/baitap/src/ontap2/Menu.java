package ontap2;

import java.util.Scanner;

public class Menu {
	Scanner scanner = new Scanner(System.in);
	public void menu() {
		do {

			System.out.println("MENU");
			System.out.println("1. Nhập List Xe");
			System.out.println("1. Xuất List Xe");
			System.out.println("2. Tìm Phương Tiện");
			System.out.println("5. exit");
			System.out.println("-------------------------------------------");

			int choose = scanner.nextInt();

			switch(choose)
			{
			case 1:
				add();
				break;
			case 5:
				System.exit(0);
			default:
				break;		
			}

		}while(true);
	}
	public void add() {
			boolean flag = false;
			do {
				System.out.println("Chọn Loại Xe:");
				System.out.println("1. Xe Tải   2. Xe Ô Tô   3. Xe Máy");
				int loaiXe = scanner.nextInt();
				switch(loaiXe) {
				case 1:
					
				}
			}while(flag);

	}
}
