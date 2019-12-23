package OnTap1;

import java.util.ArrayList;
import java.util.Scanner;

public class HSHocSinh extends Nguoi{
	Scanner scanner = new Scanner(System.in);
	String classID;
	String course;
	String semester;
	
	String checkNgaySinh= "[0-9]{2}\\/[0-9]{2}\\/[0-9]{4}";
	 ArrayList<HSHocSinh> mangHS = new ArrayList<>();
	
	
	public HSHocSinh() {
		super();
	}

	public HSHocSinh(String classID, String course, String semester,String name,String birth, String adress) {
		super(name, birth, adress);
		this.classID = classID;
		this.course = course;
		this.semester = semester;
	}
	
	public String getclassID() {
        return classID;
    }
	  
	  public void showHS() {
			System.out.println("Lớp: \n" + classID);
			System.out.println("Khóa học: \n" + course);
			System.out.println("Kỳ học: \n" + semester);
		}
	public void inputHSHocSinh() {
		System.out.println("Nhập vào số học sinh:");
		int n = Integer.parseInt(scanner.nextLine());
		
		for (int i = 0; i < n; i++) {
			HSHocSinh hshs = new HSHocSinh(); 
            System.out.println("Nhập thông tin học sinh thứ " + (i + 1) + ": ");
            System.out.println("Nhập họ tên:");
            hshs.name = scanner.nextLine();
			System.out.println("Nhập ngày sinh (xx/xx/xxxx):");
			hshs.birth = scanner.nextLine();
			while (true) {
				if(hshs.birth.matches(checkNgaySinh)) {
					break;
				} else {
					System.out.println("Nhập sai định dạng ngày sinh: ");
					hshs.birth = scanner.nextLine();
				}
			}
			System.out.println("Nhập quê quán (Nhập có dấu mới nhận nha ^^):");	
			hshs.adress = scanner.nextLine();
			System.out.print("Nhập lớp: ");
			hshs.classID = scanner.nextLine();
	        System.out.print("Khóa học: ");
	        hshs.course = scanner.nextLine();
	        System.out.print("Kỳ học: ");
	        hshs.semester = scanner.nextLine();
            mangHS.add(hshs);
        }
		
	}
		public void showArray() {
			for (int i = 0; i < mangHS.size(); i++) {
	            System.out.println("\nThông tin học sinh thứ " + (i+1) + ": ");
	            mangHS.get(i).show();
	            mangHS.get(i).showHS();
	        }
			
		}
	  
		 public void find1985TN() {
			  System.out.println("\nNhững Học Sinh sinh năm 1985 và có quê ở Thái Nguyên là: ");
				String check= "[0-9]{2}\\/[0-9]{2}\\/1985";
		      for (int i = 0; i < mangHS.size(); i++) {
		          if (mangHS.get(i).getadress().equalsIgnoreCase("Thái Nguyên") && mangHS.get(i).birth.matches(check) ) {
		              mangHS.get(i).show();
		              mangHS.get(i).showHS();
		          } else {
		          	System.out.println("Không có sinh viên như điệu kiện");
		          }
		      }
		}
		
	  public void find10a1() {
		  System.out.println("\nNhững Học Sinh học lớp 10A1 là: ");
	        for (int i = 0; i < mangHS.size(); i++) {
	            if (mangHS.get(i).getclassID().equalsIgnoreCase("10A1")) {
	                mangHS.get(i).show();
	                mangHS.get(i).showHS();
	            } else {
	            	System.out.println("Không có sinh viên như điệu kiện");
	            }
	        }
	  }
	 


}



