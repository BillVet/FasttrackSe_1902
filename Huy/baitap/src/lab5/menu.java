package lab5;

import java.util.ArrayList;
import java.util.Scanner;

import lab6.SV;

public class menu {
	KhachHang sv = new KhachHang();
	ArrayList<KhachHang> arr = new ArrayList<>();

	Scanner scanner = new Scanner(System.in);
	public void menu1() {
		do {
			
			System.out.println("MENU");
			System.out.println("1. Nhap danh sach khach hang");
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
				them();
				break;
			case 2:
				hienthi();
				break;
			case 3:
				xoa();
				break;
			case 4: 
				tinhTien();
				break;
			case 5: 
				exit();
				break;
			default:
				break;		
			}
		}while(true);
		
		}
	
	
	public void them() {
		System.out.println("Nhap so khach hang can them:");
		int n = scanner.nextInt();
		for(int i = 0 ; i < n ; i++) {
			KhachHang kh = new KhachHang();
			kh.nhap();
			arr.add(kh);	
		}
	}
	public void hienthi() {
		for(KhachHang kh :arr) {
			kh.xuat();
		}
		System.out.println("\n");
		System.out.println("-------------------------------");
	}
	public void xoa() {
		System.out.println("Nhap cmnd cua khach hang can xoa: ");
		int tam = scanner.nextInt();
		boolean flat = false;
		
		for(KhachHang kh : arr) {
			if(kh.getHoten().equals(tam)){
				arr.remove(kh);
				flat = true;	
			}
		}
		if(flat == false) {
			System.out.println("Khong co ten can xoa");
		}
			
		
	}
	public void tinhTien() {
		System.out.println("Nhap cmnd cua khach hang can tinh tien: ");
		int tam = scanner.nextInt();
		boolean flat = false;
		for(KhachHang kh : arr) {
			if(kh.getHoten().equals(tam)){
				kh.xuat();	
			}
		}
		if(flat == false) {
			System.out.println("Khong co cmnd trung khop");
		}
	}
	public void exit() {
		System.exit(0);
	}
	
		
}
