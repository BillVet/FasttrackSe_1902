package MySQL;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
public class HocSQL1 {
 public static void main(String[] args) {
	try {
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/quanlykhachhang","root","");
		PreparedStatement preparedStatement = connection.prepareStatement("insert into nhanvien values(?,?,?,?)");
		preparedStatement.setString(1, "M07");
		preparedStatement.setString(2, "Nguyễn Văn A");
		preparedStatement.setString(3, "M01");
		preparedStatement.setDate(4,new Date(2019, 12, 27));
		int them = preparedStatement.executeUpdate();
		System.out.println(them  + "Thêm thành công");
		
		ResultSet resultSet=  preparedStatement.executeQuery("SELECT * From nhanvien");
		while(resultSet.next()) {
			System.out.println(
					resultSet.getString(1)+"-"+
					resultSet.getString(2)+"-"+
					resultSet.getString(3)+"-"+
					resultSet.getDate(4));
		}
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
}
}
