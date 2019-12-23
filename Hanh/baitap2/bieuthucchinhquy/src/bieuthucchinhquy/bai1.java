package bieuthucchinhquy;

public class bai1 {
	String HoTen;
	String email;
	int sdt;
	int CMND;
	public bai1(String HoTen,String email,int sdt,int CMND) {
		super();
		this.HoTen=HoTen;
		this.email=email;
		this.sdt=sdt;
		this.CMND=CMND;
		
	}
	public void xuat(){
		System.out.println("HoTen"+HoTen);
		System.out.println("email"+email);
		System.out.println("sdt"+sdt);
		System.out.println("CMND"+CMND);
	}
	
}
