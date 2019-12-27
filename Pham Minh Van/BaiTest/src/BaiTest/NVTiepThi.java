package BaiTest;

import java.util.Scanner;

public class NVTiepThi extends NVHanhChinh{
	Scanner scanner = new Scanner(System.in);
	double doanhSo;
	double hoaHong;

	public NVTiepThi() {
		super();
	}

	public NVTiepThi(String id, String ten, double luong, double doanhSo, double hoaHong) {
		super(id, ten, luong);
		this.doanhSo = doanhSo;
		this.hoaHong = hoaHong;
	}
	
	 public double getdoanhSo() {
	        return doanhSo;
	    }

	    public void setdoanhSo(double doanhSo) {
	        this.doanhSo = doanhSo;
	    }
	    public double gethoaHong() {
	        return hoaHong;
	    }

	    public void sethoaHong(double hoaHong) {
	        this.hoaHong = hoaHong;
	    }

	public String getid() {
        return id;
    }
	public void show() {
		System.out.println("Doanh số: \n" + id);
		System.out.println("Hoa Hồng: \n" + ten);
		System.out.println("Lương: \n" + luong);
		
	}
	
	
}