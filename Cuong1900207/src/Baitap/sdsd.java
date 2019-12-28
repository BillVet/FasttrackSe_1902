package Bai6;

import java.util.Scanner;


public class SinhVien1 {
	
	String hoTen;
	double diem;
	String xepLoai;
	
	
	public void nhap() {
		int n;
		Scanner s = new Scanner(System.in);
		System.out.println("Nhap so sinh vien");
		n = s.nextInt();
		SinhVien1[] sv = new SinhVien1[n];
		for (int i=0;i<n;i++) {
			sv[i] = new SinhVien1();
			System.out.println("Nhap vao ten sinh vien: ");
			sv[i].hoTen = s.nextLine();
			System.out.println("Nhap vào diem: ");
			sv[i].diem = Double.parseDouble(s.nextLine());
			if (sv[i].diem < 5) {
				sv[i].xepLoai= "Hoc sinh yeu ";
			} else if( sv[i].diem <=5 && sv[i].diem <6.5  ){
				sv[i].xepLoai= "Hoc sinh trung binh ";
			} else if( sv[i].diem <=6.5 && sv[i].diem <7.5  ) {
				sv[i].xepLoai= "Hoc sinh Khá ";
			} else if( sv[i].diem <=7.5 && sv[i].diem <9  ) {
				sv[i].xepLoai= "Hoc sinh Goi ";
			} else {
				sv[i].xepLoai= "Hoc sinh Xuat sac ";
			}
		}
		for (int i=0; i< sv.length; i++) {
			System.out.println("Ten sinh vien: " + sv[i].hoTen );
			System.out.println("Diem sinh viên: " + sv[i].diem );
			System.out.println("Xep loai sinh viên: " + sv[i].xepLoai );
		}
	}

}