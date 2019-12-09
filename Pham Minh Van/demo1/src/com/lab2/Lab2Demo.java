package com.lab2;

import java.util.Scanner;

public class Lab2Demo {

	public static void main(String[] args) {
		int cu;
		int moi;
		
		
		
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Nhập chỉ số điện cũ:");
		cu = scanner.nextInt();
		
		System.out.println("Nhập chỉ số điện mới:");
		moi = scanner.nextInt();
		int tong = moi - cu;
		if(moi < cu) {
			System.out.println("chỉ số mới nhập sai !!!! ");
		} else {
			
			System.out.println("chỉ số điện tổng cần thanh toán: \n" + tong);
		}
		
		
		if(tong <= 100) {
			tong = tong*1000;
		} else if (101 <= tong && tong <= 150 ) {
			tong = (100*1000)+(tong-100)*1200;
		} else if (151 <= tong && tong <= 200) {
			tong = (100*1000)+(50*1200)+(tong-150)*2000;
		}else if (tong > 200) {
			tong = (100*1000)+(50*1200)+(150*2000)+(tong-200)*2500;
		}
		
		

		System.out.println("Tổng tiền cần thanh toán: \n" + tong + "đồng");
		
		
	}
}
