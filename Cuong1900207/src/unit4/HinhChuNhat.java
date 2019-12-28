package unit4;

public class HinhChuNhat{
	public double chieuDai;
	double chieuRong;
	double chuVi;
	double dienTich;
	
	public HinhChuNhat(double chieuDai, double chieuRong) {
		super();
		this.chieuDai = chieuDai;
		this.chieuRong = chieuRong;
	}
	public void getChuVi() {
		chuVi = (chieuDai + chieuRong)*2;
		System.out.println("Chu vi la : "+chuVi);
		
	}
	public void getDienTich() {
		dienTich=(chieuDai*chieuRong);
		System.out.println("Dien tich la : "+dienTich);
	}
	
	
}
