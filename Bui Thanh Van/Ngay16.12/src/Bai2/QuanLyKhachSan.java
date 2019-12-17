package Bai2;

import java.util.ArrayList;
import java.util.Scanner;

public class QuanLyKhachSan extends KhachSan{
	
	Scanner s = new Scanner(System.in);
	int chon;
	ArrayList<QuanLyKhachSan> listKhachHang = new ArrayList<QuanLyKhachSan>();
	ArrayList<QuanLyKhachSan> listKhachHangDaThanhToan = new ArrayList<QuanLyKhachSan>();
	public QuanLyKhachSan(String hoTen, String ngaySinh, int soCMND) {
		super(hoTen, ngaySinh, soCMND);
		// TODO Auto-generated constructor stub
	}
	
	public QuanLyKhachSan(String hoTen, String ngaySinh, int soCMND, String soPhongTro, String loaiPhongTro) {
		super(hoTen, ngaySinh, soCMND, soPhongTro, loaiPhongTro);
	}
	
	public QuanLyKhachSan(String hoTen, String ngaySinh, int soCMND, String soPhongTro, String loaiPhongTro,
			double soNgayThue, double giaPhong, double tienPhong) {
		super(hoTen, ngaySinh, soCMND, soPhongTro, loaiPhongTro, soNgayThue, giaPhong, tienPhong);
	}

	public void menu() {
		System.out.println("===Menu===");
		System.out.println("1. Thêm khách hàng");
		System.out.println("2. Hiển thị danh sách khách hàng");
		System.out.println("3. Xóa khách hàng");
		System.out.println("4. Tính tiền khách hàng");
		System.out.println("5. Xuất danh khách khách hàng đã thanh toán");
		System.out.println("6. Kết thúc");
		chon = Integer.parseInt(s.nextLine());
		switch (chon) {
		case 1:
			nhap();
			break;
		case 2:
			xuat();
			break;
		case 3:
			xoa();
			break;
		case 4:
			tinhTien();
			break;
		case 5:
			xuatKhachHangDaThanhToan();
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
		System.out.println("Nhập tên khách hàng");
		String hoTen = s.nextLine();
		System.out.println("Nhập ngày sinh khách hàng");
		String ngaySinh = s.nextLine();
		System.out.println("Nhập SCM khách hàng");
		int soCMND = Integer.parseInt(s.nextLine());
		System.out.println("Nhập số phòng");
		String soPhong = s.nextLine();
		System.out.println("Nhập loại phòng");
		String loaiPhong = s.nextLine();
		QuanLyKhachSan qlks = new QuanLyKhachSan(hoTen, ngaySinh, soCMND, soPhong, loaiPhong);
		listKhachHang.add(qlks);
	}
	public void xuat() {
		if (listKhachHang.size()>0) {
			for (int i=0;i<listKhachHang.size();i++) {
			System.out.println("===============");
			String hoten =  listKhachHang.get(i).hoTen;
			String ngaySinh =  listKhachHang.get(i).ngaySinh;
			int soCMND = listKhachHang.get(i).soCMND;
			String soPhong = listKhachHang.get(i).soPhongTro;
			String loaiPhong = listKhachHang.get(i).loaiPhongTro;
			System.out.println("Họ tên: " + hoten);
			System.out.println("Ngày sinh: " + ngaySinh);
			System.out.println("Số CMND: " + soCMND);
			System.out.println("Số phòng: " + soPhong);
			System.out.println("Loại phòng: " + loaiPhong);			
		}
		} else {
			System.out.println("Danh sách rỗng");
		}
		
	}
	public void xoa() {
		int nhapSCM;
		System.out.println("Nhập vào số cmnd khách hàng muốn xóa: ");
		nhapSCM = Integer.parseInt(s.nextLine());
		for (int i=0;i<listKhachHang.size();i++) {
			int soCM=listKhachHang.get(i).soCMND;
			if(nhapSCM == soCM) {
				listKhachHang.remove(i);
			}
		}
	}
	public void tinhTien() {
		int nhapSCM;
		System.out.println("Nhập vào số cmnd khách hàng muốn tính tiền: ");
		nhapSCM = Integer.parseInt(s.nextLine());
		for(int i=0;i<listKhachHang.size();i++) {
			if(nhapSCM == listKhachHang.get(i).soCMND) {
				System.out.println("==Tính tiền==");
				String hoten =  listKhachHang.get(i).hoTen;
				String ngaySinh =  listKhachHang.get(i).ngaySinh;
				int soCMND = listKhachHang.get(i).soCMND;
				String soPhong = listKhachHang.get(i).soPhongTro;
				String loaiPhong = listKhachHang.get(i).loaiPhongTro;
				System.out.println("Họ tên: " + hoten);
				System.out.println("Lớp: " + ngaySinh);
				System.out.println("Số CMND: " + soCMND);
				System.out.println("Số phòng: " + soPhong);	
				System.out.println("Loại phòng: " + loaiPhong);
				System.out.println("Tổng số ngày thuê: ");
				double soNgayThue = Double.parseDouble(s.nextLine());
				System.out.println("Đơn giá");
				double giaPhong = Double.parseDouble(s.nextLine());
				double tienPhong = giaPhong * soNgayThue;
				System.out.println("Tiền cần trả: " + tienPhong);
				listKhachHang.remove(i);
				QuanLyKhachSan qlksKhachSan = new QuanLyKhachSan(hoten, ngaySinh, soCMND, soPhong,loaiPhong,  soNgayThue, giaPhong, tienPhong);
				listKhachHangDaThanhToan.add(qlksKhachSan);
			}
		}
	}
	public void xuatKhachHangDaThanhToan() {
		if (listKhachHangDaThanhToan.size()>0) {
			for (int i=0;i<listKhachHangDaThanhToan.size();i++) {
			System.out.println("===============");
			String hoten =  listKhachHangDaThanhToan.get(i).hoTen;
			String ngaySinh =  listKhachHangDaThanhToan.get(i).ngaySinh;
			int soCMND = listKhachHangDaThanhToan.get(i).soCMND;
			String soPhong = listKhachHangDaThanhToan.get(i).soPhongTro;
			String loaiPhong = listKhachHangDaThanhToan.get(i).loaiPhongTro;
			double ngayThue = listKhachHangDaThanhToan.get(i).soNgayThue;
			double giaPhong = listKhachHangDaThanhToan.get(i).giaPhong;
			double thanhToan = listKhachHangDaThanhToan.get(i).tienPhong;
			System.out.println("Họ tên: " + hoten);
			System.out.println("Ngày sinh: " + ngaySinh);
			System.out.println("Số CMND: " + soCMND);
			System.out.println("Số phòng: " + soPhong);	
			System.out.println("Loại phòng: " + loaiPhong);	
			System.out.println("Số Ngày thuê: " + ngayThue);
			System.out.println("Đơn giá: " + giaPhong);
			System.out.println("Tiền thanh toán: " + thanhToan);
		}
		} else {
			System.out.println("Danh sách rỗng");
		}
		
	}
}
