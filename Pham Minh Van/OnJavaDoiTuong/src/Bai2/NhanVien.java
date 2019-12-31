package Bai2;

import java.util.Scanner;

public class NhanVien {
	public String chucVu;
	public  String caTruc;
	String hoTen;
	double luong;
	int namSinh;
	Scanner scanner = new Scanner(System.in);
	private Scanner sc;
	private int tuoi;
    public NhanVien(){
    }


    public NhanVien(String hoTen, double luong, int namSinh) {
		super();
		this.hoTen = hoTen;
		this.luong = luong;
		this.namSinh = namSinh;
	}


    public String  gethoTen()
    {
    return hoTen;
    }
    public void sethoTen(String hoTen) {
        this.hoTen = hoTen;
    
    }
    public int getnamSinh()
    {
    return namSinh;
    }
    public double getluong()
    {
    return luong;
    }

    public void nhap()
    {
        sc = new Scanner(System.in);
        System.out.print("Nhập họ tên: ");
    	hoTen = sc.nextLine();
        System.out.print("Nhập lương: ");        
        luong = sc.nextDouble();
        
    do
    {
        System.out.print("Nhập năm sinh (Phải sinh trước năm 2001(Đủ 18 tuổi mới cho làm =)))) \n ");
        namSinh = sc.nextInt();    
    }while(namSinh>2001);
    }
    public int tinhtuoi(int tuoi) {
    	tuoi = 2019 - namSinh;
    	return tuoi;
    }
    public void xuat()
    {
    	System.out.println("Họ tên: \t" + hoTen);
        System.out.println("lương: \t" + luong);
        System.out.println("Năm sinh: \t" + namSinh);
		System.out.println("Tuổi: \t" + tinhtuoi(tuoi));

		
       
    }
    public String setchucVu() {
    	return chucVu = "quanly";
    }
}

