package class1;

import java.util.Scanner;

public class Bai1 {
	public static void main(String[] args) {
		String hovaten;
		int diemtb;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Nhap ho va ten");
		hovaten=  scanner.nextLine();
		
		System.out.println("Nhap diem trung binh");
		diemtb= scanner.nextInt();
		
		System.out.println("Ho va ten: " + hovaten);
		System.out.println("Diem trung binh: " + diemtb);
	}
}
