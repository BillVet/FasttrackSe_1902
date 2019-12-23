package OnTap2;

public class XeTai extends PTGT{
	
	private String trongTai;

	public XeTai() {
		super();
	}

	public XeTai(String hangSX, int namSX, double giaBan, String mau, String congSuat, String trongTai) {
		super(hangSX, namSX, giaBan, mau);
		this.trongTai = trongTai;
	}
	
	public String getCongSuat() {
        return trongTai;
    }
	
    public void setCongSuat(String trongTai) {
        this.trongTai = trongTai;
    }
    
    public void nhap() {
    	super.nhap();
    	System.out.println("Nhap trong tai: ");
    	trongTai = scanner.nextLine();
    }
    
    public void xuat() {
    	super.xuat();
    	System.out.println("Trong tai: "+ trongTai);
    }
}
