package bttl;

import java.util.Scanner;

public class SinhVien {
	
	private String hoTen;
	private double diemTB;
	
	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}
	public String getHoTen(){  
        return this.hoTen;
	}
	public void setDiem(double diemTB){  
        if(diemTB < 0 || diemTB > 10){
        System.out.println("Diem khong hop le");
        }else {
        	this.diemTB = diemTB;
        }
	}
    public double getDiem() {  
        return this.diemTB;
    }
	
	Scanner sinhvien = new Scanner(System.in);
	
	public SinhVien() {
		
	}
	
	public SinhVien(String hoTen, double diemTB) {
		this.hoTen = hoTen;
		this.diemTB = diemTB;
	}
	
	public void nhap() {
		System.out.println("Nhap ho ten: ");
		hoTen = sinhvien.nextLine();
		
		System.out.println("Nhap diem TB: ");
		diemTB = sinhvien.nextDouble();
	}
	
	public void xepLoai() {
		if(diemTB<5) {
			System.out.println("Hoc luc: Yeu");
		}else if(diemTB>=5 && diemTB<6.5) {
			System.out.println("Hoc luc: Trung binh");
		}else if(diemTB>=6.5 && diemTB<7.5) {
			System.out.println("Hoc luc: Kha");
		}else if(diemTB>=7.5 && diemTB<9) {
			System.out.println("Hoc luc: Gioi");
		}else {
			System.out.println("Hoc luc: Xuat xac");
		}
	}
	
	public void xuat() {
		System.out.println("Ho ten: "+hoTen);
		System.out.println("Diem TB: "+diemTB);
	}
}
