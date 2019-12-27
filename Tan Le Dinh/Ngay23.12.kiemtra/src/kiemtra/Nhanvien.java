package kiemtra;

abstract public class Nhanvien {
	public String ma;
	public String hoTen;
	public double luong;
	abstract public double getLuong();
	
	public Nhanvien(String ma, String hoTen, double luong) {
		super();
		this.ma = ma;
		this.hoTen = hoTen;
		this.luong = luong;
	}
	
//	public String getHocLuc() {
//		double diemTrungBinh = getDiemTrungBinh();
//		if(diemTrungBinh<5) {
//			return "Hoc luc yeu";
//		}else if(5<=diemTrungBinh && diemTrungBinh<6.5) {
//			return "Hoc luc trung binh";
//		}else if(6.5<=diemTrungBinh && diemTrungBinh<7.5) {
//			return "Hoc luc kha";
//		}else if(7.5<=diemTrungBinh && diemTrungBinh<9) {
//			return "Hoc luc gioi";
//		}else{
//			return "Hoc luc xuat sac";
//		}
//	}

	public void xuat() {
		System.out.println("Ma nhan vien :"+ma);
		System.out.println("Ho ten nhan vien :"+hoTen);
		System.out.println("Luong nhan vien :"+luong);
	}
}
