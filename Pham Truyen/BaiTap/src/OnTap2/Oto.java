package OnTap2;

public class Oto extends PTGT{

	private int soChoNgoi;
	private String kieuDongCo;

	public Oto() {
		super();
	}

	public Oto(String hangSX, int namSX, double giaBan, String mau, String congSuat, int soChoNgoi, String kieuDongCo) {
		super(hangSX, namSX, giaBan, mau);
		this.soChoNgoi = soChoNgoi;
		this.kieuDongCo = kieuDongCo;
	}
	
	public int getSoChoNgoi() {
        return soChoNgoi;
    }
	
    public void setSoChoNgoi(int soChoNgoi) {
        this.soChoNgoi = soChoNgoi;
    }
    
    public String getKieuDongCo() {
        return kieuDongCo;
    }
	
    public void setKieuDongCo(String kieuDongCo) {
        this.kieuDongCo = kieuDongCo;
    }
    
    public void nhap() {
    	super.nhap();
    	System.out.println("Nhap so cho ngoi: ");
    	soChoNgoi = Integer.parseInt(scanner.nextLine());
    	System.out.println("Nhap kieu dong co: ");
    	kieuDongCo = scanner.nextLine();
    }
    
    public void xuat() {
    	super.xuat();
    	System.out.println("So cho ngoi: "+ soChoNgoi);
    	System.out.println("Kieu dong co: "+ kieuDongCo);
    }
}
