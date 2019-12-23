package OnTap2;

public class XeTai extends PTGT{
	String trongTai;
	
	public XeTai(String hangSanXuat, String namSanXuat, String giaBan, String mau, String trongTai) {
		super(hangSanXuat, namSanXuat, giaBan, mau);
		this.trongTai = trongTai;
	}

	public String getTrongTai() {
		return trongTai;
	}

	public void setTrongTai(String trongTai) {
		this.trongTai = trongTai;
	}
	
}
