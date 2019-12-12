package lab3;

import java.util.Scanner;

class	listSinhVien{
	int id;
	String name;
	int age;
	String address;
	double gpa;
	public listSinhVien() {
		
	}
	public listSinhVien(int id, String name, int age, String address, double gpa) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.address = address;
		this.gpa = gpa;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public double getGpa() {
		return gpa;
	}
	public void setGpa(double gpa) {
		this.gpa = gpa;
	}
}
public class menu {
	public static int n , x;
	public static int size;
	public static final int MAX_LENGTH=100;
	public static void main(String[] args) {
		quanliSV();
		while(true) {
			Scanner scanner = new Scanner(System.in);
			System.out.println("-----------------MENU---------------");
			System.out.println("--1. Them Sinh Vien-----------------");
			System.out.println("--2. Cap Nhat Thong Tin Sinh Vien---");
			System.out.println("--3. Xoa Sinh Vien Theo ID----------");
			System.out.println("--4. Sap Xep Sinh Vien Theo Ten-----");
			System.out.println("--5. Hien Thi Danh Sach Sinh Vien-----");
			System.out.println("--0. End----------------------------");
			int choose = Integer.parseInt(scanner.nextLine());
			switch(choose) {
			case 0:
				exit();
				break;
			case 1:
				themSV();
				break;
			case 2:
				capNhatSV();
				break;
			case 3:
				xoaSV();
				break;
			case 4:
				xapSepSV();
				break;
			case 5:
				showSV();
				break;
			default:
				break;
			
			}
		}
	}
	public static void quanliSV() {
		listSinhVien[] sv = new listSinhVien[MAX_LENGTH];
		sv[size] = new listSinhVien(1,"huy",18,"VietNam", 8);
		sv[size++] = new listSinhVien(2,"huy2",10,"VietNam", 7);
		sv[size++] = new listSinhVien(3,"huy3",5,"VietNam", 4);
		sv[size++] = new listSinhVien(4,"huy4",80,"VietNam", 5);
		sv[size++] = new listSinhVien(5,"huy5",35,"VietNam", 9);
		sv[size++] = new listSinhVien(6,"huy6",35,"VietNam", 1);
	
		
		
	}
	
	public static void themSV() {
		Scanner scanner = new Scanner(System.in);
		listSinhVien[] sv = new listSinhVien[MAX_LENGTH];
		
		System.out.print("Nhap id sinh vien:");
		int maSv = Integer.parseInt(scanner.nextLine());
		
		System.out.print("Nhap ten sinh vien:");
		String tenSV = scanner.nextLine();
		
		System.out.print("Nhap tuoi sinh vien:");
		int tuoiSV = Integer.parseInt(scanner.nextLine());
		
		System.out.print("Nhap dia chi sinh vien:");
		String diaChi = scanner.nextLine();
		
		System.out.print("Nhap diem trung binh sinh vien:");
		double diemTB = Double.parseDouble(scanner.nextLine());
		
		sv[size++] = new listSinhVien(maSv,tenSV,tuoiSV,diaChi,diemTB);

	}
	
	public static void capNhatSV() {
		
	}
	
	public static void xoaSV() {
		
	}
	
	public static void xapSepSV() {
	
	}
	
	public static void showSV() {
		listSinhVien[] sv = new listSinhVien[MAX_LENGTH];
		for(int i = 0; i< 6; i++ ) {
				System.out.print(sv[i].id);
		
			}
	}
	
	public static void exit() {
		System.exit(0);
	}
}
