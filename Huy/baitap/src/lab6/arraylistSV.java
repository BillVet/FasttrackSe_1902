package lab6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;



public class arraylistSV {
	SV sv;
	ArrayList<SV> arr = new ArrayList<>();
	Scanner scanner = new Scanner(System.in);
	 
	public void menu() {
			
		do {
			
			System.out.println("MENU");
			System.out.println("1. Nhap danh sach ho va ten");
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
				add();
				break;
			case 2:
				show();
				break;
			case 3:
				ramdom();
				break;
			case 4: 
				sort();
				break;
			case 5: 
				search();
				break;
			case 6:
				exit();
				break;
			default:
				break;		
			}
			
		}while(true);
		
		
	}
	
	public void add() {
		System.out.println("Nhap so sinh vien can them:");
		int n = scanner.nextInt();
		for(int i = 0 ; i < n ; i++) {
			 sv = new SV();
			sv.nhap();
			arr.add(sv);	
		}
	}
	public void show() {		
		for(SV sv :arr) {
			sv.xuat();
		}
		System.out.println("\n");
		System.out.println("-------------------------------");
	}
	public  void ramdom() {
		Collections.shuffle(arr);
		show();
	}
	public  void sort() {
		Comparator<SV> compareByHoTen = (SV o1, SV o2) -> o1.getHoten().compareTo( o2.getHoten() );
		Collections.sort(arr, compareByHoTen);
		 
		Collections.reverse(arr);
		show();
	}
	public  void search() {	
		System.out.println("Nhap ten sinh vien can xoa: ");
		String name = scanner.nextLine();
		boolean flat = false;
		
		for(SV sv : arr) {
			if(sv.getHoten().equals(name)){
				arr.remove(sv);
				flat = true;
				
			}
		}
		if(flat == false) {
			System.out.println("Khong co ten can xoa");
		}
	}
	 void exit() {
		System.out.println("---Ket thuc chuong trinh-----");
		System.exit(0);;
	}
	
}
