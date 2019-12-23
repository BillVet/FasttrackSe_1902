package kiemtra;

public class Nhanvienhanhchanh extends Nhanvien {
	public double luong;
	
	public Nhanvienhanhchanh(String ma, String hoTen,double luong) {
		super(ma, hoTen, luong);
		this.luong = luong;
	}

	@Override
	public double getLuong() {
		// TODO Auto-generated method stub
		return (luong);
	}
	
	public void xuat() {
		super.xuat();
		System.out.println("Luong nhan vien hanh chanh: "+luong);
	}
}
