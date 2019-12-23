package OnTap2;

public class XeMay extends PTGT{
	String congXuat;
	

	public XeMay(String hangSanXuat, String namSanXuat, String giaBan, String mau, String congXuat) {
		super(hangSanXuat, namSanXuat, giaBan, mau);
		this.congXuat = congXuat;
	}

	public String getCongXuat() {
		return congXuat;
	}

	public void setCongXuat(String congXuat) {
		this.congXuat = congXuat;
	}
	public void hienThongTin() {
		super.hienThongTin();
		System.out.println("Công xuất: " + this.congXuat);
	}
}
