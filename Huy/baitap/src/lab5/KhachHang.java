package lab5;

import java.util.Scanner;

public class KhachHang extends Nguoi {
	public int soNgayTro;
	public String loaiPhong;
	public int gia;
	
	public int getSoNgayTro() {
		return soNgayTro;
	}
	public void setSoNgayTro(int soNgayTro) {
		this.soNgayTro = soNgayTro;
	}
	public String getLoaiPhong() {
		return loaiPhong;
	}
	public void setLoaiPhong(String loaiPhong) {
		this.loaiPhong = loaiPhong;
	}
	public int getGia() {
		return gia;
	}
	public void setGia(int gia) {
		this.gia = gia;
	}
	public KhachHang(int soNgayTro, String loaiPhong, int gia, String hoten, int tuoi, long cmnd) {
		super();
		this.soNgayTro = soNgayTro;
		this.loaiPhong = loaiPhong;
		this.gia = gia;
		this.hoten = hoten;
		this.tuoi = tuoi;
		this.cmnd = cmnd;
	}
	public KhachHang() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	void nhap(){
		Scanner scanner = new Scanner(System.in);
		System.out.print("Nhap ten khach hang: ");
		this.hoten = scanner.nextLine();
		
		System.out.print("Nhap tuoi khach hang: ");
		this.tuoi = scanner.nextInt();
		System.out.print("Nhap ma cmnd: ");
		this.cmnd = scanner.nextInt();
		System.out.print("Nhap loai phong: ");
		this.loaiPhong = scanner.nextLine();
		System.out.print("Nhap gia: ");
		this.gia = scanner.nextInt();
		System.out.print("Nhap so ngay da o: ");
		this.soNgayTro = scanner.nextInt();
		
	}
	public long tinhTien() {
		return (gia/30)*soNgayTro;
		
	}
	void xuat() {
		System.out.println("Ho va ten khach hang : "+this.hoten);
		System.out.println("Tuoi khach hang : "+this.tuoi);
		System.out.println("So cmnd : "+this.cmnd);
		
		System.out.println("Loai phong tro : "+this.loaiPhong);
		System.out.println("Gia tren thang: "+this.gia);
		System.out.println("So ngay da o : "+this.soNgayTro);
		System.out.println("So tien phai tra hien tai : "+tinhTien());
	}
	
}
