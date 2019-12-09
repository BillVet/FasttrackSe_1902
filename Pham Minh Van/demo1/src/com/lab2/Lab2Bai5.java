package com.lab2;

public class Lab2Bai5 {
	public static void main(String[] args) {
		int i = 2;
		for(i = 2; i<=9; i++) {
			System.out.println("Bảng cửu chương" + i + ": \n");
			for(int x = 1; x<=9; x++) {
				
				System.out.println(i + "x" + x + "=" + i*x + "\n");
			}
			System.out.println("------------------");
		}
	}
}
