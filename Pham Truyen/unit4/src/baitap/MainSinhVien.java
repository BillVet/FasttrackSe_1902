package baitap;

public class MainSinhVien {
	
//	static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		QuanLySinhVien quanLySinhVien = new QuanLySinhVien();
		quanLySinhVien.menu();
		
//		while(true){
//			System.out.println("Nhap ten: ");
//			String hoTen = scanner.nextLine();
//			System.out.println("Nhap nganh: ");
//			String nganh = scanner.nextLine();
//			if(nganh.trim().equalsIgnoreCase("it")) {
//				System.out.println("Diem Java: ");
//				double java = scanner.nextDouble();
//				System.out.println("Diem Html: ");
//				double html = scanner.nextDouble();
//				System.out.println("Diem Css: ");
//				double css = scanner.nextDouble();
//				SinhVien it = new SinhVienIT(hoTen, nganh, java, html, css);
//				SinhVien.add(it);
//				it.getDiem();
//				it.getHocLuc();
//			}else if (nganh.trim().equalsIgnoreCase("biz")) {
//				System.out.println("Diem Marketting: ");
//				double marketting = scanner.nextDouble();
//				System.out.println("Diem Sales: ");
//				double sales = scanner.nextDouble();
//				SinhVien biz = new SinhVienBiz(hoTen, nganh, marketting, sales);
//				SinhVien.add(biz);
//			}else {
//				System.out.println("Khong co nganh nay!");
//			}
//			
//			
//			
//			System.out.println("Nhap tiep (Y/N) ");
//			if(scanner.nextLine().equalsIgnoreCase("N")) {
//				break;
//			}
//		}
	}
}
