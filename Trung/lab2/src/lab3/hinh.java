package lab3;

public class hinh {
	public double dai;
	public double rong;
	
	public void ChuNhat() {
		
	}

	public hinh(double dai, double rong) {
		super();
		this.dai = dai;
		this.rong = rong;
	}
	
	public double getChuVi() {
		double chuVi = (dai+rong)*2;
		return chuVi;
	}
	
	public double getDienTich() {
		double dienTich = dai*rong;
		return dienTich;
	}
	
	public void xuat() {
		System.out.println("Chu vi hinh chu nhat:" + getChuVi());
		System.out.println("Dien tich hinh chu nhat:" + getDienTich());
	}
}
