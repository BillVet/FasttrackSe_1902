package bai2;

import java.util.ArrayList;
import java.util.Scanner;

public class QuanLyNhanVien {
	Scanner scanner = new Scanner(System.in);
	NhanVien nv;
	ArrayList<NhanVien> arr = new ArrayList<>();


	public void menu() {
		do {

			System.out.println("MENU");
			System.out.println("1. Nhập thông tin nhân viên từ bàn phím");
			System.out.println("2. Xuât thông tin tất cả nhân viên");
			System.out.println("3. Đếm số lượng nhân viên quản lý");
			System.out.println("4. Tìm danh sách bảo vệ có ca trực sáng");
			System.out.println("5. tính tổng lương của tất cả 'Quản Lý' ");
			System.out.println("6. Xóa 'Quản Lý' theo tên");
			System.out.println("7. Sắp xếp nhân viên 'Bảo Vệ' theo lương");
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
				sum();
				break;
			case 6:
				delete();
				break;
			case 7:
				sortBySalary();
				break;
			case 0:
				System.exit(0);
			default:
				break;		
			}

		}while(true);
	}

	private void add() {
		System.out.println("Nhập chức vụ nhân viên cần thêm:");
		System.out.println("1. Quản Lý");
		System.out.println("#. Bảo Vệ");
		int chon = scanner.nextInt();
		if(chon==1) {
			nv = new QuanLy();
			nv.nhap();
			arr.add(nv);
		}else {
			nv = new BaoVe();
			nv.nhap();
			arr.add(nv);
		}

	}

	private void show() {
		for(NhanVien x: arr) {
			x.xuat();
			System.out.println("-.-.-.-.-.-");
		}
	}

	private void count() {
		int count = 0;
		for(NhanVien x: arr) {
			if(x.ViTri=="Quan Ly") {
				count+=1;
			}
		}
		System.out.println("Số lượng quản lý là: "+count);
	}

	private void find() {
		for(NhanVien x: arr) {
			if(x.ViTri=="Bao Ve") {
				x.xuat();
			}
		}

	}


	private void sum() {
		// TODO Auto-generated method stub

	}

	private void delete() {
		// TODO Auto-generated method stub

	}

	private void sortBySalary() {
		// TODO Auto-generated method stub

	}
}
