package lab3;

public class hinhvuong extends hinh {

	public void hinhvuong() {
		
	}
	
	public void hinhvuong(int canh) {
		dai = rong = canh;
	}
	
	public void xuat() {
		System.out.println("Chu vi hinh vuong :" + getChuVi());
		System.out.println("Dien tich hinh vuong :" + getDienTich());
	}
}
