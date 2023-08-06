import java.sql.*;

public class FirstProgram {

	public static void main(String[] args) throws SQLException {
		Connection con = null;
		try {
//		Class.forName("com.mysql.jdbc.Driver");
			Class.forName("com.mysql.cj.jdbc.Driver");

			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/androjavatech4u", "root", "root");
			System.out.println(con);

			Statement st = con.createStatement();

			long i = st.executeUpdate("insert into user values ('Rucha',1234)");
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