package Pk.BaiKiemTra;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class QuanLyNhanVien {
	Scanner s = new Scanner(System.in);
	ArrayList<NhanVienHanhChinh> listNhanVien= new ArrayList<NhanVienHanhChinh>();
	String kiemTraTen = "^[A-Z][a-z\\s]++";
	public void menu() {
		System.out.println("=====MENU=====");
		System.out.println("1. Nhập danh sách nhân viên từ bàn phím");
		System.out.println("2. Xuất danh sách nhân viên ra màn hình");
		System.out.println("3. Tìm và hiển thị nhân viên theo mã nhập từ bàn phím");
		System.out.println("4. Xóa nhân viên theo mã nhập từ bàn phím.");
		System.out.println("5. Cập nhật thông tin nhân viên theo mã nhập từ bàn phím");
		System.out.println("6. Tìm các nhân viên theo khoảng lương nhập từ bàn phím");
		System.out.println("7. Sắp xếp nhân viên theo họ tên");
		System.out.println("8. Sắp xếp nhân viên theo thu nhập");
		System.out.println("9. Xuất 5 nhân viên có thu nhập cao nhất");
		System.out.println("10. Kết thúc");
		int chon = Integer.parseInt(s.nextLine());
		switch (chon) {
		case 1:
			menuNhap();
			break;
		case 2:
			xuat();
			break;
		case 3:
			timNhanVien();
			break;			
		case 4:
			xoaNhanVien();
			break;			
		case 5:
			capNhatNhanVien();
			break;				
		case 6:
			timKhoanLuong();
			break;
		case 7:
			sapXepHoTen();
			break;
		case 8:
			sapXepTheoLuong();
			break;
		case 9:
			hienthiLuongCao();
			break;
		case 10:
			s.close();
			System.exit(0);
			break;	
		default:
			break;
		}
	}
	public void menuNhap() {
		System.out.println("=====THÊM NHÂN VIÊN=====");
		System.out.println("1. Nhập nhân viên hành chính");
		System.out.println("2. Nhập nhân viên tiếp thị");
		System.out.println("3. Nhập thông tin trưởng phòng");
		System.out.println("4. Về menu chính");
		int chon = Integer.parseInt(s.nextLine());
		switch (chon) {
		case 1:
			nhapNhanVienHanhChinh();
			break;
		case 2:
			nhapNhanVienTiepThi();
			break;
		case 3:
			nhapTruongPhong();
			break;
		case 4:
			menu();
			break;
		default:
			break;
		}
	}
	public void nhapNhanVienHanhChinh() {
		String chucVu= "Nhân Viên Hành Chính";
		System.out.println("Nhập tên(Tiếng việt không dấu, chữ đầu của họ phải viết hoa): ");
		String hoTen = s.nextLine();
		while (true) {
			if (hoTen.matches(kiemTraTen)) {
				break;
			} else {
				System.out.println("Bạn nhập sai định dạng tên (Định dạng tên không có dấu) vui lòng nhập lai: ");
				hoTen = s.nextLine();
			}
		}
		System.out.println("Nhập mã nhân viên: ");
		String maNhanVien = s.nextLine();
		System.out.println("Nhập lương cơ bản: ");
		double luong = Double.parseDouble(s.nextLine());
		tinhLuong(luong);
		NhanVienHanhChinh nvhc = new NhanVienHanhChinh(chucVu, hoTen, maNhanVien, luong, tinhLuong(luong));
		listNhanVien.add(nvhc);
	}
	public void nhapNhanVienTiepThi() {
		String chucVu= "Nhân Viên Tiếp Thị";
		System.out.println("Nhập tên(Tiếng việt không dấu, chữ đầu của họ phải viết hoa): ");
		String hoTen = s.nextLine();
		while (true) {
			if (hoTen.matches(kiemTraTen)) {
				break;
			} else {
				System.out.println("Bạn nhập sai định dạng tên (Định dạng tên không có dấu) vui lòng nhập lai: ");
				hoTen = s.nextLine();
			}
		}
		System.out.println("Nhập mã nhân viên: ");
		String maNhanVien = s.nextLine();
		System.out.println("Nhập lương cơ bản: ");
		double luong = Double.parseDouble(s.nextLine());
		System.out.println("Nhập doanh số bán hàng: ");
		double doanhSoBanHang = Double.parseDouble(s.nextLine());
		System.out.println("Nhập tỉ lệ hoa hồng: ");
		double tiLeHoaHong = Double.parseDouble(s.nextLine());
		double tongLuong= luong + (doanhSoBanHang*tiLeHoaHong)/100;
		tinhLuong(tongLuong);
		NhanVienHanhChinh nvhc = new NhanVienTiepThi(chucVu, hoTen, maNhanVien, tongLuong, tinhLuong(tongLuong), tiLeHoaHong, doanhSoBanHang);
		listNhanVien.add(nvhc);
	}
	public void nhapTruongPhong() {
		String chucVu= "Trưởng Phòng";
		System.out.println("Nhập tên(Tiếng việt không dấu, chữ đầu của họ phải viết hoa): ");
		String hoTen = s.nextLine();
		while (true) {
			if (hoTen.matches(kiemTraTen)) {
				break;
			} else {
				System.out.println("Bạn nhập sai định dạng tên (Định dạng tên không có dấu) vui lòng nhập lai: ");
				hoTen = s.nextLine();
			}
		}
		System.out.println("Nhập mã trưởng phòng: ");
		String maNhanVien = s.nextLine();
		System.out.println("Nhập lương cơ bản: ");
		double luong = Double.parseDouble(s.nextLine());
		System.out.println("Nhập lương trách nhiệm: ");
		double luongTrachNhiem = Double.parseDouble(s.nextLine());
		double tongLuong= luong + luongTrachNhiem;
		tinhLuong(tongLuong);
		NhanVienHanhChinh nvhc = new TruongPhong(chucVu, hoTen, maNhanVien, tongLuong, tinhLuong(tongLuong), luongTrachNhiem);
		listNhanVien.add(nvhc);
	}
	public double tinhLuong(double luong) {
		double thue;
		if (luong < 9000000) {
			thue = 0;
			return thue;
		} else if (9000000 < luong && luong <= 15000000 ) {
			thue = ((luong-8999999) * 10)/100;
			return thue;
		} else {
			thue = ((luong-15000000) * 15)/100 + ((15000000-8999999)*10)/100;
			return thue;
		}
	}
	public void xuat() {
		for (int i=0;i<listNhanVien.size();i++) {
			listNhanVien.get(i).hienThiNhanVien();
			System.out.println("------------------------");
		}
	}
	public void xoaNhanVien() {
		String nhapMaNV;
		nhapMaNV = s.nextLine();
		for (int i=0;i<listNhanVien.size();i++) {
			if (nhapMaNV.equalsIgnoreCase(listNhanVien.get(i).maNhanVien)) {
				listNhanVien.remove(i);
			}
		}
	}
	public void timNhanVien() {
		String nhapMaNV;
		nhapMaNV = s.nextLine();
		for (int i=0;i<listNhanVien.size();i++) {
			if (nhapMaNV.equalsIgnoreCase(listNhanVien.get(i).maNhanVien)) {
				listNhanVien.get(i).hienThiNhanVien();
				System.out.println("------------------------");
			}
		}
	}
	public void capNhatNhanVien() {
		String nhapMaNV;
		System.out.println("Nhập mã nhân viên: ");
		nhapMaNV = s.nextLine();
		for (int i=0;i<listNhanVien.size();i++) {
			if (nhapMaNV.equalsIgnoreCase(listNhanVien.get(i).maNhanVien)) {
				System.out.println("Nhập tên(Tiếng việt không dấu, chữ đầu của họ phải viết hoa): ");
				String hoTen = s.nextLine();
				while (true) {
					if (hoTen.matches(kiemTraTen)) {
						break;
					} else {
						System.out.println("Bạn nhập sai định dạng tên (Định dạng tên không có dấu) vui lòng nhập lai: ");
						hoTen = s.nextLine();
					}
				}
				listNhanVien.get(i).hoTen = hoTen;
				System.out.println("Nhập mã nhân viên: ");
				String maNhanVien = s.nextLine();
				listNhanVien.get(i).maNhanVien = maNhanVien;
			}
		}
	}
	public void timKhoanLuong() {
		double nhap1;
		double nhap2;
		System.out.println("Bạn muốn tìm nhân viên có khoản lương từ: ");
		nhap1 = Double.parseDouble(s.nextLine());
		System.out.println("Đến: ");
		nhap2 = Double.parseDouble(s.nextLine());
		for (int i=0;i<listNhanVien.size();i++) {
			if (nhap1 <= listNhanVien.get(i).luong && listNhanVien.get(i).luong <= nhap2 ) {
				listNhanVien.get(i).hienThiNhanVien();
				System.out.println("----------------------------------");
			}
		}
	}
	public void sapXepHoTen() {
		Collections.sort(listNhanVien, new Comparator<NhanVienHanhChinh>() {
			@Override
			public int compare(NhanVienHanhChinh o1, NhanVienHanhChinh o2) {
				return (o1.hoTen.compareTo(o2.hoTen));
			}
		});
		for (int i=0;i<listNhanVien.size();i++) {

			listNhanVien.get(i).hienThiNhanVien();
			System.out.println("------------------------");
		}
	}
	public void sapXepTheoLuong() {
		Collections.sort(listNhanVien, new Comparator<NhanVienHanhChinh>() {
			 @Override
	            public int compare(NhanVienHanhChinh o1, NhanVienHanhChinh o2) {
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
		for (int i=0;i<listNhanVien.size();i++) {

			listNhanVien.get(i).hienThiNhanVien();
			System.out.println("------------------------");
		}
	}
	public void hienthiLuongCao() {
		Collections.sort(listNhanVien, new Comparator<NhanVienHanhChinh>() {
			 @Override
	            public int compare(NhanVienHanhChinh o1, NhanVienHanhChinh o2) {
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
		int demHienThi=0;
		for (int i=0;i<listNhanVien.size();i++) {
			demHienThi ++;
			listNhanVien.get(i).hienThiNhanVien();
			System.out.println("------------------------");
			if(demHienThi == 5) {
				break;
			}
		}
	}
}
