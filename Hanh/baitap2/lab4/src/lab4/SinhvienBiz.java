package lab4;

public class SinhvienBiz extends SinhVien{
	public int Marketting;
	public int Sales;

	@Override
	public double getDiem() {
		// TODO Auto-generated method stub
		return (Marketting+Sales)/2;
		
	}
	public SinhvienBiz(String hoTen,int Marketting,int Sales) {
		super();
		this.hoTen=hoTen;
		this.Marketting=Marketting;
		this.Sales=Sales;
		
	}

}
