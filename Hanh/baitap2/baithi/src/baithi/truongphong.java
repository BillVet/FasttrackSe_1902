package baithi;

public abstract class truongphong extends nhanvien{
	public int luongtrachnhiem;
	private String manv;

	public truongphong(String hoten,String manv, String mucluong, int luongtrachnhiem) {
			super();
			this.hoten= hoten;
			this.manv=manv;
			this.mucluong=mucluong;
			this.luongtrachnhiem=luongtrachnhiem;
			
		}
	public void nhap() {
		super.nhap();
		System.out.print(" luong trach nhiem ");
	 	luongtrachnhiem = scanner.nextInt();
		
	}
	public void xuat() {
		super.xuat();
		System.out.println("luong trach nhiem"+luongtrachnhiem);
	}
		
	}


