package as4;

import java.util.Scanner;

public class BienLai{
	public int id;
	public int name;
	public int age;
	public int address;
	public int phone;
	public int code;
	public int newNum;
	public int oldNum;
	public int tienDien;
	
	public BienLai(){
		
	}
	
	public BienLai(int id, int name, int age, int address, int phone, int code, int newNum, int oldNum) {
		super();
		this.id =id;
		this.name = name;
		this.age= age;
		this.phone =phone;
		this.code =code;
		this.newNum = newNum;
		this.oldNum = oldNum;
	}
	public int tienDien() {
		return (newNum - oldNum)*750;
	}
	public void xuat() {
		System.out.println("ID: "+id);
		System.out.println("Nguoi su dung dien: " +name);
		System.out.println("tuoi: "+age);
		System.out.println("dia chi: "+address);
		System.out.println("so dien thoai: "+phone);
		System.out.println("ma so cong to dien: "+code);
		System.out.println("chi so dien moi: "+newNum);
		System.out.println("chi so dien cu : "+oldNum);
		System.out.println("so tien phai thanh toan: "+tienDien());
	}
}
