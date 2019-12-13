package Bai3;

import java.util.Scanner;

public class SinhVienBiz extends SinhVien{
	double diemMarketing;
	double diemSales;
	double diemTB;
	public double getDiemMarketing() {
		return this.diemMarketing;
	}
	public double getDiemSales() {
		return this.diemSales;
	}
	public double getDiemTB() {
		return this.diemTB;
	}
	Scanner s = new Scanner(System.in);
	@Override
	public void diem() {
		System.out.println("Nhap diem Marketing");
		diemMarketing = Double.parseDouble(s.nextLine());
		System.out.println("Nhap diem Sales");
		diemSales = Double.parseDouble(s.nextLine());
		diemTB = (diemMarketing + diemSales )/2;
		System.out.println("Diem Marketing"+ getDiemMarketing());
		System.out.println("Diem Sales"+ getDiemSales());
		System.out.println("Diem trung binh"+ diemTB);
	}
	@Override
	void xeploai() {
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
