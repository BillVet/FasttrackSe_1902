package ontap;

import java.util.Scanner;

public abstract class LopNguoi {

		public String hoten;
		public int ngaysinh;
		public String quequan;
		public LopNguoi() {
			
		}
	public LopNguoi(String hoten,int ngaysinh,String quequan) {
		this.hoten=hoten; 
		this.ngaysinh=ngaysinh;
		this.quequan=quequan;
	}
	public void xuat() {
		System.out.println("ho ten"+hoten);
		System.out.println("ngay sinh"+ngaysinh);
		System.out.println("que quan"+quequan);
	}
}
