package kiemtra;

public class Nhanvientiepthi extends Nhanvien {
	public double luong;
	public double doanhso;
	public double hoahong;
	
	public Nhanvientiepthi(String ma, String hoTen,double luong, double doanhso, double hoahong) {
		super(ma, hoTen, luong);
		this.luong = luong;
		this.doanhso = doanhso;
		this.hoahong = hoahong;
	}
	
	@Override
	public double getLuong() {
		// TODO Auto-generated method stub
		return (luong+doanhso+hoahong);
	}
	
	public void xuat() {
		super.xuat();
		System.out.println("Luong nhan vien: "+luong);
		System.out.println("Luong doanh so: "+doanhso);
		System.out.println("Luong hoa hong: "+hoahong);
	}
}
