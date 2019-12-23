package OnTap2;

public class PTGT {
 	
	String hangSanXuat;
	String namSanXuat;
	String giaBan;
	String mau;
	public PTGT(String hangSanXuat, String namSanXuat, String giaBan, String mau) {
		super();
		this.hangSanXuat = hangSanXuat;
		this.namSanXuat = namSanXuat;
		this.giaBan = giaBan;
		this.mau = mau;
	}
	public String getHangSanXuat() {
		return hangSanXuat;
	}
	public void setHangSanXuat(String hangSanXuat) {
		this.hangSanXuat = hangSanXuat;
	}
	public String getNamSanXuat() {
		return namSanXuat;
	}
	public void setNamSanXuat(String namSanXuat) {
		this.namSanXuat = namSanXuat;
	}
	public String getGiaBan() {
		return giaBan;
	}
	public void setGiaBan(String giaBan) {
		this.giaBan = giaBan;
	}
	public String getMau() {
		return mau;
	}
	public void setMau(String mau) {
		this.mau = mau;
	}
    public void hienThongTin()
    {
        System.out.println("Hang san xuat: "+this.hangSanXuat);
        System.out.println("Nam san xuat: "+this.namSanXuat);
        System.out.println("Gia : "+this.giaBan);
        System.out.println("Mau: "+this.mau);
     
    }
}
