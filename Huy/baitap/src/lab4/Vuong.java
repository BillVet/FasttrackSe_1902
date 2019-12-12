package lab4;

public class Vuong extends ChuNhat {
	public Vuong() {
		
	}
	public Vuong(int canh) {
		dai = rong = canh;
	}
	public void xuat() {
		System.out.println("chu vi hinh vuong: "+getChuVi());
		System.out.println("dien tich hinh vuong: "+getDienTich());
	}
}
