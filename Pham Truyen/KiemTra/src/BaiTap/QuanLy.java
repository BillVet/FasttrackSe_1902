package BaiTap;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class QuanLy {

	Scanner scanner = new Scanner(System.in);
	public void menu() {
		while(true) {
			System.out.println("---------------------------------------");
			System.out.println("1.Nhap danh sach nhan vien             ");
			System.out.println("2.Xuat danh sach nhan vien             ");
			System.out.println("3.Tim va hien thi nhan vien theo ma    ");
			System.out.println("4.Xoa nhan vien theo ma                ");
			System.out.println("5.Cap nhap thong tin nhan vien theo ma ");
			System.out.println("6.Tim cac nhan vien theo khoang luong  ");
			System.out.println("7.Sap xep nhan vien theo ho va ten     ");
			System.out.println("8.Sap xep nhan vien theo thu nhap      ");
			System.out.println("9.Xuat 5 nhan vien co thu nhap cao nhat");
			System.out.println("0.Ket thuc                             ");
			System.out.println("---------------------------------------");
			
			System.out.println("Lua chon menu: ");
			String chon = scanner.nextLine();
			
			switch (chon) {
			case "1":
				nhap();
				break;
			case "2":
				xuat();
				break;
			case "3":
				timTheoMa();
				break;
			case "4":
				xoa();
				break;
			case "5":
				capNhap();
				break;
			case "6":
				timTheoLuong();
				break;
			case "7":
				sapXepTheoHoTen();
				break;
			case "8":
				sapXepTheoThuNhap(null);
				break;
			case "9":
				xuat5NhanVienLuongCao();
				break;
			case "0":
				scanner.close();
				System.exit(0);
				break;
			default:
				break;
			}
		}
	}
	
	NhanVien nhanVien;
	int n;
	ArrayList<NhanVien> nv = new ArrayList<>();
	
	public void nhap() {
		System.out.println("Nhap so luong nhan vien: ");
		n = Integer.parseInt(scanner.nextLine());
		
		System.out.println("Moi ban chon xe de nhap");
		System.out.println("1.Nhan vien hanh chinh");
		System.out.println("2.Nhan vien tiep thi");
		System.out.println("3.Truong phong");
		
		String loai = scanner.nextLine();
		
		NhanVien nhanVien = null;
		
		for(int i = 0; i < n; i++) {
			nhanVien = new NhanVien();
			System.out.println("Nhap thong tin nhan vien thu: " + (i+1) + " : ");
			if("1".equals(loai)) {
				NhanVien nhanVien1 = new NhanVien();
				nhanVien1.nhap();
			}else if("2".equals(loai)) {
				NhanVienTiepThi nvTiepThi = new NhanVienTiepThi();
				nvTiepThi.nhap();
			}else if("3".equals(loai)) {
				TruongPhong truongPhong = new TruongPhong();
				truongPhong.nhap();
			}else {
				System.out.println("Ban chon sai roi!");
			}
            nv.add(nhanVien);
		}
	}
	
	public void xuat() {
		for (int i = 0; i < nv.size(); i++) {
	        System.out.println("\nThong tin nhan vien thu: " + (i+1));
	        nv.get(i).xuat();
	    }
	}
	
	public void timTheoMa() {
		System.out.println("\nNhap ma nhan vien can tim: ");
	    String tim = scanner.nextLine();
	    for (int i = 0; i < nv.size(); i++) {
	        if (nv.get(i).getMa().equalsIgnoreCase(tim)) {
	            nv.get(i).xuat();
	        }
        }
	}
	
	public void xoa() {
		System.out.println("\nNhap ma nhan vien can xoa: ");
	    String tim = scanner.nextLine();
	    for (int i = 0; i < nv.size(); i++) {
	        if (nv.get(i).getMa().equalsIgnoreCase(tim)) {
	            nv.remove(i);
	        }
        }
	}
	
	public void capNhap() {
		String nhapMa;
		System.out.println("Nhap ma nhan vien: ");
		nhapMa = scanner.nextLine();
		for (int i = 0; i < nv.size(); i++) {
			if  (nhapMa.equalsIgnoreCase(nv.get(i).ma)) {
				System.out.println("Nhap ho ten nhan vien: ");
				String hoTen = scanner.nextLine();
				while(true) {
					if(hoTen.matches(hoTen)) {
						break;
					}else {
						System.out.println("Nhap sai roi!");
						hoTen = scanner.nextLine();
					}
				}
				nv.get(i).hoTen = hoTen;
				System.out.println("Nhap ma sinh vien: ");
				String ma = scanner.nextLine();
				nv.get(i).ma = ma;
			}
		}
	}
	
	public void timTheoLuong() {
		int luong1;
		int luong2;
		
		System.out.println("Nhap so tien luong can tim tu: ");
		luong1 = Integer.parseInt(scanner.nextLine());
		System.out.println("Den: ");
		luong2 = Integer.parseInt(scanner.nextLine());
		
		for (int i = 0; i < nv.size(); i++) {
	        if (luong1 <= nv.get(i).luong && nv.get(i).luong <= luong2) {
	            nv.get(i).xuat();
	        }
		}
	}
	
	public void sapXepTheoHoTen() {
		Collections.sort(nv, new Comparator<NhanVien>() {
			public int compare(NhanVien o1, NhanVien o2) {
				return (o1.hoTen.compareTo(o2.hoTen));
			}
		});
	}
	
	public void sapXepTheoThuNhap(int [] nv) {
		int temp = nv[0];
		for (int i = 0; i < nv.length - 1; i++) {
			for (int j = i + 1; j < nv.length; j++) {
				if(nv[i] > nv[j]) {
					temp = nv[j];
					nv[j] = nv[i];
					nv[i] = temp;
					nhanVien.xuat();
				}
			}
		}
	}
	
	public void xuat5NhanVienLuongCao() {
	
	}
}
