import java.sql.*;
import java.util.Scanner;

public class FourthJdbcProgram {

	public static void main(String[] args) throws SQLException {

		Connection conn = null;

		try {
			conn = ConnectionProvider.getConnection();

			PreparedStatement p = conn.prepareStatement("insert into user values(?,?)");

			Scanner s = new Scanner(System.in);
			System.out.println("Enter your name");
			String name = s.next();
			System.out.println("Enter your ID");
			int id = s.nextInt();

			p.setString(1, name);
			p.setInt(2, id);

			long i = p.executeUpdate();

			if (i > 0) {
				System.out.println("Record inserted succesfully");
			} else {
				System.out.println("Record not inserted");
			}
		} catch (Exception e) {
			System.out.println(e);
		} finally {
			conn.close();
		}
	}

}
