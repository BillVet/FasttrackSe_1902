package bt;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

import bt.SinhVien;

public class QuanlySV extends SinhVien {
	public static ArrayList<QuanlySV> qlsv = new ArrayList<QuanlySV>();

	private Scanner scanner = new Scanner(System.in);
	public QuanlySV(String hoTen) {
		super(hoTen);
	}
	public void menu() {
		while(true) {
			System.out.println("------------------$-MENU-$-------------------");
			System.out.println("-1.Nhập danh sách họ và tên");
			System.out.println("-2.Xuất danh sách vừa nhập");
			System.out.println("-3.Xuất danh sách ngẫu nhiên");
			System.out.println("-4.Sắp xếp giảm dần và xuất danh sách");
			System.out.println("-5.Tìm và xóa họ tên nhập từ bàn phím");
			System.out.println("-6.Kết thúc");
			System.out.println("---------------------------------------------");
			
			System.out.println("Lua chon menu :");
			String chon = scanner.nextLine();
			
			switch (chon) {
			case "1":
				nhap();
				break;
			case "2":
				xuat();
				break;
			case "3":
				ngaunhien();
				break;
			case "4":
				sapxep();
				break;
			case "5":
				xoa();
				break;
			case "6":
				System.out.println("Tam biet");
				scanner.close();
				System.exit(0);
				break;
			default:
				System.out.println("Menu khong ton tai");
				break;
			}
		}
	}
	public void nhap() {
		
		System.out.println("Nhap ho ten sinh vien: ");
		String hoTen = scanner.nextLine();
		
		QuanlySV sv = new QuanlySV(hoTen);
		
		qlsv.add(sv);
	}
	public void xuat() {
		for (int i=0;i<qlsv.size();i++) {
			System.out.println("===============");
			String hoten =  qlsv.get(i).hoTen;
			System.out.println("Họ tên: " + hoten);		
		}
	}
	public void ngaunhien() {
		Random rd = new Random();
		for(int i=0; i< qlsv.size();i++) {
			
			int number1 = rd.nextInt(qlsv.size());
		    String ten = qlsv.get(number1).hoTen;
		    System.out.println("Họ tên: " + ten);
		}
		
	}
	public void sapxep() {
		
	}
	public void xoa() {
		String nhapten;
		System.out.println("Nhập vào tên muốn xóa: ");
		nhapten = scanner.nextLine();
		int check = 0;
		int giaTri = 0;
		for (int i=0;i<qlsv.size();i++) {
			String ten=qlsv.get(i).hoTen;
			if(nhapten.equals(ten)) {
				check = 1;
				giaTri = i;
			} else {
				
			} 	
		}
		if (check==1) {
			qlsv.remove(giaTri);
			xuat();
			
		} else {
			System.out.println("Không có tên trong danh sách");
		}
	}
}
