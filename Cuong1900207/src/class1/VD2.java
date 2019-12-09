package class1;

import java.util.Scanner;

public class VD2 {
	public static void main(String[] args) {
		String hovaten;
		int sbd;
		int diem;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Nhap ho va ten");
		hovaten = scanner.nextLine();
		
		System.out.println("Nhap SBD");
		sbd= scanner.nextInt();
		
		System.out.println("Nhap diem");
		diem = scanner.nextInt();
		
		System.out.println("Ho va ten: " + hovaten);
		System.out.println("So bao danh: " + sbd);
		System.out.println("Diem: " + diem);
	}
}
