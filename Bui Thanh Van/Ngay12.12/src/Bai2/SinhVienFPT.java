package Bai2;

import java.util.Scanner;

public class SinhVienFPT extends SinhVien{
	Scanner s = new Scanner(System.in);
	@Override
	public void xeploai() {
		if (diem < 5) {
			System.out.println("Hoc sinh yếu ");
		} else if( diem <=5 && diem <6.5  ){
			System.out.println("Hoc sinh trung bình ");
		} else if( diem <=6.5 && diem <7.5  ) {
			System.out.println("Hoc sinh Khá ");
		} else if( diem <=7.5 && diem <9  ) {
			System.out.println("Hoc sinh G�?i ");
		} else {
			System.out.println("Hoc sinh Xuất sắc ");
		}
	}
	public void nhap() {
		System.out.println("Nhập họ tên: ");
		this.HoTen = s.nextLine();
		System.out.println("Nhập ngành: ");
		this.Nganh = s.nextLine();
		System.out.println("Nhập điểm: ");
		this.diem= Double.parseDouble(s.nextLine());
	}
	public void xuat() {
		System.out.println("Họ tên: "+getName());
		System.out.println("Ngành: "+getNganh());
		System.out.println("Điểm: "+getDiem());
	}
	public String getName() {
		return this.HoTen;
	}
	public String getNganh() {
		return this.Nganh;
	}
	public double getDiem() {
		return this.diem;
	}
}
