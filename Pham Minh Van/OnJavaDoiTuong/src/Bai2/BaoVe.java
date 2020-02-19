package Bai2;

	import java.util.Scanner;

	public class BaoVe extends NhanVien{
		String caTruc;
		
	    public BaoVe()
	    {
	        super();
	    }
	    public BaoVe(String hoTen, int namSinh, double luong, String caTruc)
	    {
	        super(hoTen, luong, namSinh);
	        this.caTruc=caTruc;
	    }
	    public String getcaTruc()
	    {
	        return caTruc;
	    }
	
	    public void nhap()
	    {
	    super.nhap();
	    Scanner sc = new Scanner(System.in);
	    System.out.print("Nhập ca trực:\n");
	    caTruc = sc.nextLine();
	    }
	    public void xuat()
	    {
	    super.xuat();
	    System.out.println("Ca trực: \n"+ caTruc);

     }
	}
