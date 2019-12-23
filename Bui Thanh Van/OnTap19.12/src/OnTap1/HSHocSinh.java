package OnTap1;

import java.text.Normalizer;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Pattern;

public class HSHocSinh extends HocSinh{
	public HSHocSinh(String tenHocSinh, String ngaySinh, String queQuan) {
		super(tenHocSinh, ngaySinh, queQuan);
	}

	public HSHocSinh(String tenHocSinh, String ngaySinh, String queQuan, String lop, String khoaHoc, String kyHoc) {
		super(tenHocSinh, ngaySinh, queQuan);
		this.lop = lop;
		this.khoaHoc = khoaHoc;
		this.kyHoc = kyHoc;
	}
	
	String lop;
	String khoaHoc;
	String kyHoc;
	int chon;
	String kiemTraNgaySinh="[0-9]{2}\\/[0-9]{2}\\/[0-9]{4}";
	Scanner s = new Scanner(System.in);
	ArrayList<HSHocSinh> listHocSinh = new ArrayList<HSHocSinh>();
	public void menu() {
		System.out.println("=====MENU=====");
		System.out.println("1. Thêm học sinh");
		System.out.println("2. Hiển thị toàn bộ học sinh");
		System.out.println("3. Hiển thị thông tin học sinh theo tên");
		System.out.println("4. Hiển thị học sinh sn1985 quê thái nguyên");
		System.out.println("5. Hiển thị học sinh lớp 10A1");
		System.out.println("6. Két thúc");
		chon = Integer.parseInt(s.nextLine());
		switch (chon) {
		case 1:
			nhap();
			break;
		case 2:
			show();
			break;
		case 3:
			hienThiTheoTen();
			break;
		case 4:
			hienThiHocSinhsn1985queThaiNguyen();
			break;
		case 5:
			hienThiHocSinh10a1();
			break;
		case 6:
			s.close();
			System.exit(0);
			break;
		default:
			break;
		}
	}
	public void nhap() {
		int soHocSinhCanNhap;
		System.out.println("Nhập vào số học sinh cần thêm: ");
		soHocSinhCanNhap = Integer.parseInt(s.nextLine());
		for (int i= 0; i< soHocSinhCanNhap; i++) {
			System.out.println("Nhập vào học sinh thứ " + i+1);
			System.out.println("Nhập vào tên học sinh: ");
		tenHocSinh = s.nextLine();
		System.out.println("Nhập vào ngày sinh (xx/xx/xxx): ");
		ngaySinh = s.nextLine();
		while (true) {
			if (ngaySinh.matches(kiemTraNgaySinh)) {
				break;
			} else {
				System.out.println("Bạn đã nhập sai định dạng ngày sinh.");
				ngaySinh = s.nextLine();
			}
		}
		System.out.println("Nhập vào quê quán: ");
		queQuan = s.nextLine();
		System.out.println("Nhập vào lớp: ");
		lop = s.nextLine();
		System.out.println("Nhập vào khoaHoc: ");
		khoaHoc = s.nextLine();
		System.out.println("Nhập vào kỳ học: ");
		kyHoc = s.nextLine();
		HSHocSinh hs = new HSHocSinh(tenHocSinh, ngaySinh, queQuan, lop, khoaHoc, kyHoc);
		listHocSinh.add(hs);
		}
		
	}
	public void show() {
		for (int i=0 ; i<listHocSinh.size(); i++) {
			String tenHocSinh = listHocSinh.get(i).tenHocSinh;
			String ngaySinh = listHocSinh.get(i).ngaySinh;
			String queQuan = listHocSinh.get(i).queQuan;
			String lop = listHocSinh.get(i).lop;
			String khoaHoc = listHocSinh.get(i).khoaHoc;
			String kyHoc = listHocSinh.get(i).kyHoc;
			System.out.println("Tên học sinh: " + tenHocSinh);
			System.out.println("Ngày sinh: " + ngaySinh);
			System.out.println("Quê quán: " + queQuan);
			System.out.println("Lớp: " + lop);
			System.out.println("Khoa hoc: " + khoaHoc);
			System.out.println("Kỳ học: " + kyHoc);
			System.out.println("---------------------------------");
		}
	}
	public void hienThiTheoTen() {
		System.out.println("Nhập tên muốn hiển thị: ");
		String nhapTen = s.nextLine();
		for (int i=0 ; i<listHocSinh.size(); i++) {
			if (nhapTen.equals(listHocSinh.get(i).tenHocSinh)) {
				String tenHocSinh = listHocSinh.get(i).tenHocSinh;
				String ngaySinh = listHocSinh.get(i).ngaySinh;
				String queQuan = listHocSinh.get(i).queQuan;
				String lop = listHocSinh.get(i).lop;
				String khoaHoc = listHocSinh.get(i).khoaHoc;
				String kyHoc = listHocSinh.get(i).kyHoc;
				System.out.println("Tên học sinh: " + tenHocSinh);
				System.out.println("Ngày sinh: " + ngaySinh);
				System.out.println("Quê quán: " + queQuan);
				System.out.println("Lớp: " + lop);
				System.out.println("Khoa hoc: " + khoaHoc);
				System.out.println("Kỳ học: " + kyHoc);
				System.out.println("---------------------------------");	
			}

		}
	}
	public void hienThiHocSinh10a1() {
		String lop10a1 = "10a1";
		for (int i=0 ; i<listHocSinh.size(); i++) {
			if (lop10a1.equalsIgnoreCase(listHocSinh.get(i).lop)) {
				String tenHocSinh = listHocSinh.get(i).tenHocSinh;
				String ngaySinh = listHocSinh.get(i).ngaySinh;
				String queQuan = listHocSinh.get(i).queQuan;
				String lop = listHocSinh.get(i).lop;
				String khoaHoc = listHocSinh.get(i).khoaHoc;
				String kyHoc = listHocSinh.get(i).kyHoc;
				System.out.println("Tên học sinh: " + tenHocSinh);
				System.out.println("Ngày sinh: " + ngaySinh);
				System.out.println("Quê quán: " + queQuan);
				System.out.println("Lớp: " + lop);
				System.out.println("Khoa hoc: " + khoaHoc);
				System.out.println("Kỳ học: " + kyHoc);
				System.out.println("---------------------------------");	
			}

		}
	}
	// FOFMAT Unicode 
	public String removeAccent(String s) {
		  
		  String temp = Normalizer.normalize(s, Normalizer.Form.NFD);
		  Pattern pattern = Pattern.compile("\\p{InCombiningDiacriticalMarks}+");
		  return pattern.matcher(temp).replaceAll("");
	}
	public void hienThiHocSinhsn1985queThaiNguyen() {
		String quequan = "thai nguyen";
		String checkNgaySinh = "[0-9]{2}\\/[0-9]{2}\\/1985";
		for (int i=0 ; i<listHocSinh.size(); i++) {
			String NgaySinh = listHocSinh.get(i).ngaySinh;
			String quequanHS = removeAccent(listHocSinh.get(i).queQuan);
			if (quequanHS.equalsIgnoreCase(quequan) &&  NgaySinh.matches(checkNgaySinh)) {
				String tenHocSinh = listHocSinh.get(i).tenHocSinh;
				String ngaySinh = listHocSinh.get(i).ngaySinh;
				String queQuan = listHocSinh.get(i).queQuan;
				String lop = listHocSinh.get(i).lop;
				String khoaHoc = listHocSinh.get(i).khoaHoc;
				String kyHoc = listHocSinh.get(i).kyHoc;
				System.out.println("Tên học sinh: " + tenHocSinh);
				System.out.println("Ngày sinh: " + ngaySinh);
				System.out.println("Quê quán: " + queQuan);
				System.out.println("Lớp: " + lop);
				System.out.println("Khoa hoc: " + khoaHoc);
				System.out.println("Kỳ học: " + kyHoc);
				System.out.println("---------------------------------");	
			}

		}
	}


}
