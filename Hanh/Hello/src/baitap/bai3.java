package baitap;

import java.util.Scanner;

public class bai3 {
 public static void main(String[]args) {
	Scanner scanner=new Scanner(System.in) ;
	int sodien;
	System.out.print(" so dien");
	sodien = scanner.nextInt();
 if(sodien >50) {
	System.out.println(" so tien"+(sodien*1000));
 }else {
	
	System.out.println(" so tien"+(50*1000+(sodien-50)*1200));
}
}
}
