package OnTap;

import java.util.ArrayList;
import java.util.Scanner;

public class QuanLy {

	Scanner scanner = new Scanner(System.in);
	
	public void menu() {
		while(true) {
			System.out.println("---------------------------------");
			System.out.println("1.Nhap thong tin hoc sinh        ");
			System.out.println("2.Hien thi thong tin hoc sinh    ");
			System.out.println("3.Hien thi hoc sinh can tim      ");
			System.out.println("4.Hien thi hoc sinh lop 10A1     ");
			System.out.println("0.Ket thuc                       ");
			System.out.println("---------------------------------");
			
			System.out.println("Lua chon menu");
			String chon = scanner.nextLine();
			
			switch (chon) {
			case "1":
				nhap();
				break;
			case "2":
				xuat();
				break;
			case "3":
				tim();
				break;
			case "4":
				lop();
				break;
			case "0":
				scanner.close();
				System.exit(0);
				break;
			default:
				break;
			}
		}
	}
	
	HSHocSinh hsHocSinh;
	int n;
	ArrayList<HSHocSinh> hshs = new ArrayList<>();
	
	public void nhap() {
		System.out.println("Nhap so luong hoc sinh: ");
		n = Integer.parseInt(scanner.nextLine());
		
		for(int i = 0; i < n; i++) {
			hsHocSinh = new HSHocSinh();
			System.out.println("Nhap thong tin hoc sinh thu: " + (i+1) + " : ");
            hsHocSinh.nhap();
            hshs.add(hsHocSinh);
		}
	}
	
	public void xuat() {
		for (int i = 0; i < hshs.size(); i++) {
	        System.out.println("\nThong tin hoc sinh thu: " + (i+1) + " : ");
	        hshs.get(i).xuat();
	    }
	}
	
	public void tim() {
	    for (HSHocSinh x : hshs) {
	        if(x.ngaySinh==1985 && x.queQuan.equals("Thai Nguyen")) {
	        	x.xuat();
	        }
        }
	}
	
	public void lop() {
		for (HSHocSinh y : hshs) {
	        if(y.lop.equals("10A1")) {
	        	y.xuat();
	        }
        }
	}
}
