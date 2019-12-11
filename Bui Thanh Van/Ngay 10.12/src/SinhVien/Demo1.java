package SinhVien;

import java.util.Scanner;

public class Demo1 {
	private String hoTen;
	private double diemTB;
	Scanner s = new Scanner(System.in);
	public void nhap() {
		System.out.println("Ho tên sinh viên: ");
		hoTen = s.nextLine();
		System.out.println("Diem TB sinh viên: ");
		diemTB = Double.parseDouble(s.nextLine());
	}
	public Demo1() {}
	public Demo1(String hoTen, double diemTB) {
		super();
		this.hoTen = hoTen;
		this.diemTB = diemTB;
	}
	public Demo1(String hoTen) {
		super();
		this.hoTen = hoTen;
	}
	public void xuat() {
		System.out.println("Ho tên sinh viên: " + hoTen);
		System.out.println("Diem TB sinh viên: " + diemTB);
	}
	public void xeploai() {
		if (diemTB < 5) {
			System.out.println("Hoc sinh yếu ");
		} else if( diemTB <=5 && diemTB <6.5  ){
			System.out.println("Hoc sinh trung bình ");
		} else if( diemTB <=6.5 && diemTB <7.5  ) {
			System.out.println("Hoc sinh Khá ");
		} else if( diemTB <=7.5 && diemTB <9  ) {
			System.out.println("Hoc sinh G�?i ");
		} else {
			System.out.println("Hoc sinh Xuất sắc ");
		}
	}
}
