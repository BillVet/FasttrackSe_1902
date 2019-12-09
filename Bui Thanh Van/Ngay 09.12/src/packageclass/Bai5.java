package packageclass;
public class Bai5 {
 public static void main(String[] args) {
	 int a=2;
	 System.out.println("Bảng Cửu Chương 2");
	 for (int i=1; i<=10 ; i++) {
		 System.out.println(a + " x " + i + " = " + a*i);
		 if (i==10) {
			 a++;
			 i=0;
			 if (a==11) {
			 break;
		     }
			 System.out.println("Bảng Cửu Chương " + a);
		 }
		 
	 }
 }
}
