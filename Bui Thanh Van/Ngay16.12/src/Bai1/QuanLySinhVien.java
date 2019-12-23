package Bai1;

import java.nio.channels.ShutdownChannelGroupException;
import java.sql.Array;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class QuanLySinhVien extends SinhVien{
	
	int chon;
	public QuanLySinhVien(String hoTen, String lop, double diemTrungBinh) {
		super(hoTen, lop, diemTrungBinh);
	}
	
	
	Scanner s= new Scanner(System.in);
	public static ArrayList<QuanLySinhVien> listHocSinh = new ArrayList<QuanLySinhVien>();
	public void menu() {
		
		System.out.println("=====Menu=====");
		System.out.println("1.	Nhập danh sách họ và tên");
		System.out.println("2.	Xuất danh sách vừa nhập");
		System.out.println("3.	Xuất danh sách ngẫu nhiên");
		System.out.println("4.	Sắp xếp giảm dần và xuất danh sách");
		System.out.println("5.	Tìm và xóa họ tên nhập từ bàn phím");
		System.out.println("6.	Kết thúc");
		chon = Integer.parseInt(s.nextLine());
		switch (chon) {
		case 1:
			nhap();
			break;
		case 2:
			xuat();
			break;
		case 3:
			ngauNhien();
			break;
		case 4:

			break;
		case 5:
			xoa();
			break;
		case 6:
			System.out.println("Chương trình kết thúc.");
			s.close();
			System.exit(0);
			break;
		default:
			break;
		}
		
	}
	public void nhap() {
		System.out.println("Nhập tên sinh viên: ");
		String hoTen = s.nextLine();
		System.out.println("Lớp: ");
		String lop = s.nextLine();
		System.out.println("Điểm trung bình: ");
		double diemTrungBinh = Double.parseDouble(s.nextLine());
		QuanLySinhVien sv = new QuanLySinhVien(hoTen, lop, diemTrungBinh);
		listHocSinh.add(sv);
	}
	public void xuat() {
		for (int i=0;i<listHocSinh.size();i++) {
			System.out.println("===============");
			String hoten =  listHocSinh.get(i).hoTen;
			String lop =  listHocSinh.get(i).lop;
			Double diem = listHocSinh.get(i).diemTrungBinh;
			System.out.println("Họ tên: " + hoten);
			System.out.println("Lớp: " + lop);
			System.out.println("Điểm trung bình: " + diem);	
		}
	}
	public void sapXep() {
		Collections.sort(null);
		
	}
	public void ngauNhien() {
		Random rd = new Random();
		int number1 = rd.nextInt(listHocSinh.size());
		int dem;
		dem = listHocSinh.size();
		for(int i=0; i< listHocSinh.size();i++) {
				String ten = listHocSinh.get(number1).hoTen;
			    String lop = listHocSinh.get(number1).lop;
			    double diem = listHocSinh.get(number1).diemTrungBinh;
			    System.out.println("===============");
			    System.out.println("Họ tên: " + ten);
			    System.out.println("Lớp: " + lop);
			    System.out.println("Điểm trung bình: " + diem);
			    number1 ++;
			    System.out.println(number1);
			    if (number1==dem) {
			    	number1 = 0;
			    }
			    
		}
	}
	public void xoa() {
		String nhapten;
		System.out.println("Nhập vào tên muốn xóa: ");
		nhapten = s.nextLine();
		for (int i=0;i<listHocSinh.size();i++) {
			String ten=listHocSinh.get(i).hoTen;
			if(nhapten.equals(ten)) {
				listHocSinh.remove(i);
			}
		}
	}
}
