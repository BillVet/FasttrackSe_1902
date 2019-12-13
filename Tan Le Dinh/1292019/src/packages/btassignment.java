package packages;

import java.util.Scanner;

public class btassignment {
	
	public static void main(String[] args) {
		SinhVien();
		Scanner s= new Scanner(System.in);
		int a;
		a = s.nextInt();
		switch (a) {
		case 1 :
			ThemSinhVien();
			break;
		case 2 :
			CapNhatThongTin();
			break;
		case 3 :
			XoaSinhVien();
			break;
		case 4 :
			SapXepSinhVien();
			break;
		case 5 :
			HienThiDanhSach();
			break;
		case 0 :
			KetThucChuongTrinh();
			break;
		}
	}
	String ID;
	String HoTen;
	double Age;
	String Address;
	static btassignment[] sv = new btassignment[100];
	public static void SinhVien() {
		System.out.println("1. Thêm sinh viên.");
		System.out.println("2. Cập nhật thông tin sinh viên theo ID");
		System.out.println("3. Xóa sinh viên theo ID");
		System.out.println("4. Sắp xếp sinh viên theo tên");
		System.out.println("5. Hiện thị danh sách sinh viên");
		System.out.println("0. Kết thúc chương trình");
	}
	public static void ThemSinhVien() {
		Scanner scanner = new Scanner(System.in);
		int n;
		System.out.println("Số thứ tự sinh viên");
			n = Integer.parseInt(scanner.nextLine());
		
		sv[n] = new btassignment();
		
		System.out.println("Nhập ID: ");
			sv[n].ID = scanner.nextLine();
		
		System.out.println("Nhập họ tên: ");
			sv[n].HoTen = scanner.nextLine();
		
		System.out.println("Nhập tuổi: ");
			sv[n].Age = Double.parseDouble(scanner.nextLine());
			
		System.out.println("Nhập địa chỉ: ");
			sv[n].Address = scanner.nextLine();
		
		System.out.println("Sinh viên đã đăng ký");
			System.out.println("Số ID sinh viên :"+sv[n].ID);
			System.out.println(" Họ và tên :" + sv[n].HoTen + "\n Tuổi : " + sv[n].Age  + "\n Địa chỉ :" + sv[n].Address);
	}
			
	public static void CapNhatThongTin() {
		Scanner scanner = new Scanner(System.in);
		int n;
		System.out.println("Số thứ tự sinh viên");
			n = Integer.parseInt(scanner.nextLine());
		
		sv[n] = new btassignment();
		
		System.out.println("Nhập ID: ");
			sv[n].ID = scanner.nextLine();
		
		System.out.println("Chỉnh sửa họ tên: ");
			sv[n].HoTen = scanner.nextLine();
	
		System.out.println("Chỉnh sửa tuổi: ");
			sv[n].Age = Double.parseDouble(scanner.nextLine());
		
		System.out.println("Chỉnh sửa địa chỉ: ");
			sv[n].Address = scanner.nextLine();
	
		System.out.println("Hoàn tất thay đổi");
		System.out.println("Số ID sinh viên :"+sv[n].ID);
		System.out.println(" Họ và tên :" + sv[n].HoTen + "\n Tuổi : " + sv[n].Age + "\n Địa chỉ :" + sv[n].Address);
	}
	public static void XoaSinhVien() {
		Scanner scanner = new Scanner(System.in);
		int n;
		System.out.println("Số thứ tự sinh viên");
			n = Integer.parseInt(scanner.nextLine());
		
		sv[n] = new btassignment();
		
		int x;
		
		System.out.println("Nhập ID: ");
			sv[n].ID = scanner.nextLine();
		
		System.out.println("Bạn muốn xóa sinh viên này?");
		System.out.println("Nhập x: ");
		x = scanner.nextInt();
		if(x==0) {
			System.out.println("Hoàn tác!");
		}else if(x!=0) {
			System.out.println("Bạn đã xóa thành công!");
		}
			
	}
	public static void SapXepSinhVien() {
//		Scanner scanner = new Scanner(System.in);
//		int n;
//		System.out.println("Số thứ tự sinh viên");
//			n = Integer.parseInt(scanner.nextLine());
//		
//		sv[n] = new btassignment();
//		
//		System.out.println("Nhập họ tên: ");
//			sv[n].HoTen = scanner.nextLine();
//		
//		
	}
	public static void HienThiDanhSach() {
		
	}
	public static void KetThucChuongTrinh() {
		
	}
}
