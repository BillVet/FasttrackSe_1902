package BaiTest;

import java.util.Scanner;

public class NVHanhChinh {

	String id;
	String ten;
	double luong;
	double thue;
	Scanner scanner = new Scanner(System.in);
	public NVHanhChinh() {
		super();
	}
	
	public NVHanhChinh(String id, String ten, double luong) {
		super();
		this.id = id;
		this.ten = ten;
		this.luong = luong;
	}
	
	 public NVHanhChinh(String ten2, String id2, double luong2, double tongLuong) {
		// TODO Auto-generated constructor stub
	}

	public String getid() {
	        return id;
	    }

	    public void setid(String id) {
	        this.id = id;
	    }

	    public String getten() {
	        return ten;
	    }

	    public void setten(String ten) {
	        this.ten = ten;
	    }

	    public double getluong() {
	        return luong;
	    }

	    public void setthue(double thue) {
	        this.thue = thue;
	    }
	    public double getthue() {
	        return thue;
	    }

	    public void setluong(double luong) {
	        this.luong = luong;
	    }



	public void showNV() {
		System.out.println("Mã nhân viên: \n" + id);
		System.out.println("Họ tên nhân viên: \n" + ten);
		System.out.println("Lương: \n" + luong);
		System.out.println("Thuế thu nhập: \n" + thue);
		
		
	}
	
	public double luong() {
        return luong;
    }
	
}