package com.lab3;

public class demo1 {

	public static void main(String[] args) {
		
		int number = 7;
		for(int i = 1 ; i<=10;i++) {
			System.out.println(number+ " x " + i + "=" +number*i);
		}
		
		int j = 1;
		while(j<=10) {
			System.out.printf("%d x %d = %d %n",number,j,number*j);
			j++;
		}
		
		int k =1;
		do {
			System.out.printf("%d x %d = %d %n",number,k,number*k);
			k++;
			
		} while (k<=10);
	}
}
