package bttl;

import java.util.ArrayList;

public class MangNhanVien {
	
	public static void main(String[] args) {
		ArrayList<NhanVien> nv = new ArrayList<NhanVien>();
		NhanVien nv1 = new NhanVien("Nguyen Van A", "nguyenA123@gmail.com", "0357722324", 231456473);
		NhanVien nv2 = new NhanVien("Nguyen Van B", "nguyenB123@gmail.com", "0357722337", 231456454);
		NhanVien nv3 = new NhanVien("Nguyen Van C", "nguyenC123@gmail.com", "0355222321", 231456562);
		NhanVien nv4 = new NhanVien("Nguyen Van D", "nguyenD123@gmail.com", "0323145353", 231455353);
		NhanVien nv5 = new NhanVien("Nguyen Van E", "nguyenE123@gmail.com", "0357722343", 231476246);
		
		nv.add(nv1); nv.add(nv2); nv.add(nv3); nv.add(nv4); nv.add(nv5);
		
		for (NhanVien nhanVien : nv) {
			System.out.println(nhanVien.toString());
		}
	}
}
