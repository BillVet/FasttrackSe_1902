package connect;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MySQLConnUtils {
	public static MySQLConnUtils getMySQLConnection()
			throws ClassNotFoundException, SQLException {
		String hostName = "localhost";
		String dbName = "mytest";
		String username = "root";
		String password = "";
		return getMySQLConnection(hostName, dbName, username, password);
	}

	public static MySQLConnUtils getMySQLConnection(String hostName, String dbName,
			String userName, String password) throws SQLException,
	ClassNotFoundException {

		Class.forName("com.mysql.jdbc.Driver");
		String connectionURL = "jdbc:mysql://localhost:3306/javaweb";

		java.sql.Connection conn = DriverManager.getConnection(connectionURL, userName,
				password);
		System.out.println("ok");
		return (MySQLConnUtils) conn;
	}
}
