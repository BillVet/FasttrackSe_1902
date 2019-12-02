package class1;

import java.util.Scanner;
public class VD2 {
	public static void main(String[] args) {
		String hovaten;
		int sbd;
		int diem;
		Scanner sanner = new Scanner(System.in);
		System.out.println("Nhap ho ten");
		hovaten = sanner.nextLine();
		System.out.println("Nhap sbd");
		sbd = sanner.nextInt();
		System.out.println("Nhap diem");
		diem = sanner.nextInt();
		System.out.println("Ho va ten: " + hovaten);
		System.out.println("SBD: " + sbd);
		System.out.println("Diem: " + diem);
	}
}
