package lab4;

public class Hinh {
	public double rong;
	public double dai;
	public Hinh() {
		
	}
	public Hinh(double dai, double rong) {
		super();	
		this.rong=rong;
		this.dai =dai;
		
	}
	public double getChuvi() {
		double chuvi= (dai+rong)*2;
		return chuvi;
	}
	public double getDienTich() {
		double dientich= (dai*rong);
		return dientich;
	}
	public void xuat() {
		System.out.println(" chu vi hinh chu nhat:"+getChuvi());
		System.out.println(" dien tich hinh chu nhat:"+getDienTich());
	}
	
}