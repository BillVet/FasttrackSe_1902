package class2;
import java.util.Scanner;
public class Bai4 {
	public static void main(String[] args) {
		int a;
		
		Scanner scanner = new Scanner(System.in);
		a=scanner.nextInt();
		
		switch(a)
		{
			case 1: {PhuongTrinhBac1()};
			break;
			case 2: {PhuongTrinhBac2()};
			break;
			case 3: {TinhTienDien()};
			break;
		}
		
		public static void menu() {
			System.out.println("----Menu----");
			System.out.println("1.Phương trình bậc 1");
			System.out.println("2.Phương trình bậc 1");
			System.out.println("3.Tính tiền điện");
			System.out.println("4.Kết thúc");
		}
		public static void PhuongTrinhBac1() {
			
		}
	}
}
