package bt4;

import java.util.ArrayList;
import java.util.Scanner;

public class ThanhToan {

	Scanner scanner = new Scanner(System.in);
	
	public void menu() {
		while (true) {
			System.out.println("--------------------------------------");
			System.out.println("1.Nhap thong tin khach tro            ");
			System.out.println("2.Hien thi thong tin khach tro        ");
			System.out.println("3.Xoa thong tin khach tro             ");
			System.out.println("4.Thanh toan                          ");
			System.out.println("0.Ket thuc                            ");
			System.out.println("--------------------------------------");
			
			System.out.println("Lua chon menu :");
			String chon;
			chon = scanner.nextLine();
			
			switch (chon) {
			case "1":
				nhap();
				break;
			case "2":
				xuat();
				break;
			case "3":
				xoa();
				break;
			case "4":
				tinhTien();
				break;
			case "0":
				System.out.println("Ket thuc");
				scanner.close();
				System.exit(0);
				break;
			default:
				break;
			}
		}
	}
	
    int n;
    KhachSan khachSan;
   
    ArrayList<KhachSan> arrKhachSan = new ArrayList<>();
     
    public void nhap() {
    	System.out.println("Nhap so luong khach tro: ");
        n = Integer.parseInt(scanner.nextLine());
         
        for (int i = 0; i < n; i++) {
            khachSan = new KhachSan();
            System.out.println("Nhap thong tin khach hang thu: " + (i+1) + ":");
            khachSan.nhap();
            arrKhachSan.add(khachSan);
        }
    }
    
    public void xuat() {
    	
	    for (int i = 0; i < arrKhachSan.size(); i++) {
	        System.out.println("\nThong tin khach hang thu: " + (i+1) + ": ");
	        arrKhachSan.get(i).xuat();
	    }
    }
    
    public void xoa() {
    	System.out.println("\nNhap so cmnd khach tra phong: ");
	    String tim = scanner.nextLine();
	    for (int i = 0; i < arrKhachSan.size(); i++) {
	        if (arrKhachSan.get(i).getNguoi().getSoCMND().equalsIgnoreCase(tim)) {
	            arrKhachSan.remove(i);
	        }
        }
    }
     
    public void tinhTien() {
	    System.out.println("\nNhap so cmnd khach tra phong: ");
	    String tim = scanner.nextLine();
	    for (int i = 0; i < arrKhachSan.size(); i++) {
	        if (arrKhachSan.get(i).getNguoi().getSoCMND().equalsIgnoreCase(tim)) {
	            System.out.println("So tien phong = " + arrKhachSan.get(i).tinhTien());
	        }
        }
    }
}

