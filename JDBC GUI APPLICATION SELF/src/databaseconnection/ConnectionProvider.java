package databaseconnection;

import java.sql.Connection;
import java.sql.DriverManager;

public final class ConnectionProvider {

	private ConnectionProvider() {// we made this class ConnectionProvider as a singleton class by using this
									// constructor
	}

	public static Connection getConnection() {
		Connection con = null;

		try {

			Class.forName("com.mysql.cj.jdbc.Driver");

			con = DriverManager.getConnection(DatabaseDetails.DATABASE_URL, DatabaseDetails.DATABASE_USERNAME,
					DatabaseDetails.DATABASE_PASSWORD);
		} catch (Exception e) {
			System.out.println(e);
		}
		return con;

	}
}