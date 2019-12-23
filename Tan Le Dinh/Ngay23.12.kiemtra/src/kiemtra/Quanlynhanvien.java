package kiemtra;

import java.util.ArrayList;
import java.util.Scanner;

public class Quanlynhanvien extends Nhanvien {
	public static ArrayList<Quanlynhanvien> qlnv = new ArrayList<Quanlynhanvien>();

	private Scanner s = new Scanner(System.in);
	public Quanlynhanvien(String ma, String hoTen, double luong) {
		super(ma, hoTen, luong);
	}
	
	public void menu() {
		while(true) {
			System.out.println("------------------$-MENU-$-------------------");
			System.out.println("-1.Nhập danh sách nhân viên từ bàn phím.");
			System.out.println("-2.Xuất danh sách nhân viên ra màn hình.");
			System.out.println("-3.Tìm và hiển thị nhân viên theo mã nhập từ bàn phím.");
			System.out.println("-4.Xóa nhân viên theo mã nhập từ bàn phím.");
			System.out.println("-5.Cập nhật thông tin nhân viên theo mã nhập từ bàn phím");
			System.out.println("-6.Tìm các nhân viên theo khoảng lương nhập từ bàn phím.");
			System.out.println("-7.Sắp xếp nhân viên theo họ và tên.");
			System.out.println("-8.Sắp xếp nhân viên theo thu nhập.");
			System.out.println("-9.Xuất 5 nhân viên có thu nhập cao nhất.");
			System.out.println("-10.Kết thúc");
			System.out.println("---------------------------------------------");
			
			System.out.println("Lua chon menu :");
			String chon = s.nextLine();
			
			switch (chon) {
			case "1":
				nhap();
				break;
			case "2":
				xuat();
				break;
			case "3":
				search();
				break;
			case "4":
				xoa();
				break;
			case "5":
				capnhat();
				break;
			case "6":
				timtheoluong();
				break;
			case "7":
				sapxeptheoten();
				break;
			case "8":
				sapxeptheothunhap();
				break;
			case "9":
				thunhapcaonhat();
				break;
			case "10":
				System.out.println("Tam biet");
				s.close();
				System.exit(0);
				break;
			default:
				System.out.println("Menu khong ton tai");
				break;
			}
		}
	}
	public void nhap() {
		System.out.println("Moi ban chon nhan vien de nhap: ");
		System.out.println("1.Nhan vien hanh chanh");
		System.out.println("2.Nhan vien tiep thi");
		System.out.println("3.Truong phong");
		
		String loaiNhanvien = s.nextLine();
		
		if("1".equals(loaiNhanvien)) {
			System.out.println("Nhap ma nhan vien: ");
			String ma = s.nextLine();
			System.out.println("Nhap ten nhan vien: ");
			String hoTen = s.nextLine();
			System.out.println("Nhap luong nhan vien: ");
			double luong = Double.parseDouble(s.nextLine());
			
			Quanlynhanvien nv = new Quanlynhanvien(ma, hoTen, luong);
			qlnv.add(nv);
			
		}else if ("2".equals(loaiNhanvien)) {
			System.out.println("Nhap ma nhan vien: ");
			String ma = s.nextLine();
			System.out.println("Nhap ten nhan vien: ");
			String hoTen = s.nextLine();
			System.out.println("Nhap luong nhan vien: ");
			double luong = Double.parseDouble(s.nextLine());
			System.out.println("Doanh so ban hang: ");
			double doanhso = Double.parseDouble(s.nextLine());
			System.out.println("Ti le hoa hong: ");
			double hoahong = Double.parseDouble(s.nextLine());
			
			Quanlynhanvien nv = new Quanlynhanvien(ma, hoTen, luong);
			qlnv.add(nv);
			
		}else if ("3".equals(loaiNhanvien)) {
			System.out.println("Nhap ma nhan vien: ");
			String ma = s.nextLine();
			System.out.println("Nhap ten nhan vien: ");
			String hoTen = s.nextLine();
			System.out.println("Nhap luong nhan vien: ");
			double luong = Double.parseDouble(s.nextLine());
			System.out.println("Nhap luong trach nhiem: ");
			double trachnhiem = Double.parseDouble(s.nextLine());
			
			Quanlynhanvien nv = new Quanlynhanvien(ma, hoTen, luong);
			qlnv.add(nv);
			
		}else {
			System.out.println("Ban da chon sai!");
		}
		
	}
	
	public void xuat() {
		if (qlnv.size() != 0) {
			for (int i=0;i<qlnv.size();i++) {
				System.out.println("===============");
				String ma =  qlnv.get(i).ma;
				System.out.println("Ma nhan vien: " + ma);
				String hoTen =  qlnv.get(i).hoTen;
				System.out.println("Ten nhan vien: " + hoTen);
				double luong =  qlnv.get(i).luong;
				System.out.println("Luong nhan vien: " + luong);
			}
		} else {
			System.out.println("Danh sach nhan vien rong");
		}
	}
	
	public void search() {
		System.out.println("Nhap ma tim kiem: ");
		String nhapma = s.nextLine();
		
		for(int i=0;i<qlnv.size();i++) {
			if(nhapma.equalsIgnoreCase(qlnv.get(i).ma)) {
				System.out.println("===============");
				String ma =  qlnv.get(i).ma;
				System.out.println("Ma nhan vien: " + ma);
				String hoTen =  qlnv.get(i).hoTen;
				System.out.println("Ten nhan vien: " + hoTen);
			}
		}
	}
	
	public void xoa() {
		String nhapten;
		System.out.println("Nhap ma muon xoa: ");
		nhapten = s.nextLine();
		int check = 0;
		int giaTri = 0;
		for (int i=0;i<qlnv.size();i++) {
			String maso=qlnv.get(i).ma;
			if(nhapten.equals(maso)) {
				check = 1;
				giaTri = i;
			} else {
				
			} 	
		}
		if (check==1) {
			qlnv.remove(giaTri);
			xuat();
			
		} else {
			System.out.println("Không có mã trong danh sách");
		}
	}
	
	public void capnhat() {
		System.out.println("Nhap ma cap nhat: ");
		String nhapma = s.nextLine();
		
		for(int i=0;i<qlnv.size();i++) {
			if(nhapma.equalsIgnoreCase(qlnv.get(i).ma)) {
				System.out.println("Ma thay doi: ");
				String nhaplaima = s.nextLine();
				qlnv.get(i).ma = nhaplaima;
				
				System.out.println("Ten thay doi: ");
				String nhaplaiten = s.nextLine();
				qlnv.get(i).hoTen = nhaplaiten;
				
				System.out.println("Ma thay doi: "+nhaplaima);
				System.out.println("Ten thay doi: "+nhaplaiten);
			}
		}
	}

	public void timtheoluong() {

	}
	
	public void sapxeptheoten() {
		
	}
	
	public void sapxeptheothunhap() {
		
	}
	
	public void thunhapcaonhat() {
		
	}
	@Override
	public double getLuong() {
		// TODO Auto-generated method stub
		return 0;
	}

}


