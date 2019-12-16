package Bai3;

import java.util.Scanner;

public class SinhVienIT extends SinhVien{
	double diemJava;
	double diemCss;
	double diemHTML;
	double diemTB;
	public double getDiemJava() {
		return this.diemJava;
	}
	public double getDiemCss() {
		return this.diemCss;
	}
	public double getDiemHTML() {
		return this.diemHTML;
	}
	Scanner s = new Scanner(System.in);
	@Override
	public void diem() {
		System.out.println("Nhap diem java");
		diemJava = Double.parseDouble(s.nextLine());
		System.out.println("Nhap diem Css");
		diemCss = Double.parseDouble(s.nextLine());
		System.out.println("Nhap diem Html");
		diemHTML = Double.parseDouble(s.nextLine());
		diemTB = (diemJava + diemCss + diemHTML)/3;
	}
	@Override
	void xeploai() {
		System.out.println("Diem java"+ getDiemJava());
		System.out.println("Diem Css"+ getDiemCss());
		System.out.println("Diem Html"+ getDiemHTML());
		System.out.println("Diem trung binh"+ diemTB);
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
