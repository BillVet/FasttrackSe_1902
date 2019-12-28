package Lab3Demo2;

public class Main {

	public static void main(String[] args) {
		String fullname = null;
		int average = 0;
		SinhVien sv1 = new SinhVien();
		SinhVien sv2 = new SinhVien(fullname, average);
		sv1.input();
		sv2.input();
		sv1.output();
		sv2.output();

	}

}
