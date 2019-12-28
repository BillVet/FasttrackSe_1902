package Lab3Demo;

import java.util.Scanner;

public class SanPham {
		public String name;
		public double price;
		public double sale;
		public double tax;
		
		
		public void	 input() {
			@SuppressWarnings({ "resource", "unused" })
			Scanner scanner = new Scanner(System.in);
			System.out.println("Nhập tên sản phẩm: ");
			name = scanner.nextLine();
			System.out.println("Nhập giá: ");
			price = scanner.nextDouble();
			System.out.println("Nhập giảm giá: ");
			sale = scanner.nextDouble();
			
		}
		
		public double incomeTax() {
			tax = price*10/100;
			return tax;
		}
		
		
		public void output() {
			System.out.println("Tên sản phẩm: \n"+ name);
			System.out.println("Đơn giá: \n" + price);
			System.out.println("Giảm giá: \n" + sale);
			System.out.println("Thuế nhập khẩu (10%): \n" + tax);
			
			
		}
		

}
