package packages;

import java.util.Scanner;

public class bt3 {
	public static void main(String[] args) {
		int chisomoi;
		int chisocu;
		int sodien;
		int tongtien;
		Scanner s = new Scanner(System.in);
		System.out.println("Nhập chỉ số mới: ");
		chisomoi = s.nextInt();
		System.out.println("Nhập chỉ số cũ: ");
		chisocu = s.nextInt();
		sodien = chisomoi - chisocu;
		if (sodien<101) {
			tongtien = sodien*1000;
			System.out.println("Chỉ số tiêu thụ: " + sodien);
			System.out.println("Số tiền cần trả: " + tongtien);
		} else {
			tongtien = (sodien-100)*1200 + 100*1000;
			System.out.println("Chỉ số tiêu thụ: " + sodien);
			System.out.println("Số tiền cần trả: " + tongtien);
		}
	}
}