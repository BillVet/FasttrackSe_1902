package com.lab2;
import java.util.Scanner;

class listsv{
	public String hoten ;
	public double diem ;
	public String hocluc;
}
public class SinhVien {

	public static void main(String[]args) {
		int n;
		System.out.println("nhap vao so sv");
		Scanner scanner=new Scanner(System.in);
		n = Integer.parseInt(scanner.nextLine());
		listsv[] sv= new listsv[n];		for (int i=0 ; i<n;i++) {
			System.out.println("nhap sv thu "+i);
			sv[i]=new listsv();

			System.out.println("nhap ten");
			sv[i].hoten = scanner.nextLine();

			System.out.println("nhap diem");
			sv[i].diem = Double.parseDouble(scanner.nextLine());

			if(sv[i].diem < 5) { 
				sv[i].hocluc ="yeu";
			}else if(5 <= sv[i].diem && sv[i].diem < 6.5) { 
				sv[i].hocluc ="trung binh";
			}else if(6.5 <= sv[i].diem && sv[i].diem < 7.5) { 
				sv[i].hocluc ="kha";
			}else if(7.5 <= sv[i].diem && sv[i].diem < 9) { 
				sv[i].hocluc ="gioi";
			}else {
				sv[i].hocluc =" xuat sac";
			}
		}	
		for (int i=0 ; i<n; i++) {
			System.out.println(sv[i].hoten);
			System.out.println(sv[i].diem);
			System.out.println(sv[i].hocluc);
		}
	}

}

