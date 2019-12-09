package bttl;

public class bangcuuchuong {
	public static void main(String[] args) {
		for(int i=2; i<=9; i++) {
		System.out.println();
			for(int j=1; j<=10;j++) {
				System.out.printf("%d x %d = %d", i, j, i*j);
				System.out.println();
			}
		}
	}
}
