package OnTap2;

import java.util.Scanner;

public class PTGT {

	private String hangSX;
	private int namSX;
	private double giaBan;
	private String mau;
	protected Scanner scanner;
	
	public PTGT() {
		super();
	}

	public PTGT(String hangSX, int namSX, double giaBan, String mau) {
		super();
		this.hangSX = hangSX;
		this.namSX = namSX;
		this.giaBan = giaBan;
		this.mau = mau;
	}
	
	public String getHangSX() {
        return hangSX;
    }
	
    public void setNgaySinh(String hangSX) {
        this.hangSX = hangSX;
    }
    
    public int getNamSX() {
    	return namSX;
    }
    
    public void setNamSX(int namSX) {
        this.namSX = namSX;
    }
    
    public double getGiaBan() {
    	return giaBan;
    }
    
    public void setGiaBan(double giaBan) {
        this.giaBan = giaBan;
    }
    
    public String getMau() {
    	return mau;
    }
    
    public void setMau(String mau) {
        this.mau = mau;
    }
    
    public void nhap() {
    	scanner = new Scanner(System.in);
    	
    	System.out.println("Nhap hang san xuat: ");
    	hangSX = scanner.nextLine();
    	System.out.println("Nhap nam san xuat: ");
    	namSX = Integer.parseInt(scanner.nextLine());
    	System.out.println("Nhap gia ban: ");
    	giaBan = Double.parseDouble(scanner.nextLine());
    	System.out.println("Nhap mau: ");
    	mau = scanner.nextLine();
    }
    
    public void xuat() {
    	System.out.println("Hang san xuat: "+ hangSX);
    	System.out.println("Nam san xuat: "+ namSX);
    	System.out.println("Gia ban: "+ giaBan);
    	System.out.println("Mau: "+ mau);
    }
}
