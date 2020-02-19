package Bai2;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import java.util.Scanner;

		public class Main{
		    public static void main(String[] args){
		    	String hoTen = null;
		    	double luong = 0;
		    	int namSinh = 0;
		    	BaoVe caTruc = null;
		    	String chucVu;
		    	String input;
				ArrayList<NhanVien> nv = new ArrayList<NhanVien>();
				
		        int chon;  
		        int chon1;
		        Scanner sc = new Scanner(System.in);
		        while(true){
		        System.out.println("/****************************************/");
		        System.out.println("Xin chọn loại nhân viên cần nhập thông tin");
		        System.out.println("1.  Thêm Nhân viên");
		        System.out.println("2.  Xuất thông tin nhân viên");
		        System.out.println("3.  Đếm số lượng nhân viên quản lí");
		        System.out.println("4.  Tìm danh sách bảo vệ có ca trực sáng");
		        System.out.println("5.  Xóa thông tin Quản lý theo tên");
		        System.out.println("6.  Tính tổng lương của nhân viên là quản lý");
		        System.out.println("7.  Sắp xếp danh sách nhân viên bảo vệ theo lương");
		        System.out.println("0.  Kết thúc ");
		        System.out.println("/****************************************/");
		        do
		       {
		           System.out.println ("Nhập vào giá trị: ");
		           chon = Integer.parseInt(sc.nextLine());                   
		       }while(chon<=0 || chon>7);
		        switch (chon)
		        {
		            case 1:
		            	System.out.println("Nhập 1: Thêm một nhân viên quản lí");
		            	System.out.println("Nhập 2: Thêm một nhân viên bảo vệ");
		            	 chon1 = Integer.parseInt(sc.nextLine());
		            	 switch (chon1){
		            	 case 1:
		            	 {
				                QuanLy ql=new QuanLy();
				                System.out.println("***Nhân viên quản lý***");                  
				                ql.nhap();
				                ql.setchucVu();
				                nv.add(ql);
				                break;
				            }
		            	 case 2:
				            {
				                BaoVe bv=new BaoVe();
				                System.out.println("***Nhân viên bảo vệ***");
				                bv.nhap();
				                nv.add(bv);
				                
				                break;
				            }
		            	 }
		            
		            
		            break;
		            case 2:
		            {
		            	for (int i = 0; i < nv.size(); i++) {
		    	            nv.get(i).xuat();
		    			}	
		    			break;
		            }
		            case 3:
		            {
		            	int dem = 0;
		            	for(int i = 0; i <nv.size(); i++) {
		            		if(nv.get(i).chucVu.equalsIgnoreCase("quanly")) {
		            			dem++;
		            		}
		            		
		            	}
		            	System.out.println("Số lượng quản lí: " + dem);
		            	break;
		            }
		            
		            case 4:
		            {
		            	System.out.println("Danh sách bảo vệ có ca trực sáng:");
		    			for (int i=0;i<nv.size();i++) {
		    				if (nv.get(i).caTruc.equalsIgnoreCase("sang")){
		    					nv.get(i).xuat();
		    				}
		    			}
		    			
		    			break;
		            }
		            case 5:
		            {
		            	System.out.println("Nhập vào tên quản lý cần xóa:");
		            	input = sc.nextLine();
		    			for (int i=0;i<nv.size();i++) {
		    				if (input.equalsIgnoreCase(nv.get(i).hoTen)) {
		    					nv.remove(i);
		    				}
		    			}
		    			break;
		            }
		            
//		            case 6:
//		            {
//		            	int dem = 0;
//		            	for(int i = 0; i <nv.size(); i++) {
//		            		if(nv.get(i).chucVu.equalsIgnoreCase("quanly")) {
//		            			;
//		            		}
//		            		System.out.println("Tổng lương của tất cả quản lí là: "+ dem+= nv.get(i).luong  );
//		            	}
//		            	System.out.println("Số lượng quản lí: " + dem);
//		            	
//		            	break;
//		            }
		            case 0:
		            {
		                System.out.println("Đã thoát khỏi chương trình");
		                System.exit(0);
		                break;
		            }
		    }
		  }
		 }
}


