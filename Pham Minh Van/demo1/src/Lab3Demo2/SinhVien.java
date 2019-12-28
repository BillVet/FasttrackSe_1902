package Lab3Demo2;

	import java.util.Scanner;

	public class SinhVien {
			public String fullname;
			public int average;
			public String xepLoai;
			
			public SinhVien() {
				
			}
			
			public SinhVien(String fullname, int average) {
				super();
				this.fullname = fullname;
				this.average = average;
			}



			public void	 input() {
				@SuppressWarnings({ "resource", "unused" })
				Scanner scanner = new Scanner(System.in);
				System.out.println("Nhập tên sinh viên: ");
				fullname = scanner.nextLine();
				System.out.println("Nhập điểm trung bình: ");
				average = scanner.nextInt();
				
			}
			
			public String level() {
				if(average<5) {
					xepLoai = "Yếu";
				} else if (average>=5 && average<6.5) {
					xepLoai = "Trung bình";
				} else if (average>=6.5 && average<8) {
					xepLoai = "Khá";
				} else {
					xepLoai = "Giỏi";
				}
				return xepLoai;
				
			} 
			
			
			public void output() {
				System.out.println("Tên sinh viên: \n"+ fullname);
				System.out.println("Điểm: \n" + average);	
				System.out.println("Xếp loại: \n" + level());
			}
			

	}


