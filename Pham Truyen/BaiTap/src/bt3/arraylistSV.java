package bt3;

	import java.util.ArrayList;
	import java.util.Collections;
	import java.util.Comparator;
	import java.util.Scanner;



	public class arraylistSV {
	  public static SV sv = new SV();
	 public static ArrayList<SV> arr = new ArrayList<>();

	public static void main(String[] args) {

	do {
	Scanner scanner = new Scanner(System.in);
	System.out.println("MENU");
	System.out.println("1. Nhap danh sach ho va ten");
	System.out.println("2. Xuat danh sach vua nhap");
	System.out.println("3. Xuat ngau nhien danh sach vua nhap");
	System.out.println("4. Sap xep giam dan va xuat danh sach");
	System.out.println("5. Tim va xoa ho ten tu bam phim");
	System.out.println("6. exit");
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
	ramdom();
	break;
	case 4:
	sort();
	break;
	case 5:
	search();
	break;
	case 6:
	exit();
	break;
	default:
	break;
	}

	}while(true);


	}

	public static void add() {
	Scanner scanner = new Scanner(System.in);

	System.out.println("Nhap so sinh vien can them:");
	int n = scanner.nextInt();
	
	for(int i =0 ; i < n ; i++) {

	sv.nhap();
	arr.add(sv);

	}
	}
	public static void show() {
	for(SV x :arr) {
	sv.xuat();
	}
	}
	public static void ramdom() {
	Collections.shuffle(arr);
	for(SV x: arr) {
	sv.xuat();
	}
	}
	public static void sort() {
	Comparator<SV> compareByHoTen = (SV o1, SV o2) -> o1.getHoten().compareTo( o2.getHoten() );
	Collections.sort(arr, compareByHoTen);

	Collections.reverse(arr);
	show();
	}
	public static void search() {
	Scanner scanner = new Scanner(System.in);

	System.out.println("Nhap ten sinh en can xoa:");
	String hoten = scanner.nextLine();

	boolean flat = false;
	for(SV x : arr) {
	if(x.hoten.contentEquals(hoten)) {
	arr.remove(x);
	flat = true;
	break;
	}
	}
	if(flat ==false) {
	System.out.println("Khong co ten can xoa");
	}
	}
	static void exit() {
	System.out.println("Ket thuc chuong trinh");
	System.exit(0);
	}

	}

