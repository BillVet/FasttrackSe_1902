package unit4;

public class HinhVuong extends HinhChuNhat{

	public HinhVuong(int chieuDai, int chieuRong,int canh) {
		super(chieuDai, chieuRong);
		// TODO Auto-generated constructor stub
	}
	
	
	public HinhVuong(int canh) {
		super(canh,canh);
		chieuDai=chieuRong=canh;
	}
	
	
	
	
	
	
	
	
//	public HinhVuong() {
//		
//	}
//	
//	public HinhVuong (int canh){
//		super(chieuDai, chieuRong);
//		chieuDai = chieuRong = canh;
//	}
//	public void xuat() {
//		System.out.println("Chu vi hinh vuong :" +getChuvi());
//		System.out.println("Dien tich hinh vuong :" +getDienTich());
//	}
}

