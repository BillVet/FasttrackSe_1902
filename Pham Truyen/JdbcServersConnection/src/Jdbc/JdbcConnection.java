package Jdbc;

import java.sql.Connection;
import java.sql.DriverManager;

public class JdbcConnection {

	public static Connection getJdbcConnection() {
		String url = "jdbc:mysql://localhost:3306/ft1009";
		String user = "root";
		String password = "";

		try {
			Class.forName("com.mysql.jdbc.Driver");
			return DriverManager.getConnection(url, user, password);
		} catch (Exception e) {
			e.printStackTrace();
		}		
		return null;
	}

	public static void main(String[] args) {
		Connection connection = getJdbcConnection();
	}
}
