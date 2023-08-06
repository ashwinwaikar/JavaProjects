package mysqlconnection;

import java.sql.Connection;
import java.sql.DriverManager;

public final class ConnectionProvider {
	static Connection con = null;

	private ConnectionProvider() {

	}

	public static Connection factorymethod() {
		if (con == null) {
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				con = DriverManager.getConnection("jdbc:mysql://localhost:3306/logindemoo", "root", "root");
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return con;
	}

}