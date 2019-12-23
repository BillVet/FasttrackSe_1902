package lab4;


import java.util.Scanner;

public class SinhVienMain {
	public static void main(String[] args) {
		int choose;
		String it, biz;
		int java,html, css, marketting, sales;
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("1.sv it");
		System.out.println("2.sv biz");
		choose = scanner.nextInt();
			switch(choose) {
			case 1:
				System.out.println("nhap ten: ");
				it= scanner.nextLine();
				
				System.out.println("nhap diem java: ");
				java= Integer.parseInt(scanner.nextLine());
				
				System.out.println("nhap diem html: ");
				html= Integer.parseInt(scanner.nextLine());
				
				System.out.println("nhap diem css: ");
				css= Integer.parseInt(scanner.nextLine());
				
				SinhVienFpt svit =  new SinhVienIT(it,java,html,css);
				svit.getDiem();
				svit.getHocLuc();
				svit.xuat();
				break;
			case 2:
				System.out.println("nhap ten: ");
				biz= scanner.nextLine();
				System.out.println("nhap diem marketting: ");
				marketting= scanner.nextInt();
				System.out.println("nhap diem sales: ");
				sales= scanner.nextInt();
			
				SinhVienFpt svbiz =  new SinhVienBiz(biz,marketting,sales);
				svbiz.getDiem();
				svbiz.getHocLuc();
				svbiz.xuat();
				break;
			default:
				break;
		}
	}
}

