package lb3;

import java.util.Scanner;

class SinhVien {
		int Id;
		String Name;
		int Age;
		String Adr;
		double gpa;
	}
public class B3T {
	public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	System.out.println("---MENU---");
	System.out.println("1:Add Student");
	System.out.println("2:Update Student by ID");
	System.out.println("3:Detele Stutdent by ID");
	System.out.println("4:Arrange Student Name");
	System.out.println("5:Show list Student");
	System.out.println("0:End");
	int choice = scanner.nextInt();
	switch (choice) {
	case 0:
		end();
		break;
	case 1:
		addst();
		break;
	case 2:
		update();
		break;
	case 3:
		delete();
		break;
	case 4:
		arrange();
		break;
	case 5:
		show();
		break;
		}
	}
	public static void end() {}
	public static void addst() {}
	public static void update() {}
	public static void delete() {}
	public static void arrange() {}
	public static void show() {}
}
