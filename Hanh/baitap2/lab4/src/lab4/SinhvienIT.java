package lab4;
public class SinhvienIT extends SinhVien {
	public int java;
	public int html;
	public int Css;
	@Override
	public double getDiem() {
		// TODO Auto-generated method stub
		return (2*(java+html+Css))/4;
	}
	public SinhvienIT (String hoTen, int java,int html,int Css) {
		super();
		this.hoTen=hoTen;
		this.java=java;
		this.html=html;		
		this.Css=Css;
	}
	
}

