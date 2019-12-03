import java.util.Scanner;

public class Bai3 {
	public static void main(String[] args) {
		int canh;
		Scanner sanner = new Scanner(System.in);
		System.out.println("Nhập chiều dài cạnh của khối lập phương:");
		canh = sanner.nextInt();
		System.out.println("Thể tích khối lập phương: " + Math.pow(canh, 3));
	}
}
