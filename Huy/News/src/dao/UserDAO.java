package dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import connection.jdbcConnection;
import model.User;

public class UserDAO {	
	
	public String dangnhap(User user) {
		String name=null;
		try {
			Connection connect= jdbcConnection.getJdbcConnection();
			String sql="SELECT * FROM `user` where username=? and password=?";
			PreparedStatement ps= connect.prepareStatement(sql);
			ps.setString(1, user.getUsername());
			ps.setString(2, user.getPassword());
			
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				name = user.getUsername();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return name;
	}
}