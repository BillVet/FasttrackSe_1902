package OnTap1;

import java.util.ArrayList;
import java.util.Scanner;



public class Main {
	
	@SuppressWarnings("unused")
	private static Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) {
		
		HSHocSinh hshs = new HSHocSinh();
		
		while(true) {
		System.out.println("/****************************************/");
		System.out.println("1.  Nhập vào thông tin học sinh");
		System.out.println("2.  Hiển thị thông tin về mỗi cá nhân");
		System.out.println("3.  Hiển thị những học sinh sinh năm 1985 và quê Thái Nguyên");
		System.out.println("4.  Hiển thị ra màn hình những học sinh của lớp 10A1");
		System.out.println("0.  Kết thúc ");
		System.out.println("/****************************************/");
		
		
		
		
		int x = Integer.parseInt(scanner.nextLine()); 
		
		System.out.println("Chọn chức năng: " + x);
		switch (x) {
		case 1:
			hshs.inputHSHocSinh();
			break;
		case 2:
			hshs.showArray();
			break;
		case 3:
			hshs.find1985TN();
			break;
		case 4:
			hshs.find10a1();
			break;
		case 0:
			System.exit(0);
			break;
		}
		}	
}
}
