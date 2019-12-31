package BaiTest;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;





public class Main {
	static String input;
	
	private static Scanner scanner = new Scanner(System.in);
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
		
		String input;
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
            		 NVHanhChinh nvhc = new NVHanhChinh();
                	 System.out.print("Nhập mã nhân viên: ");
                     nvhc.setid(scanner.nextLine());
                     System.out.print("Nhập họ tên:");
                     nvhc.setten(scanner.nextLine());
                     System.out.print("Nhập lương: ");
                     nvhc.setluong(scanner.nextDouble());
                     list.add(nvhc);
                     break;
                     

                 
                 case "2":
                	 TruongPhong tp = new TruongPhong();
                	 System.out.print("Nhập mã nhân viên: ");
                     tp.setid(scanner.nextLine());
                     System.out.print("Nhập họ tên:");
                     tp.setten(scanner.nextLine());
                     System.out.print("Nhập lương: ");
                     tp.luong = scanner.nextDouble();
                     System.out.print("Nhập lương trách nhiệm: ");
                     tp.luongTN = scanner.nextDouble();
                     double tinhThue= luong + doanhSo + hoaHong;
             		 tinhThue(tinhThue);;
                     list.add(tp);
                     break;
                 case "3":
                	 NVTiepThi nvtt = new NVTiepThi();
                	 System.out.print("Nhập mã nhân viên: ");
                	 nvtt.id = scanner.nextLine();
                     System.out.print("Nhập họ tên:");
                     nvtt.ten = scanner.nextLine();
                     System.out.print("Nhập lương: ");
                     nvtt.luong = scanner.nextDouble();
                     System.out.print("Nhập doanh số bán hàng: ");
                     nvtt.doanhSo = scanner.nextDouble();
                     System.out.print("Nhập tỉ lệ hoa hồng: ");
                     nvtt.hoaHong = scanner.nextDouble();
                     
                    tinhThue= luong + luongTN;
             		tinhThue(tinhThue);
             		nvhc = new TruongPhong(id, ten, tinhThue(tinhThue), luongTN, tinhThue, tinhThue);
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
			input = scanner.nextLine();
			for (int i=0;i<list.size();i++) {
				if (input.equalsIgnoreCase(list.get(i).id)) {
					list.get(i).showNV();
				}
			}
			break;
		case "4":
			input = scanner.nextLine();
			for (int i=0;i<list.size();i++) {
				if (input.equalsIgnoreCase(list.get(i).id)) {
					list.remove(i);
				}
			}
			break;
		case "5":
			System.out.println("Nhập id nhân viên cần cập nhật: ");
			input = scanner.nextLine();
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
	
	private static double tinhThue(double luong) {
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



		


	
	
