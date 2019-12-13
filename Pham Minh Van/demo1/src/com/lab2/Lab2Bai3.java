package com.lab2;

import java.util.Scanner;

public class Lab2Bai3 {

	public static void main(String[] args) {
		int number;
		
		
		
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Nhập chỉ số điện:");
		number = scanner.nextInt();
		
			
		
		if(number <= 50) {
			number = number*1000;
		} else {
			number = 50*1000 + (number - 50)*1200;
		}
		
		

		System.out.println("Tổng tiền cần thanh toán: \n" + number + "đồng");
		
		
	}
}
