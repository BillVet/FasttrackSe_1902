package bai1;

public class myclass1 {
	public static void main(String[] args) {
		String tensp = null ;
		double dongia = 0;
		double giamgia = 0;
		demo3 d = new demo3(tensp, dongia, giamgia);
		demo3 d1 = new demo3(tensp, dongia);
		
		d.input();
		d1.input1();
		d.output();
		d1.output();
		
	}
}
