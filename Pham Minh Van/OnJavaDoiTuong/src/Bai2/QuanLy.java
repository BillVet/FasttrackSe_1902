package Bai2;

import java.util.Scanner;

public class QuanLy extends NhanVien {
	String chucVu = "quanly";
	
    public QuanLy()
    {
        super();
    }
    public QuanLy(String hoTen, int namSinh, double luong, String caTruc, String chucVu)
    {
        super(hoTen, luong, namSinh);
        this.chucVu=chucVu;
    }
    public String getchucVu()
    {
        return chucVu;
    }
    
    public void nhap()
    {
    super.nhap();
    chucVu = "quanly";
    }
    public void xuat()
    {
    super.xuat();
    System.out.println("Chức vụ: "+ chucVu);
    }


}
