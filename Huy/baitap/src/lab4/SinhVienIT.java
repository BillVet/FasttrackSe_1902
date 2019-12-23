package lab4;

public  class SinhVienIT extends  SinhVienFpt{
	public int java;
	public int html;
	public int css;
	@Override
	public double getDiem() {
		
		return ((2*java)+html+css)/4;
	}
	public SinhVienIT(){
		
	}
	public SinhVienIT( String hoTen, int java,int html,int css) {
		super();
		this.hoTen = hoTen;
		this.java = java;
		this.html = html;
		this.css = css;
	}
}
