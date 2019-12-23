package lab4;

public class ChuNhat{
	public int dai;
	public int rong;
	public ChuNhat() {
		
	}
	public ChuNhat(int dai, int rong){
		this.dai = dai;
		this.rong = rong;
	}
	public int getChuVi(){
		int chuVi = (dai+rong)*2;
		return chuVi;
	}
	public int getDienTich(){
		int s = dai*rong;
		return s;
	}
	public void xuat() {
		System.out.println("chu vi hinh chu nhat la: "+getChuVi());
		System.out.println("dien tich hinh chu nhat la: "+getDienTich());
	}
}
