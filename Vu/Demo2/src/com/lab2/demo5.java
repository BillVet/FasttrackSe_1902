package com.lab2;

public class demo5 {
	
	public static void main(String[] args) {
		double a = 5 , b = 6 , c ;
		char chon = '+';
		
		switch (chon) {
		case '+':
			c=a+b;
			break;
		case '-':
			c=a-b;

		case 'X':
		case ':':
			System.out.println("Đang xây dựng"); 
			break;

		default:
			break;
		}
	}

}
