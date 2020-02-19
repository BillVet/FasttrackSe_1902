package Bai2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;




public class QuanLyNhanVien {

	Scanner s = new Scanner(System.in);
	ArrayList<NhanVien> listNhanVien = new ArrayList<NhanVien>();
	int chon;
	public void menu() {
		System.out.println("=====MENU=====");
		System.out.println("1. Nhập dữ liệu QuanLy Nhan Vien");
		System.out.println("2. Xuất dữ liệu Quan Ly Nhan Vien");
		System.out.println("3. Đếm số lượng nhân viên quản lý");
		System.out.println("4. Tìm danh sách bảo vệ có ca trực sáng");
		System.out.println("5. Xóa thông tin Quản lý theo tên");
		System.out.println("6. Tính tổng lương của nhân viên là quản lý");
		System.out.println("7. Sắp xếp danh sách nhân viên bảo vệ theo lương");
		System.out.println("8. Kết thúc");
		chon = Integer.parseInt(s.nextLine());
		switch (chon) {
		case 1:
			menuNhap();
			break;
		case 2:
			xuatdulieu();
			break;
		case 3:
			demNhanVienQuanLy();
			break;
		case 4:
			baoVeTrucSang();
			break;
		case 5:
			xoaQuanLyTheoTen();
			break;
		case 6:
			tongLuongNhanVienQuanLy();
			break;	
		case 7:
			sapXepNhanVienBaoVeTheoLuong();
			break;	
		case 8:
		    s.close();
		    System.exit(0);
			break;		
		default:
			break;
		}
	}
	public void menuNhap() {
		System.out.println("=====THÊM NHÂN VIÊN=====");
		System.out.println("1. Thêm quản lý");
		System.out.println("2. Thêm bảo vệ");
		System.out.println("3. Trở về");
		chon = Integer.parseInt(s.nextLine());
		switch (chon) {
		case 1:
			themQuanLy();
			break;
		case 2:
			themBaoVe();
			break;
		case 3:
			menu();
			break;
		default:
			break;
		}
	}
	public void themQuanLy() {
		String ChucVu = "Quản Lý";
		System.out.println("Nhập tên quản lý: ");
		String ten= s.nextLine();
		System.out.println("Nhập mức lương quản lý: ");
		double luong= Double.parseDouble(s.nextLine());
		System.out.println("Nhập năm sinh quản lý: ");
		int namSinh = Integer.parseInt(s.nextLine());
		NhanVien nv = new QuanLy(ten, luong, namSinh, ChucVu);
		listNhanVien.add(nv);
	}
	public void themBaoVe() {
		String chucVu = "Bảo Vệ";
		System.out.println("Nhập tên bảo vệ: ");
		String ten= s.nextLine();
		System.out.println("Nhập mức lương bảo vệ: ");
		double luong= Double.parseDouble(s.nextLine());
		System.out.println("Nhập năm sinh bảo vệ: ");
		int namSinh = Integer.parseInt(s.nextLine());
		System.out.println("Nhập ca trực bảo vệ: ");
		String caTruc = s.nextLine();
		NhanVien nv = new BaoVe(ten, luong, namSinh, chucVu, caTruc);
		listNhanVien.add(nv);
	}
	public void xuatdulieu() {
		for(int i=0; i < listNhanVien.size(); i++) {
			listNhanVien.get(i).xuat();
			System.out.println("---------------------------------");
		}
	}
	public void demNhanVienQuanLy() {
		int dem=0;
		for(int i=0; i < listNhanVien.size(); i++) {
			if(listNhanVien.get(i).chucVu.equals("Quản Lý")) {
				dem++;
			}
		}
		System.out.println("Tổng số nhân viên quản lý là: " + dem);
	}
	public void baoVeTrucSang() {
		System.out.println("Danh sách bảo vệ có ca trực sáng là");
		for(int i=0; i < listNhanVien.size(); i++) {
			if(listNhanVien.get(i).caTruc.equalsIgnoreCase("Sáng")) {
				listNhanVien.get(i).xuat();
			}
		}
	}
	public void xoaQuanLyTheoTen() {
		System.out.println("Nhập tên quảng lý cần xóa");
		String ten = s.nextLine();
		for(int i=0; i < listNhanVien.size(); i++) {
			if(listNhanVien.get(i).tenNhanVien.equalsIgnoreCase(ten)) {
				if(listNhanVien.get(i).chucVu.equals("Quản Lý")) {
					listNhanVien.get(i).xuat();
					System.out.println("Bạn có chắc muốn xóa người này chứ? (1: Để xóa, 2: Để trở về");
					chon = Integer.parseInt(s.nextLine());
					switch (chon) {
					case 1:
						listNhanVien.remove(i);
						System.out.println("Đã xóa quản lý có tên: " + ten);
						break;
					case 2:
						break;
					}
				}
			}

		}
	}
	public void tongLuongNhanVienQuanLy() {
		int dem=0;
		for(int i=0; i < listNhanVien.size(); i++) {
			if(listNhanVien.get(i).chucVu.equals("Quản Lý")) {
				dem+= listNhanVien.get(i).luong;
			}
		}
		System.out.println("Tổng lương nhân viên quản lý là: " + dem);
	}
	public void sapXepNhanVienBaoVeTheoLuong() { 

		Collections.sort(listNhanVien, new Comparator<NhanVien>() {
			 @Override
	            public int compare(NhanVien o1, NhanVien o2) {
	                if (o1.luong < o2.luong) {
	                    return 1;
	                } else {
	                    if (o1.luong == o2.luong) {
	                        return 0;
	                    } else {
	                        return -1;
	                    }
	                }
	            }
	        });
		for (int i = 0; i < listNhanVien.size(); i++) {
			if(listNhanVien.get(i).chucVu.equals("Bảo Vệ")) {
				listNhanVien.get(i).xuat();
			}
		}
	}
}
