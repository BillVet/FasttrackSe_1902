package packageclass;

import java.util.Scanner;

public class class1 {
	public static void main(String[] args) {
		int chisomoi;
		int chisocu;
		int sodien;
		double tongtien;
		Scanner s = new Scanner(System.in);
		System.out.println("Nhập chỉ số mới: ");
		chisomoi = s.nextInt();
		System.out.println("Nhập chỉ số cũ: ");
		chisocu = s.nextInt();
		sodien = chisomoi - chisocu;
		if (sodien<101) {
			tongtien = sodien*1000;
		} else if (sodien<151 && sodien >100) {
			tongtien = (sodien-100)*1200 + 100*1000;
		} else if (sodien<201 && sodien >150) {
			tongtien = (sodien-150)*2000 + 100*1000 + 50*1200;
		} else {
			tongtien = (sodien-200)*2500 + 100*1000 + 50*1200 + 50*2000;
		}
		System.out.println("Chỉ số điện: " + sodien);
		System.out.println("Số tiền cần trả: " + tongtien);
	}
}
