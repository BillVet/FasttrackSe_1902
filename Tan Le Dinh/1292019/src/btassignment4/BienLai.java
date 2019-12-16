package btassignment4;

import java.util.Scanner;

public class BienLai extends KhachHang{

	public double Somoi;
	public double Socu;
	public double tieuthu;
	Scanner s = new Scanner(System.in);
	
	public BienLai(String hoTen, String soNha, double maSo, double Somoi, double Socu) {
		super(hoTen, soNha, maSo);
		this.Somoi = Somoi;
		this.Socu = Socu;
	}
	
	@Override
	public double Chisotieuthu() {
		return (Somoi - Socu)*750;
	}
	
	public void xuat() {
		super.xuat();
		System.out.println("So dien moi: "+Somoi);
		System.out.println("So dien cu: "+Socu);
		System.out.println("So tien phai tra: "+Chisotieuthu());
	}
}
