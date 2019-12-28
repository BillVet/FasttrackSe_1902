package classquanly;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class functionlogin {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Moi ban nhap ten dang nhap: ");
		String user = sc.nextLine();

		System.out.println("Moi ban nhap mat khau: ");
		String pass = sc.nextLine();

		try {
			if(user.equals("") || pass.equals("")) {
				System.out.println("Vui long nhap lai");
			}else {
				Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/quanlydaotao,'root',''");

				String sqlLogin = "Select * from users where username=? and password=?";
				PreparedStatement ps = con.prepareStatement(sqlLogin);

				ps.setString(1, user);
				ps.setString(2, pass);

				ResultSet rs = ps.executeQuery();
				if(rs.next()) {
					System.out.println("Dang nhap thanh cong");

					
//					String chucnang = rs.getString(3);
//					if(chucnang.equals("canbo")) {						
//						System.out.println("Xin chao can bo: ");
//
//						while(true) {
//							System.out.println("---------QUAN LY SINH VIEN---------");
//							System.out.println("1.Xem danh sach sinh vien          ");
//							System.out.println("2.Them moi sinh vien               ");
//							System.out.println("3.Sua thong tin sinh vien          ");
//							System.out.println("4.Xoa sinh vien                    ");
//							System.out.println("5.Dang xuat                       ");
//
//							System.out.println("Lua chon phim chuc nang: ");
//							String chon = sc.nextLine();
//
//							switch (chon) {
//							case "1":
//								xem();
//								{
//									ResultSet resultSet = ps.executeQuery("select * from students");
//
//									while(resultSet.next()) {
//										System.out.println(resultSet.getString(1)+"-"+resultSet.getString(2)+"-"+resultSet.getString(3));
//									}
//									con.close();
//								};
//								break;
//							case "2":
//								//									them();
//								break;
//							case "3":
//								//									sua();
//								break;
//							case "4":
//								//									xoa();
//								break;
//							case "5":
//								sc.close();
//								System.exit(0);
//								break;
//							default:
//								break;
//							}
//						}
//					}else if(chucnang.equals("giangvien")) {
//						System.out.println("Xin chao giang vien");
//
//						ResultSet resultSet = ps.executeQuery("select * from students");
//
//						while(resultSet.next()) {
//							System.out.println(resultSet.getString(1)+"-"+resultSet.getString(2)+"-"+resultSet.getString(3));
//						}
//						con.close();
//					}
				}else {
					System.out.println("Dang nhap that bai");
				}
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
