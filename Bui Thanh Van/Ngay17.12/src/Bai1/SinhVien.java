package Bai1;

import java.util.Scanner;

import javax.activity.InvalidActivityException;

public class SinhVien {
	int id;
	String name;
	String tuoi;
	String diaChi;
	double diemTrungBinh;
	Scanner s = new Scanner(System.in);
	public void nhap() throws InvalidActivityException {
		System.out.println("Nhập tên: ");
		name = s.nextLine();
		System.out.println("Nhập điểm: ");
		diemTrungBinh = Double.parseDouble(s.nextLine());
		System.out.println("Nhập tuổi: ");
		tuoi = s.nextLine();
		try {
			
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	
}
