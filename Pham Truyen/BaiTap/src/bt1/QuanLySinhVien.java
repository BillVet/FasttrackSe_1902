package bt1;

import java.util.ArrayList;
import java.util.Scanner;

public class QuanLySinhVien {
	private static final int MAX_LENGTH = 100;
	private static Scanner scanner = new Scanner(System.in);
	private SinhVien[] sinhVienArray;
	private int size;

	public QuanLySinhVien() {
		sinhVienArray = new SinhVien[MAX_LENGTH];
	}
	
	public void giaTriMang() {
		SinhVien sv = new SinhVien(1, "Nguyen Van Anh", 20, "21 Hung Vuong", 8.9);
		sinhVienArray[size++] = sv;

 	sv = new SinhVien(2, "Nguyen Van Binh", 19, "92 Le Loi", 7.6);
		sinhVienArray[size++] = sv;

		sv = new SinhVien(3, "Ha Duy Luan", 21, "75 Ham Nghi", 5.5);
		sinhVienArray[size++] = sv;

		sv = new SinhVien(4, "Tran Van Linh", 22, "76 Ho Nguyen Trung", 9.5);
		sinhVienArray[size++] = sv;

		sv = new SinhVien(5, "Ho Ngoc Ha", 35, "Sai Gon", 7.5);
		sinhVienArray[size++] = sv;
	}
	
	public void hienThiDanhSachSinhVien() {
		if (size != 0) {
			for (int i = 0; i < size; i++) {
				hienThiSinhVien(sinhVienArray[i]);
			}
		} else {
			System.out.println("Danh sach sinh vien rong");
		}
	}
	
	public void hienThiSinhVien(SinhVien sinhVien) {
		System.out.println("id : " + sinhVien.getId() + " - name : " + sinhVien.getName() + " -  age : " + sinhVien.getAge()
				+ " - address : " + sinhVien.getAddress() + " - gpa : " + sinhVien.getGpa());
	}
	
	public void menu() {
		String chooseMenu;
		while(true) {
			System.out.println("------------------------------");
			System.out.println("1 - Them sinh vien");
			System.out.println("2 - Sua sinh vien theo id");
			System.out.println("3 - Xoa sinh vien theo id");
			System.out.println("4 - Sap xep sinh vien theo ten");
			System.out.println("5 - Hien thi danh sach sinh vien");
			System.out.println("0 - Thoat");
			System.out.println("------------------------------");

			chooseMenu = scanner.nextLine();

			switch(chooseMenu) {
				case "1" :
					themSinhVien();
					break;
				case "2" :
					break;
				case "3" : 
					break;
				case "4" :
					break;
				case "5" :
					hienThiDanhSachSinhVien();
					break;
				case "0" :
					System.exit(0);
					break;
				default :
					System.out.println("menu khong ton tai");
			}			
		}
	}
	
	public void themSinhVien() {
		int id;
		String name;
		int age;
		String address;
		double gpa;
		
		ArrayList<SinhVien> data = new ArrayList<SinhVien>();
		
		SinhVien sv = new SinhVien();
		System.out.println("Nhap ID: ");
		id = scanner.nextInt();
		System.out.println("Nhap ten: ");
		name = scanner.nextLine();
		System.out.println("Nhap tuoi: ");
		age = scanner.nextInt();
		System.out.println("Nhap dia chi: ");
		address = scanner.nextLine();
		System.out.println("Nhap diem trung binh: ");
		gpa = scanner.nextDouble();
		sv.setId(id);
		sv.setName(name);
		sv.setAge(age);
		sv.setAddress(address);
		sv.setGpa(gpa);
		data.add(sv);
	}
	
}
