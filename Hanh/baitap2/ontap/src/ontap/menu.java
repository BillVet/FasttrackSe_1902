package ontap;

import java.util.ArrayList;
import java.util.Scanner;


public class menu extends LopNguoi{ 
	 public Scanner scanner = new Scanner(System.in);
	 HShocsinh hs;
	 ArrayList<HShocsinh > HS = new  ArrayList<HShocsinh >();
	public void mn(){
		do {
			System.out.println(">> menu <<");
			System.out.println(">> 1.nhap <<");
			System.out.println(">> 2.xuat <<");
			
		    int  n = scanner.nextInt();
			switch (n) {
			
			case 1: 
				input();
				
				
				break;
			case 2:
				output();
				break;
			case 3: 
				hs1();
				
				
				break;
			case 4: 
				hs2();
				
				
				break;

			default:
				break;
			}
			
		}
		while(true);
		}
	public void input() { 
		Scanner scanner = new Scanner(System.in);
		System.out.print("so hoc sinh muon nhap ");
		int a= scanner.nextInt();
		for(int i =0 ; i<a;i++) {
			 hs = new HShocsinh();
		hs.nhap();
		HS.add(hs);
		}		
	}	public void output() {
		for(HShocsinh hs:HS) {
			hs.xuat();
		}
		
	}
	public void hs1() {
		for(HShocsinh hs:HS) {
			if(hs.ngaysinh ==1985 && hs.quequan.contentEquals("Thai nguyen")) {				
			}
			hs.xuat();
		}
		
	}
	public void hs2() {
		for(HShocsinh hs:HS) {
			if(hs.lop.contentEquals("10A1")) {
				
			}
		}
	}
	
	}



		
