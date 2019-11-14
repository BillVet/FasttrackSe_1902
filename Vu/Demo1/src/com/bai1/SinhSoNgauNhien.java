package com.bai1;

import java.text.DecimalFormat;
import java.util.Random;

public class SinhSoNgauNhien {

	public static void main(String[] args) {
		int soNgauNhien;
		DecimalFormat dcf = new DecimalFormat("#.##");
		Random rd = new Random();
		
		// sinh so ngau nhien
		soNgauNhien = 5 + rd.nextInt(12);
		
		// hien thi so ngau nhien
		System.out.println("So ngau nhien la "+soNgauNhien);
		
		// hien thi can bac 2
		System.out.println("Can bac 2 : "+Math.sqrt(soNgauNhien));
	}
}
