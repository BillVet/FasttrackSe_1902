package kiemtra;

public class Truongphong extends Nhanvien {
	public double luong;
	public double trachnhiem;
	
	public Truongphong(String ma, String hoTen,double luong, double trachnhiem) {
		super(ma, hoTen, luong);
		this.luong = luong;
		this.trachnhiem = trachnhiem;
	}
	
	@Override
	public double getLuong() {
		// TODO Auto-generated method stub
		return (luong+trachnhiem);
	}
	
	public void xuat() {
		super.xuat();
		System.out.println("Luong truong phong: "+luong);
		System.out.println("Luong trach nhiem: "+trachnhiem);
	}
}
