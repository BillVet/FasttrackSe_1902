package baitap;

abstract public class SinhVien {

	public String hoTen;
	public String nganh;
	
	public SinhVien(String hoTen, String nganh) {
		super();
		this.hoTen = hoTen;
		this.nganh = nganh;
	}

	abstract public double getDiemTrungBinh();
	
	public String getHocLuc() {
		double diemTrungBinh = getDiemTrungBinh();
		if(diemTrungBinh<5) {
			return "Hoc luc yeu";
		}else if(5<=diemTrungBinh && diemTrungBinh<6.5) {
			return "Hoc luc trung binh";
		}else if(6.5<=diemTrungBinh && diemTrungBinh<7.5) {
			return "Hoc luc kha";
		}else if(7.5<=diemTrungBinh && diemTrungBinh<9) {
			return "Hoc luc gioi";
		}else{
			return "Hoc luc xuat sac";
		}
	}
	
	public void xuat() {
		System.out.println("Ho ten: " + hoTen + "\n Nganh: "+ nganh +"\n Diem: "+ getDiemTrungBinh() + "\n Hoc luc: "+ getHocLuc());
	}
}

