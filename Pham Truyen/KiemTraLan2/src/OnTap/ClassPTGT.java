package OnTap;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ClassPTGT {

	public static void main(String[] args) {
		try {
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ptgtcc?useUnicode=true&characterEncoding=utf-8","root","");
			PreparedStatement ps = con.prepareStatement("SELECT * FROM dongxe WHERE HangXe LIKE 'T%' AND LEN(HangXe) = 5");
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				System.out.println(""+rs.getString(1)+" - "+rs.getString(2)+" - "+rs.getInt(3));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
}
