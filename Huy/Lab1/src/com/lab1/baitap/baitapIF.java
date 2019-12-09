package com.lab1.baitap;

import java.util.Scanner;

public class baitapIF {
	 public static void main(String[] args) {
		 int tiendien;
		 Scanner scanner = new Scanner(System.in);
		 
		 System.out.println("Nhap so kW dien moi");
		 int dienmoi = scanner.nextInt();
		 
		 System.out.println("Nhap so kW dien cu");
		 int diencu = scanner.nextInt();
		 
		 int a = dienmoi - diencu;
		 
		 if(a > 200) {
			  tiendien = (100*1000)+(50*1200)+(50*2000)+((a-200)*2500); 
		 }else if(a > 150) {
			 tiendien = (100*1000)+(50*1200)+((a-150)*2000);
		 }else if(a > 100 ) {
			  tiendien = (100*1000)+((a-100)*1200);
		 }else{
			 tiendien = a*1000;
		 }
		 
		 System.out.println("So tien dien phai tra la "+tiendien);
		 
	 }
}
