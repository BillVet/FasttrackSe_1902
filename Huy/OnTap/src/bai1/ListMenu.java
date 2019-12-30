package bai1;

import java.util.ArrayList;
import java.util.Scanner;

public class ListMenu {

	Scanner scanner= new Scanner(System.in);
	DocGia dg;
	Sach s;
	ArrayList<Sach> dsSach = new ArrayList<>();
	ArrayList<DocGia> dsDocGia = new ArrayList<>();
	public void menu() {
		do {

			System.out.println("MENU");
			System.out.println("1. Nhập dữ liệu thư viên");
			System.out.println("2. Xuât dữ liệu thư viện");
			System.out.println("3. Đếm số lượng đọc giả mượn sách");
			System.out.println("4. Hiển thị danh sách sách chưa có độc giả nào mượn");
			System.out.println("5. tìm danh sách đọc giả mượn 3 cuốn sách");
			System.out.println("6. Xóa thông tin 1 đọc giả");
			System.out.println("7. Sắp xếp danh sách đọc giả theo số lượng sách mượn");
			System.out.println("0. exit");
			System.out.println("-------------------------------------------");

			int choose = scanner.nextInt();

			switch(choose)
			{
			case 1:
				add();
				break;
			case 2:
				show();
				break;
			case 3:
				count();
				break;
			case 4:
				find();
				break;
			case 5:
				findWith();
				break;
			case 6:
				delete();
				break;
			case 7:
				sortByBook();
				break;
			case 0:
				System.exit(0);
			default:
				break;		
			}

		}while(true);
	}
	private void add() {
		// TODO Auto-generated method stub
		
	}
	private void show() {
		// TODO Auto-generated method stub
		
	}
	private void count() {
		// TODO Auto-generated method stub
		
	}
	private void find() {
		// TODO Auto-generated method stub
		
	}
	private void findWith() {
		// TODO Auto-generated method stub
		
	}
	private void delete() {
		// TODO Auto-generated method stub
		
	}
	private void sortByBook() {
		// TODO Auto-generated method stub
		
	}
}
