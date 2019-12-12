package lab4;

public class SinhVienBiz extends SinhVienFpt{
	public int marketting;
	public int sales;
	@Override
	public double getDiem() {
		// TODO Auto-generated method stub
		return ((2*marketting)+sales)/3;
	}
	public SinhVienBiz() {
		
	}
	public SinhVienBiz( String hoTen, int marketting,int sales) {
		super();
		this.hoTen = hoTen;
		this.marketting = marketting;
		this.sales = sales;
	}
}
