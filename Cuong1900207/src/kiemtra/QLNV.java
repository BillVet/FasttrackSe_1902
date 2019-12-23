package kiemtra;

import java.util.ArrayList;
import java.util.Scanner;

public class QLNV {
	
	ArrayList<nhanvien> list = new ArrayList<nhanvien>();
	Scanner scanner = new Scanner(System.in);
	
	public void nhap() {
		System.out.println("1. Nhâp vào nhân viên hành chính");
		System.out.println("2. Nhâp vào nhân viên tiếp thị");
		System.out.println("3. Nhâp vào trưởng phòng");
		int choose;
		choose = Integer.parseInt(scanner.nextLine());
		switch (choose) {
		case 1:
			nhapNhanVienHC();
			break;
		case 2:
			nhapNhanVienTiepThi();
			break;
		case 3:
			truongPhong();
			break;
		default:
			break;
		}
	}
	
	public void nhapNhanVienHC() {
		int n;
		System.out.println("Nhập số nhân viên hành chính cần thêm");
		n = Integer.parseInt(scanner.nextLine());
		for(int i=0; i<n; i++) {
			System.out.println("Nhập mã nhân viên:");
			String maNhanVien = scanner.nextLine();
			System.out.println("Nhập họ và tên nhân viên:");
			String hoTen = scanner.nextLine();
			System.out.println("Nhập lương nhân viên:");
			Double luong = Double.parseDouble(scanner.nextLine());
			System.out.println("---------------------");
			Double tongThuNhap = luong;
			nhanvien qlnv = new nhanvien(maNhanVien, hoTen, luong, tongThuNhap);
			list.add(qlnv);
		}
	}
	
	public void nhapNhanVienTiepThi(){
		int n;
		System.out.println("Nhập số nhân viên tiếp thị cần thêm");
		n = Integer.parseInt(scanner.nextLine());
		for(int i=0; i<n; i++) {
			System.out.println("Nhập mã nhân viên:");
			String maNhanVien = scanner.nextLine();
			System.out.println("Nhập họ và tên nhân viên:");
			String hoTen = scanner.nextLine();
			System.out.println("Nhập lương nhân viên:");
			Double luong = Double.parseDouble(scanner.nextLine());
			System.out.println("Nhập doanh số bán hàng:");
			Double doanhSo = Double.parseDouble(scanner.nextLine());
			System.out.println("Nhập hoa hồng của nhân viên(Theo %):");
			Double hoaHong = Double.parseDouble(scanner.nextLine());
			System.out.println("---------------------");
			Double tongThuNhap = luong + ((doanhSo * hoaHong)/100);
			nhanvien qlnv = new NvTiepThi(maNhanVien, hoTen, luong, tongThuNhap, doanhSo, hoaHong);
			list.add(qlnv);
		}
	}
	
	public void truongPhong(){
		int n;
		System.out.println("Nhập số nhân viên cần thêm");
		n = Integer.parseInt(scanner.nextLine());
		for(int i=0; i<n; i++) {
			System.out.println("Nhập mã nhân viên:");
			String maNhanVien = scanner.nextLine();
			System.out.println("Nhập họ và tên nhân viên:");
			String hoTen = scanner.nextLine();
			System.out.println("Nhập lương nhân viên:");
			Double luong = Double.parseDouble(scanner.nextLine());
			System.out.println("Nhập lương trách nhiệm:");
			Double luongTrachNhiem = Double.parseDouble(scanner.nextLine());
			System.out.println("---------------------");
			
			
			Double tongThuNhap = luong + luongTrachNhiem;
			nhanvien qlnv = new truongphong(maNhanVien, hoTen, luong, tongThuNhap, luongTrachNhiem);
			list.add(qlnv);
		}
	}
	
	public void xuat() {
		for(int i =0; i<list.size();i++) {
			String maNhanVien = list.get(i).maNhanVien;
			String hoTen = list.get(i).hoTen;
			Double luong = list.get(i).luong;
			Double tongThuNhap = list.get(i).tongThuNhap;
			System.out.println("Mã nhân viên là:"+maNhanVien);
			System.out.println("Họ và tên nhân viên là:"+hoTen);
			System.out.println("Lương nhân viên là:"+luong);
			System.out.println("Tổng thu nhập của nhân viên là:"+tongThuNhap);
			System.out.println("---------------------");
		}
	}
	public void timNv() {
		String maNV = null;
		System.out.println("Nhập mã nhân viên cần tìm:");
		maNV = scanner.nextLine();
		System.out.println("Thông tin nhân viên:");
		for(int i=0; i<list.size();i++) {
			if(maNV.equalsIgnoreCase(list.get(i).maNhanVien)) {
				String maNhanVien = list.get(i).maNhanVien;
				String hoTen = list.get(i).hoTen;
				Double luong = list.get(i).luong;
				Double tongThuNhap = list.get(i).tongThuNhap;
				System.out.println("Mã nhân viên là:"+maNhanVien);
				System.out.println("Họ và tên nhân viên là:"+hoTen);
				System.out.println("Lương nhân viên là:"+luong);
				System.out.println("Tổng thu nhập của nhân viên là:"+tongThuNhap);
				System.out.println("---------------------");
			}
		}
	}
	
	public void xoaNV() {
		String maNV=null;
		System.out.println("Nhập mã NV cần xóa:");
		maNV = scanner.nextLine();
		for(int i =0; i<list.size();i++) {
			if(maNV.equalsIgnoreCase(list.get(i).maNhanVien)) {
				list.remove(i);
				System.out.println("Đã xóa thành công nhân viên MS:"+maNV);
			}
		}
	}
	
	public void menu() {
		System.out.println("--------Menu-------");
		System.out.println("1. Nhập nhân viên:");
		System.out.println("2. Xuất nhân viên:");
		System.out.println("3. Tìm nhân viên theo mã NV:");
		System.out.println("4. Xóa nhân viên theo mã NV:");
		
		int chon;
		chon = Integer.parseInt(scanner.nextLine());
		switch (chon) {
		case 1:
			nhap();
			break;
		case 2:
			xuat();
		case 3:
			timNv();
			break;
		case 4:
			xoaNV();
			break;
		default:
			break;
		}
		
	}
}
