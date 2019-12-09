package class2;
import java.util.Scanner;
public class vd1 {
	public static void main(String[] args) {
		
		int sodiencu;
		int sodienmoi;
		double sodien;
		double tiendien;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Nhap vao so dien cu");
		sodiencu=scanner.nextInt();
		System.out.println("Nhap vao so dien moi");
		sodienmoi=scanner.nextInt();
		
		sodien= sodienmoi-sodiencu;
				
		if(sodien<=101) {
			tiendien= sodien*1000;
		}
		else if(sodien>101 && sodien<151) {
			tiendien = 100*1000+(sodien-100)*1200;
		}
		else if(sodien>=151 && sodien <= 200) {
			tiendien = 100*1000+50*1200+(sodien-150)*2000;
		}
		else {
			tiendien=100*1000+50*1200+50*2000+(sodien-200)*2500;
		}
			System.out.println("Chi so cu la: "+ sodiencu);
			System.out.println("Chi so moi la: "+ sodienmoi);
			System.out.println("So dien tieu thu la: "+ sodien);
			System.out.println("Tien phai tra la: "+ tiendien);
	}	
}
