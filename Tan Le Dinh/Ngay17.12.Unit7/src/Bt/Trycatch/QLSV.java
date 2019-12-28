package Bt.Trycatch;

import java.util.Scanner;

public class QLSV {
	String id;
	String name;
	double age;
	String address;
	double gpa;
	
	public void menu() {
		while(true) {
			System.out.println("---------------------------------------------");
			System.out.println("-1.Khach Hang");
			System.out.println("-2.Bien Lai");
			System.out.println("-3.Ket thuc");
			System.out.println("---------------------------------------------");
			
			System.out.println("Lua chon menu :");
			Scanner s = null;
			String chon = s.nextLine();
			
			switch (chon) {
			case "1":
				SV sV = new SV();
				System.out.println("Nhập id sinh viên: ");
				id = s.nextLine();
				do {
					System.out.println("Nhập tên sinh viên: ");
					name = s.nextLine();
					
					try {
						if ("".equals(name)) {
							throw new Exception("Name không được rỗng");
						}
						if (name.matches("[A-Z][a-z]")== true) {
							throw new Exception("Name phải là chữ");
						}
							
					} catch (Exception) {
						
					}
				}
				break;
			case "2":
				
				break;
			case "3":
				System.out.println("Tam biet");
				s.close();
				System.exit(0);
				break;
			default:
				System.out.println("Menu khong ton tai");
				break;
			}
		}
	}
}
