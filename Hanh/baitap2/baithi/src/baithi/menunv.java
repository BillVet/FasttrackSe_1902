package baithi;

import java.util.ArrayList;
import java.util.Scanner;

public  class menunv {
	public Scanner scanner = new Scanner(System.in);
	nhanvien nv;
	ArrayList<nhanvien> Nv = new ArrayList<nhanvien>();
	public void NV() {
		do {
			System.out.println(">> menu <<");
			System.out.println(">> 1.nhan vien hanh chinh <<");
			System.out.println(">> 2. nhan vien tiep thi  <<");
			System.out.println(">> 3. truong phong  <<");
			
			int  n = scanner.nextInt();
			switch (n) {

			case 1: 
				hanhchinh();

				break;
			case 2:
				tiepthi();
				break;
			case 3:
				c();
				break;
			default:
				break;
			}
		}
		while(true);
	}
	private void c() {
		// TODO Auto-generated method stub
		for(nhanvien nv:Nv) {
			nv.nhap();
			nv.xuat();
		}
	}
	public void hanhchinh() { 
		System.out.print("so nhan vien:  ");
		int a= scanner.nextInt();
		for(int i =0 ; i<a;i++) {

			nv.nhap();
			nv.xuat();
			Nv.add(nv);
		}		
	}	public void tiepthi() {
		for(nhanvien nv:Nv) {
			nv.nhap();
			nv.xuat();
		}
		
		}
	}


