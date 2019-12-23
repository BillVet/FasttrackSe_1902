package lab4;
public class hinhvuong extends Hinh {
public  hinhvuong() {
}
public hinhvuong(int canh) {
	dai = rong = canh;
}
public void xuat() {
	System.out.println(" chu vi hinh vuong:"+getChuvi());
	System.out.println(" dien tich hinh vuong:"+getDienTich());
}
}
