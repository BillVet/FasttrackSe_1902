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

	public double getDiem() {
		return (2*java + html + css)/4;
	}
}
