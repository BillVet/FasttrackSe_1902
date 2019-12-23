package bt4;

import java.util.Scanner;

public class KhachSan{

	private int soNgayTro;
    private String loaiPhong;
    private double giaPhong;
    private Nguoia nguoi;
	private Scanner scanner;    
    public KhachSan() {
        super();
    }
    public KhachSan(int soNgayTro, String loaiPhong, double giaPhong, Nguoia nguoi) {
        super();
        this.soNgayTro = soNgayTro;
        this.loaiPhong = loaiPhong;
        this.giaPhong = giaPhong;
        this.nguoi = nguoi;
    }
     
    public Nguoia getNguoi() {
        return nguoi;
    }
    public void setNguoi(Nguoia nguoi) {
        this.nguoi = nguoi;
    }
    public void nhap() {
        scanner = new Scanner(System.in);
         
        nguoi = new Nguoia();
        nguoi.nhap();
         
        System.out.print("Nhap so ngay tro: ");
        soNgayTro = Integer.parseInt(scanner.nextLine());
        System.out.print("Nhap loai phong: ");
        loaiPhong = scanner.nextLine();
        System.out.print("Nhap gia phong: ");
        giaPhong = scanner.nextDouble();
    }
  
    public void xuat() {
        nguoi.xuat();
        System.out.println("So ngay tro: " + soNgayTro);
        System.out.println("Loai phong: " + loaiPhong);
        System.out.println("Gia phong: " + giaPhong);
    }
    public double tinhTien() {
        return soNgayTro * giaPhong;
    }
}
