package BaiTest;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;







public class Main {
	
	@SuppressWarnings("unused")
	public static Scanner scanner = new Scanner(System.in);
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		String id = null;
		String ten = null;
		double luong = 0;
		double luongTN = 0;
		double hoaHong = 0;
		double doanhSo = 0;
		double thue;
		
		ArrayList<NVHanhChinh> list = new ArrayList<NVHanhChinh>();
	
		NVTiepThi nvtt = new NVTiepThi();
		NVHanhChinh nvhc = new NVHanhChinh();
		TruongPhong tp = new TruongPhong();
		
		String input;
		input = scanner.nextLine();
		
		
		while(true) {
		System.out.println("/****************************************/");
		System.out.println("1.  Nhập vào danh sách nhân viên");
		System.out.println("2.  Xuất/ hiển thị danh sách nhân viên");
		System.out.println("3.  Tìm nhân viên theo mã");
		System.out.println("4.  xóa nhân viên theo mã");
		System.out.println("5.  cập nhật thông tin nhân viên");
		System.out.println("6.  Tìm nhân viên theo khoảng lương");
		System.out.println("7.  Sắp xếp nhân viên theo họ và tên");
		System.out.println("8.  Sắp xếp nhân viên theo thu nhập");
		System.out.println("9.  Xuất 5 nhân viên có lương cao nhất");
		System.out.println("0.  Kết thúc ");
		System.out.println("/****************************************/");
		String x = scanner.nextLine();
		switch (x) {
		
		case "1":
			System.out.println("Nhập 1: Thêm một nhân viên hành chính");
            System.out.println("Nhập 2: Thêm một nhân viên trưởng phòng");
            System.out.println("Nhập 3: Thêm một nhân viên tiếp thị");
            String y = scanner.nextLine();
            switch (y) {
            case "1": 
                	 System.out.print("Nhập mã nhân viên: ");
                     nvhc.id = scanner.nextLine();
                     System.out.print("Nhập họ tên:");
                     nvhc.ten = scanner.nextLine();
                     System.out.print("Nhập lương: ");
                     nvhc.luong = scanner.nextDouble();
                     tongLuong(luong);
                     luong = Double.parseDouble(scanner.nextLine());
             		
             		 nvhc = new NVHanhChinh(ten, id, luong);
                     list.add(nvhc);
                     break;
                     

                 
                 case "2":
                	 System.out.print("Nhập mã nhân viên: ");
                     id = scanner.nextLine();
                     System.out.print("Nhập họ tên:");
                     ten = scanner.nextLine();
                     System.out.print("Nhập lương: ");
                     luong = scanner.nextDouble();
                     System.out.print("Nhập lương trách nhiệm: ");
                     luongTN = scanner.nextDouble();
                     double tongLuong= luong + doanhSo + hoaHong;
             		 tongLuong(tongLuong);
             		 nvhc = new NVTiepThi(id, ten, tongLuong(tongLuong), hoaHong, doanhSo);
                     list.add(nvhc);
                     break;
                 case "3":
                	 System.out.print("Nhập mã nhân viên: ");
                     id = scanner.nextLine();
                     System.out.print("Nhập họ tên:");
                     ten = scanner.nextLine();
                     System.out.print("Nhập lương: ");
                     luong = scanner.nextDouble();
                     System.out.print("Nhập doanh số bán hàng: ");
                     doanhSo = scanner.nextDouble();
                     System.out.print("Nhập tỉ lệ hoa hồng: ");
                     hoaHong = scanner.nextDouble();
                     
                    tongLuong= luong + luongTN;
             		tongLuong(tongLuong);
             		nvhc = new TruongPhong(id, ten, tongLuong(tongLuong), luongTN, tongLuong, tongLuong);
                     list.add(nvhc);
                     break;
            
			}
            break;
		case "2":
			for (int i = 0; i < list.size(); i++) {
	            list.get(i).showNV();
			}	
			break;
		case "3":
			for (int i=0;i<list.size();i++) {
				if (input.equalsIgnoreCase(list.get(i).id)) {
					list.get(i).showNV();
				}
			}
			break;
		case "4":
			for (int i=0;i<list.size();i++) {
				if (input.equalsIgnoreCase(list.get(i).id)) {
					list.remove(i);
				}
			}
			break;
		case "5":
			System.out.println("Nhập id nhân viên cần cập nhật: ");
			
			for (int i=0;i<list.size();i++) {
				if (input.equalsIgnoreCase(list.get(i).id)) {
					System.out.println("Nhập họ và tên nhân viên: ");
					String hoTen = scanner.nextLine();
					list.get(i).ten = ten;
					System.out.println("Nhập id nhân viên: ");
					String maNhanVien = scanner.nextLine();
					list.get(i).id = maNhanVien;
				}
			}
			break;
		case "6":
			break;
		case "7":
				Collections.sort(list, new Comparator<NVHanhChinh>() {
					public int compare(NVHanhChinh sort, NVHanhChinh sort1) {
						return (sort.ten.compareTo(sort1.ten));
					}
				});
				for (int i=0;i<list.size();i++) {
					list.get(i).showNV();
				}
			
			break;
		case "8":
			Collections.sort(list, new Comparator<NVHanhChinh>() {
		            public int compare(NVHanhChinh sort, NVHanhChinh sort1) {
		                if (sort.luong < sort1.luong) {
		                    return 1;
		                } else {
		                    if (sort.luong == sort1.luong) {
		                        return 0;
		                    } else {
		                        return -1;
		                    }
		                }
		            }
		        });
			for (int i=0;i<list.size();i++) {
				list.get(i).showNV();
			}
			break;
		case "9":
			break;
		case "0":
			System.exit(0);
			break;
		
		
		}
		}
	
		
	}	
	///////////////////// NGOÀI MAIN
	
	public static double tongLuong(double luong) {
		double thue;
		if (luong < 9000000) {
			thue = 0;
			return thue;
		} else if (9000000 < luong && luong <= 15000000 ) {
			thue = (luong * 10)/100;
			return thue;
		} else {
			thue = (luong-15000000 * 15)/100 + (15000000*10/100);
			return thue;
		}
	}
}


		


	
	
