package OnTap2;

import java.util.ArrayList;
import java.util.Scanner;

public class QuanLyXe {
	public ArrayList<PTGT> qlxm = new ArrayList<PTGT>();
	Scanner s = new Scanner(System.in);
	public void nhapXeMay() {
		System.out.println("Nhập Hãng Sản Xuất");
		String hangSanXuat = s.nextLine();
		System.out.println("Nhập Năm sản Xuất");
		String namSanXuat = s.nextLine();
		System.out.println("Nhập giá bán");
		String giaBan = s.nextLine();
		System.out.println("Nhập màu xe");
		String mau = s.nextLine();
		System.out.println("Nhập Công Xuất");
		String congXuat = s.nextLine();
		PTGT xm = new XeMay(hangSanXuat, namSanXuat, giaBan, mau, congXuat);
		qlxm.add(xm);
	}
	public void nhapXeOto() {
		System.out.println("Nhập Hãng Sản Xuất");
		String hangSanXuat = s.nextLine();
		System.out.println("Nhập Năm sản Xuất");
		String namSanXuat = s.nextLine();
		System.out.println("Nhập giá bán");
		String giaBan = s.nextLine();
		System.out.println("Nhập màu xe");
		String mau = s.nextLine();
		System.out.println("Nhập Số chổ ngồi");
		String soChoNgoi = s.nextLine();
		System.out.println("Nhập Kiểu động cơ");
		String kieuDongCo = s.nextLine();
		PTGT xm = new Oto(hangSanXuat, namSanXuat, giaBan, mau, soChoNgoi, kieuDongCo);
		qlxm.add(xm);
	}
	public void show() {
		for (int i=0 ; i<qlxm.size(); i++) {
			qlxm.get(i).hienThongTin();
		}
	}
}
