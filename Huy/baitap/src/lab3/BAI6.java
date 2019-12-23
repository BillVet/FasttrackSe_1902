package lab3;

import java.util.Scanner;

class listSV{
	String hoten;
	double diem;
	String loai;
}

public class BAI6 {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int n;	
		
		do {
		    System.out.println("Nhap vao so hoc sinh: ");
		    n = Integer.parseInt(scanner.nextLine());
		} while (n < 0); 
		
		listSV[] sv = new listSV[n];
		        
		for (int i = 0; i < n; i++) {
			sv[i] = new listSV();
		    System.out.print("Nhap ten hoc sinh thu " + i + ": ");
		    sv[i].hoten =scanner.nextLine();
		    
		    System.out.print("Nhap diem hoc sinh thu " + i + ": ");
		    sv[i].diem = Double.parseDouble(scanner.nextLine());
		    
		    if(sv[i].diem < 5) {
		    	sv[i].loai = "chua dat";
		    }else {
		    	sv[i].loai ="dat";
		    }
		}
		listSV tg;
		for(int i = 0; i < n-1; i++) {
			for( int j = 1; j < n; j++) {
				if(sv[i].diem>sv[j].diem) {
					tg = sv[i];
					sv[i] = sv[j];
					sv[j] = tg;	
				}
			}

		}
		for(int i=0; i<n;i++) {
			System.out.println("sinh vien "+sv[i].hoten+" diem "+sv[i].diem+" hoc luc "+sv[i].loai);
		}
	}
}