import java.util.Scanner;

public class Bai1 {
	public static void main(String[] args) {
		String hovaten;
		double diemtrungbinh;
		Scanner sanner = new Scanner(System.in);
		System.out.println("Nhập họ và tên:");
		hovaten = sanner.nextLine();
		System.out.println("Nhập điểm trung bình");
		diemtrungbinh = sanner.nextDouble();
		System.out.println("Họ và tên: " + hovaten);
		System.out.println("Điểm trung bình: " + diemtrungbinh);
	}
}
