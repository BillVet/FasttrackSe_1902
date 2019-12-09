import java.util.Scanner;

public class Bai2 {
	public static void main(String[] args) {
		int dai;
		int rong;
		int chuvi;
		int dientich;
		Scanner sanner = new Scanner(System.in);
		System.out.println("Nhập chiều dài hình chữ nhật:");
		dai = sanner.nextInt();
		System.out.println("Nhập chiều rộng hình chữ nhật");
		rong = sanner.nextInt();
		chuvi = (dai + rong)*2;
		dientich= dai * rong;
		System.out.println("Chu vi: " + chuvi);
		System.out.println("Diện tích: " + dientich);
		System.out.println("Cạnh nhỏ nhất: " + Math.min(dai, rong));
	}
}
