package packages;

import java.util.Collections;
import java.util.Scanner;

class SinhVien{
	String hoTen;
	double diem;
	String hocLuc;
}

public class bt6 {
	
	public static void main(String[] args) {
		int n;
		System.out.println("Nhập vào số sinh viên: ");
		Scanner scanner = new Scanner(System.in);
		n = Integer.parseInt(scanner.nextLine());
		
		SinhVien[] sv = new SinhVien[n];
		
		for (int i = 0 ; i < n; i++) {
			System.out.println("Nhập vào sinh viên thứ " + i);
			sv[i] = new SinhVien();
			
			System.out.println("Nhập họ tên: ");
			sv[i].hoTen = scanner.nextLine();
			
			System.out.println("Nhập điểm: ");
			sv[i].diem = Double.parseDouble(scanner.nextLine());
			
			if(sv[i].diem<5) {
				sv[i].hocLuc = "Yếu";
			}else if(5<=sv[i].diem && sv[i].diem<6.5) {
				sv[i].hocLuc = "Trung Bình";
			}else if(6.5<=sv[i].diem && sv[i].diem<7.5) {
				sv[i].hocLuc = "Khá";
			}else if(7.5<=sv[i].diem && sv[i].diem<9) {
				sv[i].hocLuc = "Giỏi";
			}else if(9<=sv[i].diem) {
				sv[i].hocLuc = "Xuất sắc";
			}
			
		}
		System.out.println("Danh sách sinh viên vừa nhập");
		for (int i= 0; i < sv.length; i++) {
			System.out.println("Thứ tự số học sinh :"+i);
			System.out.println(" Họ và tên :" + sv[i].hoTen + "\n Điểm : " + sv[i].diem + "\n Học lực :" + sv[i].hocLuc);
		}
	}
}
