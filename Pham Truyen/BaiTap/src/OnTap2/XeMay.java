package OnTap2;

public class XeMay extends PTGT{

	private String congSuat;

	public XeMay() {
		super();
	}

	public XeMay(String hangSX, int namSX, double giaBan, String mau, String congSuat) {
		super(hangSX, namSX, giaBan, mau);
		this.congSuat = congSuat;
	}
	
	public String getCongSuat() {
        return congSuat;
    }
	
    public void setCongSuat(String congSuat) {
        this.congSuat = congSuat;
    }
    
    public void nhap() {
    	super.nhap();
    	System.out.println("Nhap cong suat: ");
    	congSuat = scanner.nextLine();
    }
    
    public void xuat() {
    	super.xuat();
    	System.out.println("Cong suat: "+ congSuat);
    }
}
