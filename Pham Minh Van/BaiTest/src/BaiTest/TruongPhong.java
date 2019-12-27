package BaiTest;

import java.util.Scanner;

public class TruongPhong extends NVHanhChinh{
	double luongTN;
	Scanner scanner = new Scanner(System.in);

	public TruongPhong() {
		super();
	}

	public TruongPhong(String id, String ten, double luong, double doanhSo, double hoaHong, double luongTN) {
		super(id, ten, luong);
		this.luongTN = luongTN;
	}
	
	 public double getluongTN() {
	        return luongTN;
	    }

	    public void setluongTN(double luongTN) {
	        this.luongTN = luongTN;
	    }
	public String getid() {
        return id;
    }
	public void show() {
		System.out.println("Lương trách nhiệm: \n" + luongTN);
		System.out.println("Lương: \n" + luong);
		
	}
	
	
}