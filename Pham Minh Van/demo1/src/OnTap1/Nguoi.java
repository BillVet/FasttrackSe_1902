package OnTap1;

import java.util.Scanner;

public class Nguoi {
	String name;
	String birth;
	String adress;
	Scanner scanner = new Scanner(System.in);
	public Nguoi() {
		super();
	}
	public Nguoi(String name, String birth, String adress) {
		super();
		this.name = name;
		this.birth = birth;
		this.adress = adress;
	}
	public void show() {
		System.out.println("Họ tên sinh viên: \n" + name);
		System.out.println("Ngày sinh: \n" + birth);
		System.out.println("Quê quán: \n" + adress);
		
	}
	
	public String getadress() {
        return adress;
    }
	
}

