package lab4;

import java.util.Scanner;

public class mainsv {
	public static void main(String[]args) {
		int roll;
		String hoten;
		int java,html,Css,Marketting,Sales;
		Scanner scanner =new Scanner(System.in);
		System.out.println(" 1.svIT");
		System.out.println("2.svBiz");
		roll = scanner.nextInt();
		while(true) {
			switch(roll) {
			case 1:
				System.out.println("nhap ten");
				 hoten = scanner.nextLine();	
				 System.out.println("nhap diem java");
				 java = scanner.nextInt();
				 System.out.println("nhap diem html");
				 html = scanner.nextInt();
				 System.out.println("nhap diem css");
				 Css = scanner.nextInt();
				 SinhVien svIT= new SinhvienIT(hoten,java,html,Css);
				 svIT.getDiem();
				 svIT.getHocLuc();
				 svIT.xuat();
				 break;
			case 2:
				System.out.println("nhap ten");
				 hoten = scanner.nextLine();	
				 System.out.println("nhap diem marktting");
				 Marketting = scanner.nextInt();
				 System.out.println("nhap diem Sales");
				 Sales = scanner.nextInt();
				 SinhVien svBiz= new SinhvienBiz(hoten,Marketting,Sales);
				 svBiz.getDiem();
				 svBiz.getHocLuc();
				 svBiz.xuat();
				 break;
			 default:
					 break;
				 }
		}
	}
}
