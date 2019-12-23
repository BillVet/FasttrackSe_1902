package baitap;

public class SinhVienIT extends SinhVien{

	public double java;
	public double html;
	public double css;
	
	public SinhVienIT(String hoTen, String nganh) {
		super(hoTen, nganh);
	}
	
	public SinhVienIT(String hoTen, String nganh, double java, double html, double css) {
		super(hoTen, nganh);
		this.java = java;
		this.html = html;
		this.css = css;
	}
	
	public void xuat() {
		super.xuat();
		System.out.println("Diem Css :"+java);
		System.out.println("Diem Java :"+html);
		System.out.println("Diem Html :"+css);
	}

	public double getDiemTrungBinh() {
		return (2*java + html + css)/4;
	}
}
