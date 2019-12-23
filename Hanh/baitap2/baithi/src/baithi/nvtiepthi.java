package baithi;

public class nvtiepthi extends nhanvien{
	public int doanhsobanhang;
	public int tylehuehong;
		
		public nvtiepthi(String hoten, String manv, String mucluong,  int doanhsobanhang, int tylehuehong ) {
			super();
			this.hoten=hoten;
			this.manv=manv;
			this.mucluong=mucluong;
			this.doanhsobanhang=doanhsobanhang;
			this.tylehuehong=tylehuehong;
			
			
			
}public double getthuethunhap() {
	return 0;
}
public void getmucthunhap() {
	 if(getthuethunhap()<9000000) {
		 mucluong =" mien thue";
		 
	 }else if(getthuethunhap()>=9000000 && getthuethunhap <15000000) {
		 mucluong =" phai dong 10% thue ";
	 }else {
		 mucluong= "phai dong 12% thue";
	 }
		 
	 }
public void nhap() {
	super.nhap();
	System.out.print(" doanh so ban hang ");
 	doanhsobanhang = scanner.nextInt();
 	System.out.print(" ty le hue hong ");
 	tylehuehong = scanner.nextInt();
}
public void xuat() {
	super.xuat();
	System.out.println("doanh so ban hang "+doanhsobanhang);
	System.out.println(" hue hong "+tylehuehong);
}
}
