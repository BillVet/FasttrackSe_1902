package lab7;

import java.util.ArrayList;
import java.util.Scanner;

import lab6.SV;

public class menu {
	SV sv = new SV();
	ArrayList<SV> arr = new ArrayList<>();
	Scanner scanner = new Scanner(System.in);
	private int id;
	private String name;
	private boolean f = false;
	 
	public void menu() {
			
		do {
			
			System.out.println("MENU");
			System.out.println("1. Nhap thong tin sinh vien");
			
			System.out.println("-------------------------------------------");

			int choose = scanner.nextInt();
			
			switch(choose)
			{
			case 1:
				add();
				break;
		
			default:
				break;		
			}
			
		}while(true);
		
		
	}

	private void add() {
		System.out.println("Nhap id sinh vien: ");
		this.id= scanner.nextInt();
		
		do {
			System.out.println("Nhap ten sinh vien: ");
			this.name= scanner.nextLine();
			try {
				if("".equals(name)) {
					throw new Exception("Ten Khong Duoc de trong");
				}
				if(name.matches("[A-Z][a-z]") == true) {
					throw new Exception("Ten chi phai la ki tu chu cai va khoang trang");
				}
				break;
			}catch(Exception e){
				f=true;
				System.out.println(e.getMessage());	
			}
			
		}while(f == true);
		
	}

	
}
