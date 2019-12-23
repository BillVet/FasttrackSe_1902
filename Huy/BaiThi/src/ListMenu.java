import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class ListMenu {
	Scanner scanner = new Scanner(System.in);
	
	NhanVien nv;
	HanhChinh hc;
	TiepThi tt;
	TruongPhong tp;
	ArrayList<NhanVien> arr = new ArrayList<>();

	public void menu() {
		do {

			System.out.println("MENU");
			System.out.println("1. Nhập thông tin nhân viên từ bàn phím");
			System.out.println("2. Xuât thông tin tất cả nhân viên");
			System.out.println("3. Tìm thông tin nhân viên theo mã nhân viên");
			System.out.println("4. Xóa nhân viên theo mã nhân viên");
			System.out.println("5. Cập nhật thông tin nhân viên theo mã nhân viên");
			System.out.println("6. Tìm nhân viên theo khoảng lương");
			System.out.println("7. Sắp xếp nhân viên theo họ và tên");
			System.out.println("8. Sắp xếp nhân viên theo thu nhập");
			System.out.println("9. Xuất 5 nhân viên có thu nhập cao nhất");
			System.out.println("0. exit");
			System.out.println("-------------------------------------------");

			int choose = scanner.nextInt();

			switch(choose)
			{
			case 1:
				add();
				break;
			case 2:
				show();
				break;
			case 3:
				find();
				break;
			case 4:
				delete();
				break;
			case 5:
				update();
				break;
			case 6:
				findBySalary();
				break;
			case 7:
				sortByName();
				break;
			case 8:
				sortBySalary();
				break;
			case 9:
				top();
				break;
			case 0:
				System.exit(0);
			default:
				break;		
			}

		}while(true);
	}
	private void add() {
		boolean flag1 = false, flag2 = false;
		do {
			System.out.println("Nhập chức vụ nhân viên cần thêm:");
			System.out.println("1. Nhân Viên Hành Chính");
			System.out.println("2. Nhân Viên Tiếp Thị");
			System.out.println("3. Trưởng Phòng");
			int chon = scanner.nextInt();
			if(chon == 1) {
				hc = new HanhChinh();
				hc.nhap();
				for(NhanVien x : arr) {
					if(hc.id == x.id) {
						System.out.println("Id Nhân Viên Bị Trùng Lặp, Vui Lòng Bắt Đầu Lại");
						System.out.println("..............................................");
						flag2=true;
					}
				}
				if(flag2 == false) {
					hc.ten = hc.ten.trim();
					hc.ten = hc.ten.replaceAll("\\s+", " ");
					hc.ten =hc.ten.substring(0,1).toUpperCase() + hc.ten.substring(1).toLowerCase();
					
					String temp[] = hc.ten.split(" ");
					String hoTen="";
					for (int i = 0; i < temp.length; i++) {
			            hoTen += String.valueOf(temp[i].charAt(0)).toUpperCase() + temp[i].substring(1);
			            if (i < temp.length - 1)
			                hoTen += " ";
			        }
					hc.ten=hoTen;
					arr.add(hc);
				}
			}else if(chon == 2) {
				tt = new TiepThi();
				tt.nhap();
				for(NhanVien x : arr) {
					if(tt.id == x.id) {
						System.out.println("Id Nhân Viên Bị Trùng Lặp, Vui Lòng Bắt Đầu Lại");
						System.out.println("..............................................");
						flag2=true;
					}
				}
				if(flag2 == false) {
					arr.add(tt);
				}
			}else if(chon == 3){
				tp = new TruongPhong();
				tp.nhap();
				for(NhanVien x : arr) {
					if(tp.id == x.id) {
						System.out.println("Id Nhân Viên Bị Trùng Lặp, Vui Lòng Bắt Đầu Lại");
						System.out.println("..............................................");
						flag2=true;
					}
				}
				if(flag2 == false) {
					arr.add(tp);
				}
			}else {
				System.out.println("Vui Lòng Chọn Chính Xác");
				flag1 = true;
			}
		}while(flag1);


	}
	private void show() {
		for(NhanVien x: arr) {
			x.xuat();
		}

	}
	private void find() {
		boolean find = false, flag = false;
		do {
			System.out.println("Vui lòng nhập mã nhân viên cần hiển thị:");
			int id =scanner.nextInt();
			for(NhanVien x: arr) {
				if(x.id == id) {
					x.xuat();
					flag = true;
				}
			}
			if(flag == false) {
				System.out.println("Mã Nhân Viên Không Chính Xác");
				System.out.println("Bạn có muốn thử lại: 1. Có -- 2. Về Menu");
				int thulai = scanner.nextInt();
				if(thulai == 1) {
					find = true;
				}else {
					find=false;
				}
			}
		}while(find);

	}
	private void delete() {
		boolean delete = false, flag = false;
		do {
			System.out.println("Vui lòng nhập mã nhân viên cần xóa:");
			int id =scanner.nextInt();
			for(NhanVien x: arr) {
				if(x.id == id) {
					x.xuat();

					System.out.println("Bạn có chắc chắc muốn xóa nhân viên này không: nhấn 1 để xác nhận");
					int xoa = scanner.nextInt();
					if(xoa == 1) {
						arr.remove(x);
					}else {
						delete = false;
					}

					flag = true;
				}
			}
			if(flag == false) {
				System.out.println("Mã Nhân Viên Không Chính Xác");
				System.out.println("Bạn có muốn thử lại: 1. Có -- 2. Về Menu");
				int thulai = scanner.nextInt();
				if(thulai == 1) {
					delete = true;
				}else {
					delete=false;
				}
			}
		}while(delete);
	}
	private void update() {
		boolean update = false, flag = false;
		do {
			System.out.println("Vui lòng nhập mã nhân viên cần hiển thị:");
			int id =scanner.nextInt();
			for(NhanVien x: arr) {
				if(x.id == id) {
					x.xuat();
					x.nhap();
					flag = true;
				}
			}
			if(flag == false) {
				System.out.println("Mã Nhân Viên Không Chính Xác");
				System.out.println("Bạn có muốn thử lại: 1. Có -- 2. Về Menu");
				int thulai = scanner.nextInt();
				if(thulai == 1) {
					update = true;
				}else {
					update=false;
				}
			}
		}while(update);

	}
	private void findBySalary() {
		System.out.println("Nhập Khoảng Lương Cần Tìm:");
		System.out.println("Từ: ");
		double luongTu = Double.parseDouble(scanner.nextLine());
		System.out.println("Đến: ");
		double luongDen = Double.parseDouble(scanner.nextLine());
		for( NhanVien x: arr) {
			if(x.thuNhap >= luongTu && x.thueThuNhap <= luongDen) {
				x.xuat();
			}
		}

	}
	private void sortByName() {
		Collections.sort(arr, new Comparator<NhanVien>() {
			@Override
			public int compare(NhanVien nv1, NhanVien nv2) {
				return (nv1.ten.compareTo(nv2.ten));
			}
		});
	}
	private void sortBySalary() {
		Collections.sort(arr, new Comparator<NhanVien>() {
			@Override
			public int compare(NhanVien nv1, NhanVien nv2) {
				if (nv1.thuNhap < nv2.thuNhap) {
					return -1;
				} else {
					if (nv2.thuNhap == nv2.thuNhap) {
						return 0;
					} else {
						return 1;
					}
				}
			}
		});
	}
	private void top() {
		sortBySalary();
		int count = 0;
		for(NhanVien x: arr) {
			count+=1;
			if(count<=5) {
				x.xuat();
			}
		}
	}
	
	
	
}
