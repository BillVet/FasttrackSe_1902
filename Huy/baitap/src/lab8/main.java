package lab8;

import java.util.ArrayList;
import java.util.Scanner;

import lab6.SV;

public class main {
	public static void main(String[] args) {

		Scanner scanner= new Scanner(System.in);
		
		NhanVien nv;
		ArrayList<NhanVien> arr = new ArrayList<>();
		
		for(int i = 0; i < 1; i++) {
			nv = new NhanVien();
			nv.nhap();
			arr.add(nv);
		}
		for(NhanVien nv1: arr) {
			nv1.xuat();
		}
	}
}
