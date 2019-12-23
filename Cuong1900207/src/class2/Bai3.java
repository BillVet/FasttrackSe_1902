package class2;
import java.util.Scanner;
public class Bai3 {
	public static void main(String[] args) {
		int tieuthu;
		int tiendien;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Nhap vao so dien tieu thu: ");
		tieuthu=scanner.nextInt();
		
		if(tieuthu<=50) {
			tiendien=tieuthu*1000;
			System.out.println("So tien phai tra la: "+tiendien);
		}
		else {
			tiendien=50*1000+(tieuthu-50)*1200;
			System.out.println("So tien phai tra la: "+tiendien);
		}
	}
}
