package ontap2;

import java.util.Scanner;

public class PTGT {
	public String hang, mau;
	public int nam, gia;
	public String getHang() {
		return hang;
	}
	public void setHang(String hang) {
		this.hang = hang;
	}
	public String getMau() {
		return mau;
	}
	public void setMau(String mau) {
		this.mau = mau;
	}
	public int getNam() {
		return nam;
	}
	public void setNam(int nam) {
		this.nam = nam;
	}
	public int getGia() {
		return gia;
	}
	public void setGia(int gia) {
		this.gia = gia;
	}
	void nhap() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhập tên hãng: ");
		this.hang = scanner.nextLine();
		System.out.println("Nhập màu xe: ");
		this.mau = scanner.nextLine();
		System.out.println("Nhập năm sản xuất: ");
		this.nam = Integer.parseInt(scanner.nextLine());
		System.out.println("Nhập giá: ");
		this.gia = Integer.parseInt(scanner.nextLine());
	}
}
