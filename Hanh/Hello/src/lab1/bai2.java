package baitap;

import java.util.Scanner;

public class bai2 {
 public static void main(String[]args) {
	 Scanner scanner = new Scanner(System.in);
 int a;
 int b; 
 int c;
 a = scanner.nextInt();
 b = scanner.nextInt();
 c = scanner.nextInt();
if (a==0) {
	if(b==0) {
		if (c==0) {
		System.out.println(" phuong trinh vo so nghiem");	
		}}else if(b != 0) {	
		System.out.println(" phuong trinh co 1 nghiem");	
	}else {
		System.out.println(" phuong trinh vo nghiem");		
	}
}else if (a !=0 ){
	int d = (b*b-4*a*c) ;
	if(d<0) {
		System.out.println(" phuong trinh vo nghiem");
	}else if(d==0) {
		int x= -b/(2*a)	;	
		System.out.println(" phuong trinh có 1 nghiem kep ");		
	}else {
		int x1=(-b+sqrt(d))/(2*a);
		int x2=(-b-sqrt(d))/(2*a);				
		System.out.println(" phuong trinh có 2 nghiem phan biêt ");
	}
	
}
	 
 }

private static int sqrt(int d) {
	// TODO Auto-generated method stub
	return 0;
}
}
