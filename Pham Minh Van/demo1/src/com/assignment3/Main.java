package com.assignment3;

import java.util.Scanner;

public class Main {
	@SuppressWarnings("unused")
	private static Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) {
		while(true) {
		System.out.println("/****************************************/");
		System.out.println("1.  Thêm sinh viên ");
		System.out.println("2.  Cập nhật thông tin sinh viên theo ID ");
		System.out.println("3.  Xóa sinh viên theo ID  ");
		System.out.println("4.  Sắp sếp sinh viên theo tên ");
		System.out.println("5.  Hiển thị danh sách sinh viên ");
		System.out.println("0.  Kết thúc ");
		System.out.println("/****************************************/");
		
		int x = scanner.nextInt();
		System.out.println("Chọn chức năng: " + x);
		switch (x) {
		case 1:
			add();
			break;
		case 2:
			update();
			break;
		case 3:
			delete();
			break;
		case 4:
			Sort();
			break;
		case 5:
	
			break;
		case 0:
			System.exit(0);
			break;
		}
		}	
}
}
