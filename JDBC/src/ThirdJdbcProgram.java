import java.sql.*;
import java.util.Scanner;

//In this program we take input from the user and enter it to the database and further print on console
public class ThirdJdbcProgram {
	public static void main(String[] args) throws SQLException {
		Connection con = null;
		try {
			Scanner s = new Scanner(System.in);

//			Class.forName("com.mysql.jdbc.Driver");
			Class.forName("com.mysql.cj.jdbc.Driver");

			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/androjavatech4u", "root", "root");

			System.out.println("Enter your name");
			String name = s.next();
			System.out.println("Enter the ID");
			int id = s.nextInt();

			PreparedStatement st = con.prepareStatement("insert into user values(?,?)");
			st.setString(1, name);
			st.setInt(2, id);

			int i = st.executeUpdate();

			if (i > 0) {
				System.out.println("Record inserted");
			} else {
				System.out.println("Something went wrong");
			}

			ResultSet rs = st.executeQuery("select *from user");
			while (rs.next()) {
				System.out.println(rs.getString("NAME"));
				System.out.println(rs.getInt("ID"));
			}

		} catch (Exception e) {
			System.out.println(e);
		} finally {
			con.close();
		}
	}
}